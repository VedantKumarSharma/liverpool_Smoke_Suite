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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.callTestCase(findTestCase('CommonMethods/login_odtaqab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/MIsCompras_loginUser_HP'))

WebUI.click(findTestObject('AccountManagement/DeliveryAddress_Account'))

boolean add = WebUI.verifyElementPresent(findTestObject('AccountManagement/QATESTING_address_AM'), 0, FailureHandling.OPTIONAL)

if (add == true) {
    WebUI.click(findTestObject('AccountManagement/Select3dotQATESTING_Add_AM'))

    WebUI.click(findTestObject('AccountManagement/QAtesting_Address_Remove_AM'))

    WebUI.click(findTestObject('AccountManagement/AcceptButton_AccountM'))
}

WebUI.click(findTestObject('AccountManagement/AddAdressPersonal_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SaveAddress_AccountManagment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AccountManagement/KeepButtonClickNCollection_Account'))

Address1 = WebUI.getText(findTestObject('AccountManagement/TestQA_Add_AM'))

if (GlobalVariable.TempAddress == Address1) {
    println('Address Added Successful')
} else {
    KeywordUtil.markFailed('Address is not Added !')
}

WebUI.click(findTestObject('AccountManagement/Select3Dot_TestQA_Add_AM'))

WebUI.click(findTestObject('AccountManagement/TestQA_Add_Editar_AM'), FailureHandling.STOP_ON_FAILURE)

name = 'QATESTING'

GlobalVariable.TempAddress = name

WebUI.clearText(findTestObject('AccountManagement/ShortName_Account'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('AccountManagement/ShortName_Account'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('AccountManagement/ShortName_Account'), name)

WebUI.click(findTestObject('AccountManagement/AcceptButton_AccountM'))

Address1 = WebUI.getText(findTestObject('AccountManagement/QATESTING_address_AM'))

if (GlobalVariable.TempAddress == Address1) {
    println('Address update Successful')
} else {
    KeywordUtil.markFailed('Address is not Updated !')
}

WebUI.click(findTestObject('AccountManagement/Select3dotQATESTING_Add_AM'))

WebUI.click(findTestObject('AccountManagement/QAtesting_Address_Remove_AM'), FailureHandling.STOP_ON_FAILURE)

println(GlobalVariable.TempAddress)

WebUI.verifyTextPresent(GlobalVariable.TempAddress, false)

WebUI.click(findTestObject('WishListPage/Acceptor_Eliminar_wishlist_WP'))

