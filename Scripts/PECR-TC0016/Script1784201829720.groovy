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
//Start the P1000 ECR application
Mobile.startExistingApplication('com.edata.application.ecrapp')
//Tap the sales button on the main menu
Mobile.tap(findTestObject('Object Repository/Home Page/sales_main_page_button'), 0)

//Check if cashier login is required
//Check for the login window
if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('metin'):'Kasiyer Girişi']), 2, FailureHandling.OPTIONAL)) {
	//Select the cashier
	Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object',[('kutu_id'):'cashierSpinner']), 0)
	Mobile.delay(1)
	Mobile.tapAtPosition(150,640)
	//Enter the password
	Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object',[('kutu_id'):'cashierPasswordEditText']), 0)
	Mobile.delay(1)
	Mobile.tapAtPosition(150, 800)
	Mobile.delay(1)
	Mobile.tapAtPosition(350, 800)
	Mobile.delay(1)
	Mobile.tapAtPosition(550, 800)
	Mobile.delay(1)
	Mobile.tapAtPosition(150, 900)
	//Confirm the information
	Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Giriş']), 0)
	Mobile.delay(3)
}
else
	Mobile.delay(3)
	//Add 3 water into the cart
	for(i=0;i<3;i++) {
	Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Su']), 0)
	Mobile.delay(0.5);	
	}
    
	//Navigate to the payment type section
	Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Ödeme']),0)
	Mobile.delay(2)
	
	//Select payment with food card	
 Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('buton_adi'):'Yemek Fişi']),0)
 
 Mobile.delay(3)


//Go back to sales page
Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon_id'):'home']), 0)
Mobile.delay(1)
//Go back to home page
Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon_id'):'home']), 0)
