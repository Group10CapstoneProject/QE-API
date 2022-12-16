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

Response = WS.sendRequest(findTestObject('Login/1positif/Login valid account'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 200, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login admin'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 403, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login superadmin'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 200, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login valid email, invalid pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login email-pass, pass-email'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid email, valid pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid email and invalid pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login empty email'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/login empty pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login empty email, empty pass'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login without body data'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid format body'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid HTTP method'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 405, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid email (2 space)'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid pass (2 space)'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 400, FailureHandling.CONTINUE_ON_FAILURE)

Response = WS.sendRequest(findTestObject('Login/Login invalid url'), FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyResponseStatusCode(Response, 404, FailureHandling.CONTINUE_ON_FAILURE)

