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

response = WS.sendRequest(findTestObject('Member Type/Get All Member Types/1Positive/Get All Member Types admin'), FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String ID = parsedJson.data.reverse()[0].id

GlobalVariable.ID = ID

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/1Positive/Delete Member Type Admin'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/1Positive/Delete Member Type User'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 403, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/Delete Member without token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/Delete Member invalid Token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 401, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/Delete Member No ID'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 404, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Member Type/Delete Member Type/Delete Member minus ID'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

