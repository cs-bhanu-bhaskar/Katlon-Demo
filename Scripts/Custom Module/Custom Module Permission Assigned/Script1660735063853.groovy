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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/security/roles')

'Click full app permissions roles'
WebUI.click(findTestObject('Object Repository/Page_Roles  Security/div_Full App Permissions'))

'Providee full access on credit card module'
WebUI.click(findTestObject('Object Repository/Page_Full App Permissions  Roles  Security/span_Credit Cards_icon icon-add'))

'click save button'
WebUI.click(findTestObject('Object Repository/Page_Full App Permissions  Roles  Security/button_Save'))

'Verify save roles toaster message comes up'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Full App Permissions  Roles  Security/div_Role saved. Any changes to your permiss_6e6b1d'), 
    'Role saved. Any changes to your permissions should be reflected now.')

'verify Create access checkbox is checked'
WebUI.verifyElementChecked(findTestObject('Page_Full App Permissions  Roles  Security/input_Credit Cards_Credit Cards-Create'), 
    0)

'verify update access checkbox is checked'
WebUI.verifyElementChecked(findTestObject('Page_Full App Permissions  Roles  Security/input_Credit Cards_Credit Cards-Update'), 
    0)

'verify Delete access checkbox is checked'
WebUI.verifyElementChecked(findTestObject('Page_Full App Permissions  Roles  Security/input_Credit Cards_Credit Cards-Delete'), 
    0)

'Verify save button is disabled'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Full App Permissions  Roles  Security/button_Save'))

