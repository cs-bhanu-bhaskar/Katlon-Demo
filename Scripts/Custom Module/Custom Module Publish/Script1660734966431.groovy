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

'Log in to FSR'
CustomKeywords.'customKeys.Login.login'()

'Click Settings button'
WebUI.click(findTestObject('Object Repository/Page_Application Configuration  System Conf_5dcc8b/i_Application Configuration_icon icon-setti_60b5c7'))

'Click modules'
WebUI.click(findTestObject('Object Repository/Page_Application Configuration  System Conf_5dcc8b/a_Modules'))

'Enter Module Name'
WebUI.setText(findTestObject('Object Repository/Page_Modules  Application Editor/input_Singular_singularName'), 'Credit Card')

'Click Field Editor'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/a_Fields Editor'))

'Click add field'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_Fields_attribute-add-btn-top'))

'enter Field name "CVV"'
WebUI.setText(findTestObject('Object Repository/Page_Modules  Application Editor/input__attributeSingular'), 'CVV')

'click apply'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_Apply'))

'Click add field'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/span_Fields_icon icon-add'))

'Enter field name "card number"'
WebUI.setText(findTestObject('Object Repository/Page_Modules  Application Editor/input__attributeSingular'), 'Card Number')

'Click apply button '
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_Apply'))

'Click summary tab'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/a_Summary'))

'Click Display Name'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/div__displayName'))

'Click Option card number'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/div_Card Number'))

'Verify save button is enabled\r\n'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Modules  Application Editor/button_Save'))

'Click save button'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_Save'))

'Verify publish is enabled'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Modules  Application Editor/button_Publish All Modules'))

'Clcik publish button'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_Publish All Modules'))

'Click Ok button on confirmation pop up'
WebUI.click(findTestObject('Object Repository/Page_Modules  Application Editor/button_OK'))

'Wait until publish page is not stale'
CustomKeywords.'customKeys.Wait.waitUntilElementIsNotStale'(findTestObject('Custom Test Obj/MMD/Publish Page'), 10)

CustomKeywords.'customKeys.Wait.hardWait'(60)

'Wait until publish button is not stale'
CustomKeywords.'customKeys.Wait.waitUntilElementIsNotStale'(findTestObject('Custom Test Obj/Publish Button'), 10)

'verify publish button is disabled'
WebUI.verifyElementNotClickable(findTestObject('Custom Test Obj/Publish Button'))

'Verify Option credit card is displayed under the select module dropdown'
WebUI.verifyOptionSelectedByValue(findTestObject('Object Repository/Page_Modules  Application Editor/select_Create new moduleAgentsAlertsAnnounc_2c099f'), 
    'Credit Cards', false, 10)

