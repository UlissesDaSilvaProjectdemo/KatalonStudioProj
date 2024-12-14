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

WebUI.navigateToUrl('https://www.booking.com/flights/index.en-gb.html?aid=2148036&label=branding-flights-en-emea-n6CkmmfJ9WN13AJic3l71AS603646973752%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-28170450%3Alp1006567%3Ali%3Adec%3Adm&sid=4b9489bc3571411db600d4de07536f45')

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_London All airports'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_Where to'))

WebUI.setText(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/input_Accept_AutoComplete-module__textInput_abe6fe_1_2_3'), 
    'Rio ')

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/div_Rio de Janeiro State, Brazil'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_Sat 18 Jan 2025 - Sat 25 Jan 2025'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_25'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_22'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_Search'))

WebUI.closeBrowser()

