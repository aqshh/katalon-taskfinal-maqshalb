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

WebUI.callTestCase(findTestCase('TC_Juice/Block/Browser URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Juice/Login/span_Dismiss'))

WebUI.click(findTestObject('Object Repository/Juice/Login/span_Account'))

WebUI.click(findTestObject('Object Repository/Juice/Login/button_exit_to_app  Login'))

WebUI.setText(findTestObject('Object Repository/Juice/Login/input_Login_email'), Email)

WebUI.setEncryptedText(findTestObject('Object Repository/Juice/Login/input_Email_password'), Password)

WebUI.click(findTestObject('Object Repository/Juice/Login/button_exit_to_app  Log in'))

WebUI.click(findTestObject('Object Repository/Juice/Login/button_account_circle  Account'))

WebUI.click(findTestObject('Juice/Login/background'), 
    FailureHandling.STOP_ON_FAILURE)
