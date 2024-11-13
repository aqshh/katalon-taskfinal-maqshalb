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

WebUI.click(findTestObject('Juice/Create Account/Button_Dismiss'))

WebUI.click(findTestObject('Juice/Create Account/Button Account'))

WebUI.click(findTestObject('Juice/Create Account/Button Login'))

WebUI.click(findTestObject('Juice/Create Account/div_Not yet a customer'))

WebUI.setText(findTestObject('Juice/Create Account/input_RegisterEmail'), Email)

WebUI.setEncryptedText(findTestObject('Juice/Create Account/input_RegisterPassword'), Password)

WebUI.setEncryptedText(findTestObject('Juice/Create Account/input_Password must be 5-40 characters long_eeca64'), Password)

WebUI.click(findTestObject('Juice/Create Account/span_SecurityDropdown'))

WebUI.click(findTestObject('Juice/Create Account/span_Your eldest siblings middle name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Juice/Create Account/input_SecurityAnswer'), 'tole')

WebUI.click(findTestObject('Juice/Create Account/Button_Register'))

WebUI.verifyElementText(findTestObject('Juice/Create Account/h1_Login'), 'Login', FailureHandling.OPTIONAL)

