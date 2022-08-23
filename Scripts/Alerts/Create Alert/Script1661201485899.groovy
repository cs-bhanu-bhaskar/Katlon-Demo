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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/modules/alerts')

WebUI.click(findTestObject('Object Repository/Page_Alerts/span_Add_icon icon-add margin-right-sm'))

WebUI.setText(findTestObject('Object Repository/Page_Add Alert  Alerts/input__name'), 'Alert From Automation 01')

WebUI.setText(findTestObject('Object Repository/Page_Add Alert  Alerts/input__name_1_2_3_4_5_6_7_8'), 'Alert From Automation 01')

WebUI.scrollToElement(findTestObject('Page_Add Alert  Alerts/span_Low'), 0)

WebUI.click(findTestObject('Page_Add Alert  Alerts/span_Low'))

WebUI.click(findTestObject('Object Repository/Page_Add Alert  Alerts/div_High'))

WebUI.click(findTestObject('Object Repository/Page_Add Alert  Alerts/span_Select'))

WebUI.click(findTestObject('Object Repository/Page_Add Alert  Alerts/div_CS Admin (me)'))

WebUI.click(findTestObject('Object Repository/Page_Add Alert  Alerts/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alert From Automation 01  Alert/p_Alert From Automation 01'), 
    'Alert From Automation 01')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Alert From Automation 01  Alert/span_High'), 'High')

