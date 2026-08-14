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
import static messageControl.messageControl.*

Mobile.startExistingApplication('com.edata.application.ecrapp')
if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object', [('text') : 'Kasiyer Girişi']), 5, FailureHandling.OPTIONAL)) {
    cashierAdminLogin()
}
imageBtnClick('rightSwipe')
btnClick('kahve')
btnClick('Su')
btnClick('Kredi')

Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image',[('icon-id') : 'layout_manuel_payment']))
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image',[('icon-id') : 'cc_card']))
Mobile.sendKeys('5421190141566231')
Mobile.delay(3)
Mobile.sendKeys('12')
Mobile.delay(1)
Mobile.sendKeys('29')
Mobile.delay(1)
Mobile.sendKeys('340')