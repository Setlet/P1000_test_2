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

imageBtnClick('saleConfigurations')

imageBtnClick('jewelerySaleSwitch')
Mobile.delay(3)
btnClick('Balık')
btnClick('2')
btnClick('5')
btnClick('0')
btnClick('Miktar')
imageBtnClick('del')
imageBtnClick('del')
imageBtnClick('del')
imageBtnClick('del')
btnClick('1')
btnClick('8')
btnClick('5')
btnClick('0')
Mobile.swipeWithDuration(352,319,362,983,1683)
btnClick('Ödeme')
btnClick('Senet / Çek')