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

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/editor/navigation')

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/input_Credit Cards_modules-credit_cards'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/button_Add To Menu'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/button_Credit Cards_edit-name-10'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/span_None'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/span_None_fa fa-glass'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/span_Credit Cards_icon icon-check text-success'))

WebUI.click(findTestObject('Object Repository/Page_Navigation Editor  Application Editor/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Full App Permissions  Roles  Security/span_User Community_fa-fw fa fa fa-glass'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Credit Cards/span_Credit Cards'), 'Credit Cards')

