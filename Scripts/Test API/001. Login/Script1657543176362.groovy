import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.util.CryptoUtil
import internal.GlobalVariable as GlobalVariable
import static org.assertj.core.api.Assertions.*
import groovy.json.JsonSlurper

def slurper=new JsonSlurper()

requestLogin = WS.sendRequest(findTestObject('001. Login'))

KeywordUtil.logInfo("RESPONSE BODY")
KeywordUtil.logInfo(requestLogin.getResponseBodyContent())
def responseLogin=slurper.parseText(requestLogin.getResponseBodyContent())
KeywordUtil.logInfo("VERIFICATION VALUE START")
WS.verifyResponseStatusCode(requestLogin, 400)
WS.verifyElementPropertyValue(requestLogin, 'status', 'false')
WS.verifyElementPropertyValue(requestLogin, 'message', 'Login failed, please check your email or password.')
KeywordUtil.logInfo("VERIFICATION VALUE DONE")

