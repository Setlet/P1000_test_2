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
import com.openai.models.realtime.AudioTranscription.Delay as Delay
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static messageControl.messageControl.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable as GlobalVariable

Mobile.delay(6)

//Start with home page
Mobile.startExistingApplication('com.edata.application.ecrapp')





imageBtnClick('sales_main_page_button')

//Check if cashier login is required
if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object', [('text') : 'Kasiyer Girişi']), 5, FailureHandling.OPTIONAL)) {
    cashierAdminLogin()
}

for (int i = 0; i < 5; i++) {
    btnClick('Su')
}

btnClick('Nakit')

//Sell with cash
//Navigate back to home page
sleep(400)

Mobile.waitForElementPresent(findTestObject('Object Repository/dynamic-button-object-image' , [('icon-id') : 'home']),  5)
imageBtnClick('home')

Mobile.delay(2)

imageBtnClick('eku_main_page_button')

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object', [('text') : 'Yönetici Girişi']),     1, FailureHandling.OPTIONAL)) {
    adminLogin()
}

btnClick('Fiş Detay Raporu')
// txtBoxClick ve setTxtbox string olarak okuyor
String Z_No_START = 1
String Z_No_END = 2

txtboxClick('ETStartZNo')
setTxtbox('ETStartZNo', Z_No_START)
txtboxClick('ETEndZNo')
setTxtbox('ETEndZNo', Z_No_END)


Mobile.waitForElementPresent(findTestObject('Object Repository/dynamic-button-object' , [('text') : 'Onayla']),  5)


imageBtnClick('btnOK')


Mobile.tap(findTestObject('Object Repository/back-button-object',[('accesibilityID') : 'Yukarı Git']), 5)




Mobile.waitForElementPresent(findTestObject('Object Repository/dynamic-button-object-image' , [('icon-id') : 'home']),  5)
imageBtnClick('home')