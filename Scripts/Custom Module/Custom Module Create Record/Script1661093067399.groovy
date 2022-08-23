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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/modules/credit_cards')

WebUI.click(findTestObject('Object Repository/Page_Credit Cards/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_Card Number_cardNumber_1'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_Card Number_cardNumber_1_2'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_Card Number_cardNumber_1_2_3'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_Card Number_cardNumber_1_2_3_4'), 
    '1234567')

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_Card Number_cardNumber_1_2_3_4_5_6'), 
    '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/input_CVV_cVV_1_2_3'), '1234')

WebUI.click(findTestObject('Object Repository/Page_Add Credit Card  Credit Cards/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_12345678  Credit Card/span_Credit Card 12345678'), 'Credit Card: 12345678')

