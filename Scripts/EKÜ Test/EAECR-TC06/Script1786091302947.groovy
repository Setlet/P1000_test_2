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
import java.time.LocalDate
Mobile.startExistingApplication('com.edata.application.ecrapp')


imageBtnClick('eku_main_page_button')

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object', [('text') : 'Yönetici Girişi']),     1, FailureHandling.OPTIONAL)) {
	adminLogin()
}

btnClick('Fiş Kopyası')
btnClick('Belirli Fiş Kopyası')
btnClick('Tarih/Saat')
	imageBtnClick('ETDate')
	
	LocalDate bugun = LocalDate.now()
	

	String gun = bugun.getDayOfMonth().toString()
	String ay = bugun.getMonthValue().toString()
	String yil = bugun.getYear().toString()
	
	Cont_Date = setValidatedDate(gun, ay, yil)
	
	imageBtnClick('mtrl_picker_header_toggle')
	
	Mobile.setText(findTestObject('Object Repository/dynamic-textbox-object', [('text') : 'Yönetici Girişi']), Cont_Date, 2)
btnClick('Tamam')
imageBtnClick('ETHour')
Mobile.sendKeys('1')
btnClick('Onayla')