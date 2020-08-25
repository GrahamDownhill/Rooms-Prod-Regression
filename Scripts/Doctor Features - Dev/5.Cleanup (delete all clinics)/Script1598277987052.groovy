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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rooms.dev.myclinic.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Email Address_InputEmail'), 'stuartdownhill@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Rooms - MyCliniccom/input_Password_InputPassword'), 'Z6c1Gmkhx6wY/aJCn5EUIg==')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Log In'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/span_Manage Clinics'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_End Clinic'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/a_End Clinic'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_End Clinic'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/a_End Clinic_1'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/span_Logout'))

WebUI.closeBrowser()

