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

WebUI.callTestCase(findTestCase('TC_TODO/Block/Create Task'), [('TaskTitle') : TaskTitle, ('Task') : Task, ('TimeHours') : TimeHours
        , ('TimeMinutes') : TimeMinutes], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('TODO/1.Dashboard/1.1.TaskOption/android.widget.ImageButton - TaskOption'), 0)

Mobile.tap(findTestObject('TODO/1.Dashboard/1.1.TaskOption/android.widget.TextView - Edit'), 0)

Mobile.setText(findTestObject('Object Repository/TODO/3.Create Task/android.widget.EditText - Enter task title'), eTaskTitle, 
    0)

Mobile.setText(findTestObject('Object Repository/TODO/3.Create Task/android.widget.EditText - Enter your task'), eTask, 
    0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.view.View - Date-16'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.Button - DateOK'), 0)

Mobile.tap(findTestObject('TODO/3.Create Task/android.widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('TODO/3.Create Task/3.1.SetTimeText/android.widget.SetTimeText Button'), 0)

Mobile.setText(findTestObject('TODO/3.Create Task/3.1.SetTimeText/android.widget.EditText - SetTimeText Hours'), eTimeHours, 
    0)

Mobile.setText(findTestObject('TODO/3.Create Task/3.1.SetTimeText/android.widget.EditText - SetTimeText Minutes'), eTimeMinutes, 
    0)

Mobile.tap(findTestObject('TODO/3.Create Task/3.1.SetTimeText/android.widget.CheckedTextView - SetTimeTextAMPM'), 0)

Mobile.tap(findTestObject('TODO/3.Create Task/3.1.SetTimeText/android.widget.CheckedTextView - PM'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.Button - TimeOK'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.TextView - SelectCategory'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.CheckedTextView - Personal'), 0)

Mobile.tap(findTestObject('Object Repository/TODO/3.Create Task/android.widget.CreateTask'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/TODO/3.Create Task/android.widget.TextView - Dashboard TaskTitle'), 
    eTaskTitle)

Mobile.closeApplication()

