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
import static messageControl.messageControl.*
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.time.LocalDate
import java.time.format.DateTimeFormatter

LocalDate today = LocalDate.now()
String day = today.format(DateTimeFormatter.ofPattern("dd"))
String month = today.format(DateTimeFormatter.ofPattern("MM"))
String year = today.format(DateTimeFormatter.ofPattern("yyyy"))
LocalDate todayPlus5 = LocalDate.now().plusDays(5)
String dayPlus5 = todayPlus5.format(DateTimeFormatter.ofPattern("dd"))
String monthPlus5 = todayPlus5.format(DateTimeFormatter.ofPattern("MM"))
String yearPlus5 = todayPlus5.format(DateTimeFormatter.ofPattern("yyyy"))

Mobile.startExistingApplication('com.edata.application.ecrapp')
imageBtnClick('zx_main_page_button')

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Yönetici Girişi']), 5, FailureHandling.OPTIONAL)) {
	adminLogin()
}

btnClick('Mali Raporlar')
Mobile.delay(1)
btnClick('Mali Hafıza Rapor')
labelDetect('Başlangıç Z No')
imageBtnClick('one')
labelDetect('Bitiş Z No')
3.times{
imageBtnClick('nine') 
}
labelDetect('Tarih')
labelDetect('Başlangıç Tarih')
setValidatedDate(day, month, year)
labelDetect('Bitiş Tarih')
setValidatedDate(dayPlus5, monthPlus5, yearPlus5)
btnClick('Onayla')
Mobile.delay(5)
clickBack()
imageBtnClick('navigation_home')