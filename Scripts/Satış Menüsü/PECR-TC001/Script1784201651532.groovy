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


//USAGE EXAMPLE FOR SHORTENED FUNCTIONS

//Wait for 2 seconds
Mobile.delay(8)
//Start with home page
Mobile.startExistingApplication('com.edata.application.ecrapp')
//Switch to the sales page

imageBtnClick('sales_main_page_button')
//Check if cashier login is required

if (Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Kasiyer Girişi']), 5, FailureHandling.OPTIONAL)) {
	cashierAdminLogin()
}

for (int i = 1; i < 5; i++)
{	//Add 5 water into the cart
    btnClick('Su')
}

Mobile.takeScreenshot()

btnClick('Ekmek')
imageBtnClick('soldItems')
Mobile.delay(3)

indexBtnClick('Su','decreaseQuantity')


Mobile.takeScreenshot()

imageBtnClick('home')




btnClick('Nakit')


//Sell with cash
imageBtnClick('home')
//Navigate back to home page
imageBtnClick('home')