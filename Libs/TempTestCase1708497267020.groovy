import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\SUNITH~1\\AppData\\Local\\Temp\\Katalon\\20240221_120427\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://odtaqaa.liverpool.com.mx/tienda/home\')\n\nWebUI.click(findTestObject(\'Page_/span_Iniciar sesin\'))\n\nWebUI.setText(findTestObject(\'Page_Iniciar sesin  Liverpool/input_Correo electrnico_username\'), \'anusha.kondapaneni@zensar.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Iniciar sesin  Liverpool/input_Contrasea_password\'), \'BR4+6ebIRw/89ruX5hJDag==\')\n\nWebUI.click(findTestObject(\'Page_Iniciar sesin  Liverpool/button_Iniciar sesin\'))\n\nWebUI.click(findTestObject(\'Page_/a_Mis compras\'))\n\nWebUI.click(findTestObject(\'Page_Liverpool Mxico/a_Actualizar Datos Personales\'))\n\nWebUI.click(findTestObject(\'Page_Liverpool Mxico/input_Correo Electrnico_firstName\'))\n\nWebUI.click(findTestObject(\'Page_Liverpool Mxico/input_Correo Electrnico_firstName\'))\n\nWebUI.setText(findTestObject(\'Page_Liverpool Mxico/input_Correo Electrnico_firstName\'), \'rereuntest\')\n\nWebUI.click(findTestObject(\'Page_Liverpool Mxico/div_Actualizar datos personalesConfirma tu _f2873a\'))\n\nWebUI.click(findTestObject(\'Page_Liverpool Mxico/button_Actualizar\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

