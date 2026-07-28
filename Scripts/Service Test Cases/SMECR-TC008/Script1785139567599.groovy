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

import java.time.LocalTime
import static messageControl.messageControl.*

Mobile.startExistingApplication('com.edata.application.ecrapp')
//Go to service page
imageBtnClick('service_main_page_button')
imageBtnClick('confirmLoginPassword')
imageBtnClick('confirmLoginPassword')
//Click on 'Saat'
btnClick('Saat')
btnClick('SS')



//Saat ve dakika parçalandı(saniye kullanılmıyor)
String SS = LocalTime.now().hour
String DD = LocalTime.now().minute


// 3. Fonksiyonuna dinamik değişkenleri gönder
setValidatedTime(SS,DD)

btnClick('Onayla')

btnClick('Evet')

Mobile.delay(3)
