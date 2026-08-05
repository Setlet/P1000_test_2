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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static messageControl.messageControl.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication('com.edata.application.ecrapp')

imageBtnClick('set_main_page_button')



if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Yönetici Girişi']), 5, FailureHandling.OPTIONAL)) {
	adminLogin()
}
Mobile.scrollToText('Kuyumcu Ayarları')
btnClick('Cihaz Ayarları')
btnClick('Ekran')
btnClick('Ekran Parlaklığı')

 Mobile.delay(3)


 String adbCommand = '/Users/erciyesanadoluholding/Library/Android/sdk/platform-tools/adb adb shell settings get system screen_brightness' 
 Process process = adbCommand.execute()
 process.waitFor()
String Screen_Bright_f = adbCommand.execute()

String adbCommand_2 = '/Users/erciyesanadoluholding/Library/Android/sdk/platform-tools/adb adb shell settings put system screen_brightness 255'
Process process_2 = adbCommand_2.execute()
process_2.waitFor()
String Screen_Bright_f_2 = adbCommand_2.execute()

if(Screen_Bright_f_2  > Screen_Bright_f) {
	
	
}