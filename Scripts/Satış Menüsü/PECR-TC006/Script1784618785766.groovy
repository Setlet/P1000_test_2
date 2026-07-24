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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

Mobile.startExistingApplication('com.edata.application.ecrapp')
Mobile.tap(findTestObject('Object Repository/Home Page/sales_main_page_button'), 0)

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('metin'):'Kasiyer Girişi']), 2, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object',[('kutu_id'):'cashierSpinner']), 0)
	Mobile.delay(1)
	Mobile.tapAtPosition(150,640)
	Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object',[('kutu_id'):'cashierPasswordEditText']), 0)
	Mobile.delay(1)
	[150, 350, 550].each { Mobile.tapAtPosition(it, 850); Mobile.delay(1) }
	Mobile.tapAtPosition(150, 900)
	Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Giriş']), 0)
	Mobile.delay(3)
} else 
	Mobile.delay(2)


Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Su']), 0)
Mobile.delay(0.5)
Mobile.tap(findTestObject('Object Repository/Sale/sale_right_swipe'), 0)
Mobile.delay(0.5)
Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Kahve']), 0)
Mobile.delay(0.5)

Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Kredi']), 0)
Mobile.tap(findTestObject('Object Repository/dynamic-label-object',[('metin'):'Test Bankası']), 0)
Mobile.delay(5)
[150, 350, 550].each { Mobile.tapAtPosition(it, 669); Mobile.delay(1) }
Mobile.tapAtPosition(150, 782)
Mobile.tap(findTestObject('Object Repository/dynamic-label-object',[('metin'):'Tamam']), 0)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/dynamic-label-object',[('metin'):'Tamam']), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon_id'):'home']), 0)

