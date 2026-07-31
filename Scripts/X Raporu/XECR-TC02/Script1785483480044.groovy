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


imageBtnClick('zx_main_page_button')

String ETPluNo_1 = 40
String ETPluNo_2 = 23
String ETPluNo_3 = 20
if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Yönetici Girişi']), 5, FailureHandling.OPTIONAL)) {
	adminLogin()
}

btnClick('PLU Raporları')
Mobile.delay(1)
btnClick('X Plu Satış Raporu')
txtboxClick('ETStartPluNo')
setTxtbox('ETStartPluNo',ETPluNo_1)
txtboxClick('ETEndPluNo')
setTxtbox('ETEndPluNo', ETPluNo_1 )
imageBtnClick('btnOk')
Mobile.delay(2)
btnClick('Yazdır')
Mobile.waitForElementPresent(findTestObject('Object Repository/dynamic-button-object' , [('text') : 'Onayla']),  5)

btnClick('PLU Raporları')
btnClick('X Plu Satış Raporu')

txtboxClick('ETStartPluNo')
setTxtbox('ETStartPluNo', ETPluNo_2 )
txtboxClick('ETEndPluNo')
setTxtbox('ETEndPluNo', ETPluNo_2 )
imageBtnClick('btnOk')
Mobile.delay(2)
btnClick('Yazdır')
Mobile.waitForElementPresent(findTestObject('Object Repository/dynamic-button-object' , [('text') : 'Onayla']),  5)

btnClick('PLU Raporları')
btnClick('X Plu Satış Raporu')
	
txtboxClick('ETStartPluNo')
setTxtbox('ETStartPluNo', ETPluNo_3)
txtboxClick('ETEndPluNo')
setTxtbox('ETEndPluNo', ETPluNo_3)
imageBtnClick('btnOk')
Mobile.delay(2)
btnClick('Yazdır')



imageBtnClick('navigation_home')