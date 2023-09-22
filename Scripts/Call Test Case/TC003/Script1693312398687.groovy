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

WebUI.callTestCase(findTestCase('Call Test Case/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Call Test Case/Search user/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Call Test Case/TC003/Page_OrangeHRM/button_Add'))

WebUI.delay(2)

WebUI.selectOptionByLabel(findTestObject('null'), 'Admin', false)

WebUI.sendKeys(findTestObject('Call Test Case/TC003/Page_OrangeHRM/input'), 'Paultom mathew Collingshogard')

WebUI.delay(2)

WebUI.selectOptionByIndex(findTestObject('null'), 0)

WebUI.sendKeys(findTestObject('Call Test Case/TC003/Page_OrangeHRM/input_Username_oxd-input oxd-input--active'), 'test1234')

WebUI.sendKeys(findTestObject('Call Test Case/TC003/Page_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'test1234')

WebUI.sendKeys(findTestObject('Call Test Case/TC003/Page_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    'test1234')

WebUI.delay(2)

WebUI.closeBrowser()
