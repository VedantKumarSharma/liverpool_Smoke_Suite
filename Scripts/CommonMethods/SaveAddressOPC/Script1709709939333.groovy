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

WebUI.click(findTestObject('OPCPage/OPCH_postalcode'))

WebUI.setText(findTestObject('OPCPage/OPCH_postalcode'), '21200', FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('OPCPage/city_addAddress_opc'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/city_addAddress_opc'), 'mexico', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/street_addAddress_opc'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/street_addAddress_opc'), 'kmpt road', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/noExt_addAddress_opc'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/noExt_addAddress_opc'), '9823958982', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/cellphone_addAddress_opc'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/cellphone_addAddress_opc'), '9823459823', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OPCPage/phone_addAddress_opc'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('OPCPage/phone_addAddress_opc'), '9358585989', FailureHandling.OPTIONAL)

