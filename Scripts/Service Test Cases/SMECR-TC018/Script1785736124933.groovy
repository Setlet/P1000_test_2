import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
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
//POS makinesi string kabul etmektedir
String TC_No_ST = 11111111111
String VKN_No_ST = 55555555555
String Mersis_No_ST = 882409879300001
String Sicil_No_ST = 123456-5
String Web_Site_St = 'www.Testşirket.com.tr'
Mobile.scrollToText('Şirket Bilgileri Değiştirme')
btnClick('Şirket Bilgileri Değiştirme')
txtboxClick('tckn_ET')
setTxtbox('tckn_ET',TC_No_ST)
Mobile.delay(1)
txtboxClick('vkn_ET')
setTxtbox('vkn_ET',VKN_No_ST)
Mobile.delay(1)
txtboxClick('mersis_number_ET')
setTxtbox('mersis_number_ET',Mersis_No_ST)
Mobile.delay(1)
txtboxClick('commercial_number_ET')
setTxtbox('commercial_number_ET',Sicil_No_ST)
Mobile.delay(1)
txtboxClick('mail_address_ET')
setTxtbox('mail_address_ET',Web_Site_St)
Mobile.delay(1)
Mobile.pressBack()
imageBtnClick('buttonSaveCompanyInfo')
Mobile.delay(1)
btnClick('Evet')

Mobile.delay(1)
btnClick('Tamam')
Mobile.delay(1)
Mobile.delay(1)
imageBtnClick('sold_item_cart_menu_home')
labelDetect('01 : servis ayarları')

btnClick('Tamam')
btnClick('Tamam')

