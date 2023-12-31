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

WebUI.delay(2)

WebUI.click(findTestObject('Call Test Case/Page_OrangeHRM/a_My Info'))

WebUI.verifyElementPresent(findTestObject('Call Test Case/Page_OrangeHRM/h6_Personal Details'), 0)

WebUI.sendKeys(findTestObject('Call Test Case/Page_OrangeHRM/input_Employee Full Name_firstName'), 'tom')

WebUI.sendKeys(findTestObject('Call Test Case/Page_OrangeHRM/input_Required_middleName'), 'mathew')

WebUI.sendKeys(findTestObject('Call Test Case/Page_OrangeHRM/input_Required_lastName'), 'hogard')

WebUI.click(findTestObject('Call Test Case/Page_OrangeHRM/label_Male'))

WebUI.click(findTestObject('Call Test Case/Page_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Call Test Case/Page_OrangeHRM/div_SuccessSuccessfully Updated'), 0)

