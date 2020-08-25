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

'Opens Browser window'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://rooms.dev.myclinic.com/')

'Maximise window (avoids navbar)'
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Email Address_InputEmail'), 'stuartdownhill@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Rooms - MyCliniccom/input_Password_InputPassword'), 'Z6c1Gmkhx6wY/aJCn5EUIg==')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Log In'))

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Name_ModelName'), 'test 1')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Create Clinic'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Close'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/span_Logout'))

WebUI.closeBrowser()

