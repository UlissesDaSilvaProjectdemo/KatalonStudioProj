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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.orangehrm.com/')

WebUI.click(findTestObject('Object Repository/Page_Human Resources Management Software  O_31d1a1/button_Contact Sales'))

WebUI.setText(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/input_Full Name_FullName'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/input_Phone Number_Contact'), 
    '02099887788')

WebUI.setText(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/input_Email_Email'), 'test@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/select_CountryAfghanistanAlbaniaAlgeriaAmer_8f0376'), 
    'Antigua and Barbuda', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/select_Number of Employees  1011 - 5051 - 2_706fa0'), 
    '51 - 200', true)

WebUI.setText(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/input_Job title_JobTitle'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/textarea_Your Message_Comment'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Get in Touch with OrangeHRM Sales  OrangeHRM/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.getWindowTitle("Get in Touch with OrangeHRM Sales | OrangeHRM")

