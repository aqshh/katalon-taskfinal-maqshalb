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

WebUI.callTestCase(findTestCase('TC_Juice/Block/Add Address'), [('Country') : Country, ('Name') : Name, ('MNumber') : MNumber
        , ('ZCode') : ZCode, ('Address') : Address, ('State') : State, ('City') : City], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Juice/Add Payment/Button_Account'))

WebUI.callTestCase(findTestCase('TC_Juice/Block/Add Payment'), [('CCName') : CCName, ('CCNumber') : CCNumber, ('CCMonth') : CCMounth
        , ('CCYear') : CCYear], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Juice/Buying Products/button_OWASP Juice Shop'))

WebUI.click(findTestObject('Juice/Buying Products/Button_Add to Basket'))

WebUI.click(findTestObject('Juice/Buying Products/button_Add to Basket_1'))

WebUI.click(findTestObject('Juice/Buying Products/button_Add to Basket_1_2_3'))

WebUI.click(findTestObject('Juice/Buying Products/button_cart'))

WebUI.click(findTestObject('Juice/Buying Products/button_Checkout'))

WebUI.click(findTestObject('Juice/Buying Products/span_RadioAddress'))

WebUI.click(findTestObject('Juice/Buying Products/button_navigate_next Continue'))

WebUI.click(Delivery)

select_delivery = Delivery

//TestObject to = Delivery
//String selector = to.getSelectorCollection().get(to.getSelectorMethod())
WebUI.click(findTestObject('Juice/Buying Products/button_navigate_next Continue'))

WebUI.click(findTestObject('Juice/Buying Products/span_RadioPayment'))

WebUI.click(findTestObject('Juice/Buying Products/button_navigate_next Continue'))

WebUI.click(findTestObject('Juice/Buying Products/button_Place your order and pay'))

WebUI.verifyElementText(findTestObject('Juice/Buying Products/h1_Thank you for your purchase'), 'Thank you for your purchase!')

//WebUI.verifyElementText(findTestObject('Juice/Buying Products/div_Your order will be delivered in XXX days'), 'Your order will be delivered in 3 days.')
switch (select_delivery) {
    case selec_delivery = 'TestObject - \'Object Repository/Juice/Buying Products/span_Delivery1Day\'':
        WebUI.verifyElementText(findTestObject('Juice/Buying Products/div_Your order will be delivered in XXX days'), 'Your order will be delivered in 1 days.')

        break
    case selec_delivery = 'TestObject - \'Object Repository/Juice/Buying Products/span_Delivery3Day\'':
        WebUI.verifyElementText(findTestObject('Juice/Buying Products/div_Your order will be delivered in XXX days'), 'Your order will be delivered in 3 days.')

        break
    case selec_delivery = 'TestObject - \'Object Repository/Juice/Buying Products/span_Delivery5Day\'':
        WebUI.verifyElementText(findTestObject('Juice/Buying Products/div_Your order will be delivered in XXX days'), 'Your order will be delivered in 5 days.')

        break
}

