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
 

imageBtnClick('pos_main_page_button')
btnClick('Bankacılık Uygulamaları')
btnClick('Propay TechPOS')
Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object' , [('button-name'): 'Eşlenikli İade']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object' , [('button-name'): 'Yönetici Şifresi']), 0)
Mobile.sendKeys('1234')
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image' , [('icon-id'): 'num1']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image' , [('icon-id'): 'num7']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image' , [('icon-id'): 'num5']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image' , [('icon-id'): 'num5']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image' , [('icon-id'): 'num0']), 0)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object' , [('button-name'): 'Tamam']), 0)

Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image',[('icon-id') : 'layout_manuel_payment']))
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object-image',[('icon-id') : 'cc_card']))
Mobile.sendKeys('5421190141566231')
Mobile.delay(3)
Mobile.sendKeys('12')
Mobile.delay(1)
Mobile.sendKeys('29')
Mobile.delay(1)
Mobile.sendKeys('340')
Mobile.delay(7)
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object' , [('button-name'): 'Banka Referans Numarası']), 0)
Mobile.sendKeys('622613062752')
Mobile.tap(findTestObject('Object Repository/POSTech/dynamic-button-object' , [('button-name'): 'Tamam']), 0)

