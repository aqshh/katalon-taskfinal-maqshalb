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

WebUI.callTestCase(findTestCase('TC_Juice/TC_Create Account'), [('Email') : Email, ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC_Juice/Block/Login'), [('Email') : Email, ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Juice/Add Address/Button_Account'))

WebUI.click(findTestObject('Juice/Add Address/Button_OrdersPayment'))

WebUI.click(findTestObject('Juice/Add Address/Button_MySavedAddress'))

WebUI.click(findTestObject('Juice/Add Address/Button_AddNewAddress'))

WebUI.setText(findTestObject('Juice/Add Address/input_Country'), Country)

WebUI.setText(findTestObject('Juice/Add Address/input_Name'), Name)

WebUI.setText(findTestObject('Juice/Add Address/input_MobileNumber'), MNumber)

WebUI.setText(findTestObject('Juice/Add Address/input_ZipCode'), ZCode)

WebUI.setText(findTestObject('Juice/Add Address/textarea_Address'), Address)

WebUI.setText(findTestObject('Juice/Add Address/input_City'), City)

WebUI.setText(findTestObject('Juice/Add Address/input_State'), State)

WebUI.click(findTestObject('Juice/Add Address/button_send  Submit'))

WebUI.verifyElementText(findTestObject('Juice/Add Address/mat-TitleName'), Name)

