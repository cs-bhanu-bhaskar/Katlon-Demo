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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/assignment_automation/shifts/')

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/button_Generate Shifts'))

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/input_Shift name_name'), 'Automation Current Shift')

WebUI.setText(findTestObject('Object Repository/Page_Queue  Shift Management/input_Duration (Hours)_duration_hours'), '24')

'Click Select Shift Member'
WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_UserB One'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/span_Set the shift leader'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/div_CS Admin (me)'))

WebUI.click(findTestObject('Object Repository/Page_Queue  Shift Management/span_Generate'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Queue  Shift Management/div_Automation Current Shift'), 'Automation Current Shift')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Queue  Shift Management/span_CS Admin'), 'CS Admin')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Current Shift  Shift/span_UserB One'), 'UserB One')

