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

WebUI.click(findTestObject('Object Repository/Page_Automation Playbook Collection  Collec_4b5c86/button_Add Playbook'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Playbook Collection  Collec_4b5c86/input__name_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'Automation Create Alert Record Playbook')

WebUI.click(findTestObject('Page_Automation Playbook Collection  Collec_4b5c86/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/div_Manual'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/label_Does not require a record input to run'))

'Select Module On Manual Trigger Window'
WebUI.click(findTestObject('Custom Test Obj/Playbook/Select Module'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/div_Alerts'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/span_Save Playbook'))

WebUI.dragAndDropByOffset(findTestObject('Page_Automation Create Alert Record Playboo_6d1b71/div_Drag and drop any highlighted connector_752b6b'), 
    200, 200)

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/span_Create Record'))

'Select Module on Create record window'
WebUI.click(findTestObject('Custom Test Obj/Playbook/Create Resord Select Module'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/input__stepName'), 'Create Alert')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/select_Select an OptionAlertsAnnouncementsA_588099'), 
    'string:/api/3/alerts', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/input__name'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/input__name_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'), 
    'Automation Alert 01')

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/button_Low'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/div_High'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/span_Save Playbook'))

CustomKeywords.'customKeys.Wait.hardWait'(5)

'Play playbook'
WebUI.click(findTestObject('Custom Test Obj/Playbook/Trigger Playbook'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/button_Trigger Playbook'))

WebUI.click(findTestObject('Object Repository/Page_Automation Create Alert Record Playboo_6d1b71/i_(Picklist)_icon icon-close'))

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/modules/alerts')

CustomKeywords.'customKeys.Wait.hardWait'(10)

WebUI.click(findTestObject('Object Repository/Page_Alerts/input_Name_name'))

WebUI.setText(findTestObject('Object Repository/Page_Alerts/input_Name_name_1_2_3'), 'Automation Alert 01')

WebUI.click(findTestObject('Object Repository/Page_Alerts/div_Automation Alert 01'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Alert 01  Alert/p_Automation Alert 01'), 'Automation Alert 01')

