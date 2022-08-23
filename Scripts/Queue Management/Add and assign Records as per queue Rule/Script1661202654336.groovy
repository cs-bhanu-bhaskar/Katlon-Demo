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

CustomKeywords.'customKeys.Login.login'()

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/assignment_automation/queues/')

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Create New Queue'))

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/input_Queue Name_name_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'Automation Queue One')

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/textarea_Queue Description_description'), 'Automation Queue Desc')

'Select Alert Module'
WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_Alerts'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Next Define Rules'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Add Rule'))

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/input_Rule Name_rule-name-0'), 'Alert On Create')

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/a_ADD CONDITION'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Select a field'))

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/input_Select a field_search-input'), 'Seve')

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/a_Severity'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/span_Severity'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_High'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Next Define Members'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_UserA One'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/span_Set the queue leader'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_CS Admin (me)'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Next Configure User Assignment'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Round Robin'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/input_Enable Shift-Based Assignment_require-shift'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/span_Save and Close'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Queue  Shift Management/div_The queue has been saved successfully'), 
    'The queue has been saved successfully.')

