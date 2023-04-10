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

WebUI.navigateToUrl('https://www.gmm-tv.com/shop/index.php?route=account/register')

WebUI.setText(findTestObject('Object Repository/Page_REGISTER/input_First Name_firstname'), 'ณาตหชา')

WebUI.setText(findTestObject('Object Repository/Page_REGISTER/input_Last Name_lastname'), 'มุมแดง')

WebUI.setText(findTestObject('Object Repository/Page_REGISTER/input_E-mail_email'), 'aummumdaeng@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_REGISTER/input_Phone_telephone'), '0656375524')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_REGISTER/input_Create Password_password'), '5oMMk0FHFUklkoX8kTnEvA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_REGISTER/input_Confirm Password_confirm'), '5oMMk0FHFUlVjzYivZj9AA==')

WebUI.click(findTestObject('Object Repository/Page_REGISTER/input_Accept the condition_agree'))

WebUI.click(findTestObject('Object Repository/Page_REGISTER/input_Privacy Policy_btn btn-primary'))

WebUI.closeBrowser()

