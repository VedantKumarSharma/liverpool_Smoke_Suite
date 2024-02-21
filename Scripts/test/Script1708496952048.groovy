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

WebUI.navigateToUrl('https://odtaqaa.liverpool.com.mx/tienda/home')

WebUI.click(findTestObject('Object Repository/delete1/Page_/span_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/delete1/Page_Iniciar sesin  Liverpool/input_Correo electrnico_username'), 
    'anusha.kondapaneni@zensar.com')

WebUI.setEncryptedText(findTestObject('Object Repository/delete1/Page_Iniciar sesin  Liverpool/input_Contrasea_password'), 
    'BR4+6ebIRw/89ruX5hJDag==')

WebUI.click(findTestObject('Object Repository/delete1/Page_Iniciar sesin  Liverpool/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/delete1/Page_/a_Mis compras'))

WebUI.click(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/a_Actualizar Datos Personales'))

WebUI.click(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/input_Correo Electrnico_firstName'))

WebUI.click(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/input_Correo Electrnico_firstName'))

WebUI.setText(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/input_Correo Electrnico_firstName'), 'rereuntest')

WebUI.click(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/div_Actualizar datos personalesConfirma tu _f2873a'))

WebUI.click(findTestObject('Object Repository/delete1/Page_Liverpool Mxico/button_Actualizar'))

