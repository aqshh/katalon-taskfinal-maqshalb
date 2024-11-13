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

WebUI.click(findTestObject('Juice/Add Payment/Button_OrdersPayment'))

WebUI.click(findTestObject('Juice/Add Payment/Button_My Payment Options'))

WebUI.click(findTestObject('Juice/Add Payment/mat-panel-title_Add new card'))

WebUI.setText(findTestObject('Juice/Add Payment/input_CCName'), CCName)

WebUI.setText(findTestObject('Juice/Add Payment/input_CardNumber'), CCNumber)

WebUI.selectOptionByValue(findTestObject('Juice/Add Payment/select_Month'), CCMonth, true)

WebUI.selectOptionByValue(findTestObject('Juice/Add Payment/select_Year'), CCYear, true)

WebUI.click(findTestObject('Juice/Add Payment/Button_Submit'))

WebUI.verifyElementText(findTestObject('Juice/Add Payment/mat-cell_TittleCCName'), CCName)

