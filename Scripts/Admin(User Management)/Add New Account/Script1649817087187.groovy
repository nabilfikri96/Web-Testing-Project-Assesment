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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/dashboard')

WebUI.setText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/a_Users'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.setText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'test')

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/li_Employee Name   Employee does not exist _d24284'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseremployeeNameempName'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseremployeeNameempName'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/li_Orange Test'))

WebUI.setText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUseruserName'), 'test1')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserpassword'), 'HRU8CXRBfU4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    'HRU8CXRBfU4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserpassword'), '8FlmmpTVS3/CaiMjuGMsoA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    'HRU8CXRBfU4=')

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__btnSave'))

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    '9NLz+4tGZcQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserpassword'), '1HPSnhGSd/NMp13HZgrcmA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__systemUserconfirmPassword'), 
    '1HPSnhGSd/NMp13HZgrcmA==')

WebUI.click(findTestObject('Object Repository/Add New Account/Page_OrangeHRM/input__btnSave'))

