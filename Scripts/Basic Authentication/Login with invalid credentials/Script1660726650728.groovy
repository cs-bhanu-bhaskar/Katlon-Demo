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

'Enter Username'
WebUI.setText(findTestObject('Object Repository/Page_FortiSOAR_login/input_Username_login_username'), 'csadmin')

'Enter Password'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_FortiSOAR_login/input_Password_login_password'), 'OLxtyiC0zV80JJMUR0OOuQ==')

WebUI.click(findTestObject('Object Repository/Page_FortiSOAR_login/button_Login'))

'Verify invalid login error message text is correct'
WebUI.verifyElementText(findTestObject('Object Repository/Page_FortiSOAR_login/span_Invalid username or password'), 'Invalid username or password')

'Verify invalid login error message is visible'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_FortiSOAR_login/span_Invalid username or password'))

