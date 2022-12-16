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

response = WS.sendRequest(findTestObject('Get Member History/1Positive/Get Member with user member token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member with valid admin member token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 403, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member Non member token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 401, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member invalid token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 401, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member User without token'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member invalid URL'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 404, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Get Member History/Get Member invalid HTTP Method'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 405, FailureHandling.CONTINUE_ON_FAILURE)

