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
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.Single_SKU_PDP], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PDPPage/AddToCart_pdp'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.click(findTestObject('CartPage/BuyButton_Cart'))

WebUI.click(findTestObject('OPCPage/ChangeAddress_Checkout'))

WebUI.click(findTestObject('OPCPage/AddAddressButtonPopup_checkout'))

String StoreValue = 'AUTOMATION' + RandomStringUtils.randomAlphabetic(8)

System.out.println(StoreValue)

Name = 'TestQA'

//name = CustomKeywords.'customkeywords.myKeywords.randomString'()
GlobalVariable.TempAddress = Name

WebUI.setText(findTestObject('OPCPage/name_addaddress_opc'), Name)

WebUI.setText(findTestObject('OPCPage/shortName_addAddress_opc'), StoreValue)

WebUI.setText(findTestObject('OPCPage/mothersLastName_addAddress_opc'), GlobalVariable.MotherName)

WebUI.setText(findTestObject('OPCPage/Lastname_Address_OPC'), GlobalVariable.MotherName)

WebUI.callTestCase(findTestCase('CommonMethods/SaveAddressOPC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OPCPage/ContinueButtonAddcard_Checkout'))

WebUI.waitForPageLoad(0)

//WebUI.navigateToUrl(GlobalVariable.CartPageURL)
//WebUI.click(findTestObject('OPCPage/changeADDRESS_OPC'), FailureHandling.OPTIONAL)
//WebUI.click(findTestObject('OPCPage/Address_PopUP_option1_opc'), FailureHandling.OPTIONAL)
//WebUI.click(findTestObject('AccountManagement/AddAddress_Account'), FailureHandling.OPTIONAL)
ShortName = WebUI.getText(findTestObject('OPCPage/currentDeliveryAddress_OPC'), FailureHandling.STOP_ON_FAILURE)

if (StoreValue == ShortName) {
    println('Checked')
}

