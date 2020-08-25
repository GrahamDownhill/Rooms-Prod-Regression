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

WebUI.navigateToUrl('https://myclinic.com/for-clinics/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_For Clinics - MyCliniccom/span_Log In (7)'))

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Email Address_InputEmail (8)'), 'stuartdownhill@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Rooms - MyCliniccom/input_Password_InputPassword (8)'), 'Z6c1Gmkhx6wY/aJCn5EUIg==')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Log In (8)'))

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Name_ModelName (4)'), 'test clinic2')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/input_Expiration_ModelAudioMessagesEnabled (2)'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Create Clinic (4)'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Close (4)'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/a_6J2-HR7'))

WebUI.switchToWindowIndex('1')

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Full Name_DetailsName (7)'), 'test patient')

WebUI.selectOptionByValue(findTestObject('Page_Rooms - MyCliniccom/select_DD1234567891011121314151617181920212_04584c (7)'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Page_Rooms - MyCliniccom/select_MM123456789101112 (7)'), '4', true)

WebUI.selectOptionByValue(findTestObject('Page_Rooms - MyCliniccom/select_YYYY19001901190219031904190519061907_8214c5 (7)'), 
    '1912', true)

WebUI.setText(findTestObject('Page_Rooms - MyCliniccom/input_Phone Number_DetailsPhoneNumber (7)'), '0777777777')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Check In'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/div_Allow VideoAudio Permissions (7)'))

WebUI.switchToWindowIndex('0')

WebUI.delay(1)

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Connect'))

WebUI.delay(1)

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/div_Allow VideoAudio Permissions (7)'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/div_test patient'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/div_(108 years 4 months)'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/div_0777777777'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/a_End Call (7)'))

WebUI.click(findTestObject('Object Repository/Page_Rooms - MyCliniccom/i_Call time was 0 minutes and 15 seconds_fa_fe16da'))

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_Submit Feedback (1)'))

WebUI.switchToWindowIndex('1')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/button_End Call'))

WebUI.click(findTestObject('Page_Thank you - MyCliniccom/h2_Thank you for using our service (1)'))

WebUI.switchToWindowIndex('0')

WebUI.click(findTestObject('Page_Rooms - MyCliniccom/span_Logout'))

WebUI.closeBrowser()

