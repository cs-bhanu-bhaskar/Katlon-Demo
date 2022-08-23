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

CustomKeywords.'customKeys.Wait.hardWait'(60)

WebUI.navigateToUrl('https://qa-env11-ova.fortisoar.in/playbooks/collections/')

WebUI.click(findTestObject('Object Repository/Page_01 - Drafts  Collections  Playbooks/button_New Collection'))

WebUI.setText(findTestObject('Object Repository/Page_01 - Drafts  Collections  Playbooks/input__name_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'), 
    'Automation Playbook Collection')

WebUI.setText(findTestObject('Object Repository/Page_01 - Drafts  Collections  Playbooks/textarea_Description_description'), 
    'Automation Playbook Collection Description')

WebUI.click(findTestObject('Object Repository/Page_01 - Drafts  Collections  Playbooks/button_Create'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Playbook Collection  Collec_4b5c86/p_Automation Playbook Collection'), 
    'Automation Playbook Collection')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Playbook Collection  Collec_4b5c86/p_Automation Playbook Collection Description'), 
    'Automation Playbook Collection Description')

