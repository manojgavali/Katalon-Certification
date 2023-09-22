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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://triterras-uatx.unqork.io/auth/oidc/triterras-aws-cognito/cb')

WebUI.sendKeys(findTestObject('OR_Add User/File Upload_OR/Page_Signin/Email_username'), 'manoj+70@triterras.com')

WebUI.sendKeys(findTestObject('OR_Add User/File Upload_OR/Page_Signin/Password'), 'Manoj@123')

WebUI.click(findTestObject('OR_Add User/File Upload_OR/Page_Signin/SubmitButton'))

WebUI.delay(5)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/button_Add'))

WebUI.delay(2)

WebUI.click(findTestObject('OR_Add User/Page_Triterras UAT/button_browse'))

String path = 'C:\\Users\\manoj\\Downloads\\pdf-sample1 (9) (1).pdf'

WebUI.setEncryptedText(findTestObject, path)
WebUI.sendKeys(findTestObject, path)



WebUI.getText(findTestObject('OR_Add User/Page_Triterras UAT/a_pdf-sample1 (9) (1).pdf'))

WebUI.delay(2)

