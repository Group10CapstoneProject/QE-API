import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper as JsonSlurper

response = WS.sendRequest(findTestObject('Login/1positif/Login valid account'))

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String Token = parsedJson.data.refresh_token

GlobalVariable.RefreshToken = Token

response = WS.sendRequest(findTestObject('Generate token/Generate new token'))

WS.verifyResponseStatusCode(response, 200)

response = WS.sendRequest(findTestObject('Generate token/Generate invalid format data'))

WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Generate token/Generate without body'))

WS.verifyResponseStatusCode(response, 400)

response = WS.sendRequest(findTestObject('Generate token/Generate invalid url'))

WS.verifyResponseStatusCode(response, 404)

response = WS.sendRequest(findTestObject('Generate token/Generate invalid HTTP method'))

WS.verifyResponseStatusCode(response, 405)

response = WS.sendRequest(findTestObject('Generate token/Generate with empty token'))

WS.verifyResponseStatusCode(response, 400)

