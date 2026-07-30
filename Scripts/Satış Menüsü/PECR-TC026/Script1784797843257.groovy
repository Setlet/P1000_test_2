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

Mobile.startExistingApplication('com.edata.application.ecrapp')
imageBtnClick('sales_main_page_button')
if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Kasiyer Girişi']), 5, FailureHandling.OPTIONAL)) {
	cashierAdminLogin()
}

4.times{ 
	btnClick('Balık') 
	}
btnClick('Ödeme')
btnClick('Kredi Kartı')
btnClick('VF Taksitli Satış')
labelDetect('Test Bankası')
Mobile.delay(2)
Mobile.swipe(355, 622, 355, 378)
labelDetect('Tamam')
Mobile.delay(5)

String fiyatMetni = Mobile.getText(findTestObject('Object Repository/Sale/Payment Type/payment_type_sum'), 5)
if (fiyatMetni != null && !fiyatMetni.trim().equals("0,00")) {
	Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Fiş İptal']), 0)
	KeywordUtil.markFailed("Hata: RED: E55 İşlem Yapılan Kartın Seçilen Banka İle İşlem İzni Yoktur")
	Mobile.delay(5)
	imageBtnClick('home')
	
} else {
    Mobile.delay(5)
	imageBtnClick('home')
}


