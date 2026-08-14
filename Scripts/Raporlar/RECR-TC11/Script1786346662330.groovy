import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import java.util.Date
import java.time.LocalDate
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
import static messageControl.messageControl.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication('com.edata.application.ecrapp')
imageBtnClick('zx_main_page_button')

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Yönetici Girişi']), 5, FailureHandling.OPTIONAL)) {
	adminLogin()
}
btnClick('GİB Raporları')
btnClick('Aylık Rapor')

Mobile.delay(1)

LocalDate bugun = LocalDate.now()


String gun = bugun.getDayOfMonth().toString()
String ay = bugun.getMonthValue().toString()
String yil = bugun.getYear().toString()



Mobile.tap( findTestObject('Object Repository/dynamic-button-object-image' , [('icon-id'):'ETStartPluNo'])  , 2)

Mobile.setText(findTestObject('Object Repository/dynamic-button-object-image', [('icon-id'):'ETStartPluNo']), yil , 2)
Mobile.delay(2)
Mobile.tap( findTestObject('Object Repository/dynamic-button-object-image' , [('icon-id'):'ETEndPluNo'])  , 2)
Mobile.setText(findTestObject('Object Repository/dynamic-button-object-image', [('icon-id'):'ETEndPluNo']), ay, 2)
btnClck('Onayla')