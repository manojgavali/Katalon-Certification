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

WebUI.callTestCase(findTestCase('Login'), [('username') : 'kratosadmin@triterras.com', ('password') : 'Triterras@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(80)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/button_OK'))

WebUI.delay(3)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/button_Add User'))

WebUI.setText(findTestObject('OR_Add User/Page_Triterras UAT/input_Kratos User Name_firstName'), GlobalVariable.Randomstring1)

WebUI.setText(findTestObject('OR_Add User/Page_Triterras UAT/input_Kratos User Email_email'), GlobalVariable.Randomstring2)

WebUI.setText(findTestObject('OR_Add User/Page_Triterras UAT/input_Confirm Kratos User Email_confirmEmail'), GlobalVariable.Randomstring2)

WebUI.setText(findTestObject('OR_Add User/Page_Triterras UAT/input_Phone Number_phone'), GlobalVariable.Randomstring3)

WebUI.delay(2)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/i_Select_caret pull-right'))

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/span_KratosAdminMaker'))

WebUI.delay(2)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/button_Submit'))

WebUI.delay(10)

WebUI.closeBrowser()

