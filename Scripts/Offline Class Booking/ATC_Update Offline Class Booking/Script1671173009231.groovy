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

response = WS.sendRequest(findTestObject('Booking Offline Class/Get All Offline Class Booking/1Positive/Get All Offline Booking Admin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

JsonSlurper slurper = new JsonSlurper()

Map parsedJson = slurper.parseText(response.getResponseText())

String ID = parsedJson.data.offline_class_bookings.reverse()[0].id

GlobalVariable.ID = ID

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/1Positive/Update Offline Booking Admin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/1Positive/Update Offline Booking User'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 403, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking without token'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking invalid Token'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 401, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking invalid format body'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking without body'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 200, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking invalid HTTP'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 405, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking with minus ID'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

response = WS.sendRequest(findTestObject('Booking Offline Class/Update Offline Class Booking/Update Offline Booking without ID'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(response, 404, FailureHandling.CONTINUE_ON_FAILURE)

