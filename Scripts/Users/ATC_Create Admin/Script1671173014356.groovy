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

int RN

RN = ((Math.random() * 500) as int)

GlobalVariable.random = RN

code = WS.sendRequest(findTestObject('Create Admin/1Positive/Create Admin Super Admin'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 200, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid body format'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid email'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid endpoint'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 404, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid name'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin invalid Http method'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 405, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin without email'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin without name'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin without pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

code = WS.sendRequest(findTestObject('Create Admin/Create admin without body'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(code, 400, FailureHandling.CONTINUE_ON_FAILURE)

