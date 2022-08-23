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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/security/people')

WebUI.click(findTestObject('Object Repository/Page_Users  Security/input_First Name_firstname'))

WebUI.setText(findTestObject('Object Repository/Page_Users  Security/input_First Name_firstname_1_2_3_4_5'), 'userb')

WebUI.click(findTestObject('Object Repository/Page_Users  Security/div_UserB'))

WebUI.scrollToElement(findTestObject('Page_UserB One  Users  Security/button_Reset Password'), 0)

WebUI.click(findTestObject('Page_UserB One  Users  Security/button_Reset Password'))

WebUI.setEncryptedText(findTestObject('Page_UserB One  Users  Security/input__newPassword'), 'RZ1j3CHA4q4OkeRjqEcdnw==')

WebUI.setEncryptedText(findTestObject('Page_UserB One  Users  Security/input__confirmPassword'), 'RZ1j3CHA4q4OkeRjqEcdnw==')

WebUI.click(findTestObject('Object Repository/Page_UserB One  Users  Security/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_UserB One  Users  Security/div_Password changed successfully'), 
    'Password changed successfully.')

WebUI.click(findTestObject('Object Repository/Page_UserB One  Users  Security/img_UserB One_userpic margin-top-2'))

WebUI.click(findTestObject('Object Repository/Page_UserB One  Users  Security/a_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_FortiSOAR/input_Username_login_username'), 'userb1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FortiSOAR/input_Password_login_password'), 'RZ1j3CHA4q4OkeRjqEcdnw==')

WebUI.click(findTestObject('Object Repository/Page_FortiSOAR/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/span_Dashboard'), 'Dashboard')

