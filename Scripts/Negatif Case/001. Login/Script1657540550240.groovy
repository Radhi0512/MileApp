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

WebUI.openBrowser('https://taskdev.mile.app/login')

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Login/001. VT - Login'), 0)

WebUI.verifyElementVisible(findTestObject('Login/002. VT - Organization Name'))

WebUI.verifyElementVisible(findTestObject('Login/003. Email or Username'))

WebUI.verifyElementVisible(findTestObject('Login/004. Password'))

WebUI.setText(findTestObject('Login/005. input_Organization Name'), 'testonboard')

WebUI.sendKeys(findTestObject('Login/005. input_Organization Name'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Login/006. input_Email or Username'), 0)

WebUI.setText(findTestObject('Login/006. input_Email or Username'), 'Radhi')

WebUI.setEncryptedText(findTestObject('Login/007. input_Password'), 'p4y+y39Ir5O++RH4jAhtiA==')

WebUI.click(findTestObject('Login/008. Button - Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Login/009. VT - Login failed, please check your email or password'), FailureHandling.STOP_ON_FAILURE)

