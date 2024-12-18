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

WebUI.navigateToUrl('https://www.booking.com/flights/index.en-gb.html?aid=2148036&label=branding-flights-en-emea-n6CkmmfJ9WN13AJic3l71AS603646973752%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-28170450%3Alp1006567%3Ali%3Adec%3Adm&sid=fe0294e527426cf32f2ed651f6ab3021')

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_Register'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Find cheap flights  plane tickets  Boo_162cff/span_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in or create an account  Booking.com/input_Email address_username'), 
    'tes@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in or create an account  Booking.com/span_Continue with email'))

WebUI.click(findTestObject('Object Repository/Page_Sign in or create an account  Booking.com/span_Continue with email'))

