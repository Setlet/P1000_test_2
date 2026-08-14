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
imageBtnClick('documents')
btnClick('Fatura Satış')
btnClick('Fatura Tahsilatı')
btnClick('Fatura Seri No')
Mobile.sendKeys('SSD')
btnClick('Fatura Sıra No')
Mobile.sendKeys('123456')
btnClick('Kurum ismi')
Mobile.sendKeys('PROPAY')

btnClick('Fatura Tarihi')
Mobile.delay(2)
btnClick('iptal')

btnClick('Abone No')
Mobile.sendKeys('33')

btnClick('Fatura Tarihi')
Mobile.delay(2)
btnClick('iptal')

btnClick('Fatura Tutarı')
Mobile.sendKeys('987654')


btnClick('Fatura Tarihi')
Mobile.delay(2)
btnClick('iptal')

btnClick('Komisyon Tutarı')
Mobile.sendKeys('\b\b\b\b\b\b50000')

btnClick('Fatura Tarihi')
Mobile.delay(2)
btnClick('iptal')

btnClick('Onayla')

Mobile.delay(5)
btnClick('Nakit')
Mobile.delay(4)

imageBtnClick('home')

imageBtnClick('zx_main_page_button')

adminLogin()

btnClick('Z Günlük Satış Raporu')




