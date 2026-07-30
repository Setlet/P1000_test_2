package messageControl

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import com.kms.katalon.core.testobject.ConditionType

public class messageControl {
	
	
    //An escape function for exiting from the sales page to the home page after a potential fail  
	@Keyword		
	def static saleEscape(boolean warningAvailable) {
           
		Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Fiş İptal']), 0)
		boolean levelIconExist = Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-button-object-image',[('icon-id'):'levelIcon']), 2, FailureHandling.OPTIONAL)
		  if(levelIconExist) {
			  if(Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Kapat']),0)) {
				  Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Kapat']),0)
			  }else {
				  Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Evet']),0)
				  
			  }			  
		  }	else 
			  Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon-id'):'home']),0)
	}
	
	
	
	@Keyword
	def static cashierAdminLogin() {
		
		    boolean cashierLogin = Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Kasiyer Girişi']), 1, FailureHandling.OPTIONAL)
						
			if(cashierLogin) {
				Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'cashierSpinner']), 1)
				Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon-id'):'com.edata.application.ecrapp:id/cashierPasswordEditText']),2) //Teknik olarak doğru değil ama çalışıyor, sonra düzelt
				Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'cashierPasswordEditText']),5,FailureHandling.OPTIONAL)
				Mobile.setText(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'cashierPasswordEditText']), '1234', 5)
				Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Giriş']),5)
				return
			}
			else {
				return
		    }
	}
	
	@Keyword
	def static adminLogin() {
		
			boolean adminLogin = Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Yönetici Girişi']), 1, FailureHandling.OPTIONAL)
						
			if(adminLogin) {

				Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'cashierPasswordEditText']),5,FailureHandling.OPTIONAL)
				Mobile.setText(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'cashierPasswordEditText']), '1234', 5)
				Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Giriş']),5)
				return
			}
			else {
				return
			}
	}
	
	@Keyword
	
	def static paymentError() {
		if(Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-label-object',[('text'):'Ödeme Türü']), 0)) {
			return
		}else {
			Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon-id'):'home']),0)			
			Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Fiş İptal']), 0.5)		
			Mobile.tap(findTestObject('Object Repository/dynamic-button-object',[('button-name'):'Evet']),0.5)			
			Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image',[('icon-id'):'home']),5)				
		}
	} 

	
	
	
	//Tap a button referring the text on it
	@Keyword
	def static btnClick(String btnName) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-button-object', [('button-name') : btnName]), 5)
	}

	
	//Click on a button referring the sibling label under the same parent widget
	@Keyword
	def static indexBtnClick(String btnName,String id) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-index-button-object', [('ref-name') : btnName,('btn-id'):id]), 5)
	}
	
	//Tap a button that does not contain text on
	@Keyword
	def static imageBtnClick(String btnIcon) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-button-object-image', [('icon-id') : btnIcon]), 5)
	}
	
	//Click on a text box for editing the text
	@Keyword
	def static txtboxClick(String btnName) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-textbox-object', [('txtbox-id') : btnName]), 5)
	}
	
	@Keyword
	def static setTxtbox(String txtboxName, String password) {
		Mobile.setText(findTestObject('Object Repository/dynamic-textbox-object',[('txtbox-id'):'txtboxname']), 'password', 5)
	}
	
	//Detect a message thrown 
	@Keyword
    def static String detectMessage() {
        
        boolean messageDetect = Mobile.verifyElementExist(findTestObject('Object Repository/dynamic-message-object'), 3, FailureHandling.OPTIONAL)
        
        if (messageDetect) {
            String messageText = Mobile.getText(findTestObject('Object Repository/dynamic-message-object'), 3)
			KeywordUtil.markFailed("Uyarı mesajı tespit edildi: " + messageText)
            return messageText
            
        } else             
            return "" 
    }
	
	//Detect a text to validate position or else
	@Keyword
	def static labelDetect(String text) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-label-object', [('text') : text]), 5)
	}
	@Keyword
	def static labelDetectStartsWith(String text) {
		
		Mobile.tap(findTestObject('Object Repository/dynamic-label-object-starts-with', [('text') : text]), 5)
	}
	
@Keyword
public static void clickCheckbox(String productName) {
    String dynamicXPath = "//*[contains(@text, '" + productName + "')]/following::android.widget.CheckBox[1]"

    TestObject customCheckbox = new TestObject("dynamicCheckbox")
    customCheckbox.addProperty("xpath", ConditionType.EQUALS, dynamicXPath)
    
    Mobile.tap(customCheckbox, 5)
}
@Keyword
def static setValidatedDate(String day, String month, String year) {
	
	
	int d = day.toInteger()
	int m = month.toInteger()
	int y = year.toInteger()
	
	
	if (m < 1 || m > 12) {
		KeywordUtil.markFailedAndStop("System Error: Invalid month (${m}). Month must be between 1 and 12.")
	}
	
	
	int maxDays = 31
	
	if (m == 4 || m == 6 || m == 9 || m == 11) {
		
		maxDays = 30
		
	} else if (m == 2) {
		
		boolean isLeapYear = (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)
		maxDays = isLeapYear ? 29 : 28
	}
	
	if (d < 1 || d > maxDays) {
		KeywordUtil.markFailedAndStop("System Error: Invalid day (${d}) for month (${m}) in year (${y}). Max allowed is ${maxDays}.")
	}
	
	String formattedDay = String.format("%02d", d)
	String formattedMonth = String.format("%02d", m)
	String finalDate = formattedDay + "." + formattedMonth + "." + year
	
	Mobile.tap( findTestObject('Object Repository/Service/Belirli Tarihler Arasi Olay Kaydi/date-edit-icon')  , 2)
	
	Mobile.setText(findTestObject('Object Repository/Service/Belirli Tarihler Arasi Olay Kaydi/tarih-txtbox'), finalDate, 2)
	Mobile.delay(2)
	Mobile.tap(  findTestObject('Object Repository/dynamic-button-object',[('text'):'Tamam'])  , 2)
	
	println("System Log: Date successfully validated and set to " + finalDate)
}

@Keyword
def static setValidatedTime(String hour, String minute) {
	int hour_int = hour.toInteger()
	int minute_int = minute.toInteger()
	
	if(hour_int < 1 || hour_int > 24) {
		KeywordUtil.markFailedAndStop("System Error: Invalid Hour (${hour_int}). Hour must be between 1 and 24.")
}
if(minute_int < 0 || minute_int > 60) {
	KeywordUtil.markFailedAndStop("System Error: Invalid month (${minute_int}). Minute must be between 0 and 60.")
}
Mobile.tap( findTestObject('Object Repository/Service/Saat/SS')  , 2)
Mobile.setText(findTestObject('Object Repository/Service/Saat/SS'), hour, 2)
Mobile.tap( findTestObject('Object Repository/Service/Saat/DD')  , 2)
Mobile.setText(findTestObject('Object Repository/Service/Saat/DD'), minute, 2)

}
@Keyword
def static clickBack() {
	Mobile.tap(findTestObject('Object Repository/back-button-object'), 5)
}

	




}





































