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

Mobile.tap(findTestObject('Edit Profile/android.view.View - Edit Profile Ico'), 0)

for (int i = 1; i <= 4; i++) {
    Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - Edit Profile'), 0)

    Mobile.setText(findTestObject('Edit Profile/android.widget.EditText - Nama Depan'), findTestData('profile_data').getValue(
            1, i), 0)

    Mobile.setText(findTestObject('Edit Profile/android.widget.EditText - Nama Belakang'), findTestData('profile_data').getValue(
            2, i), 0)

    Mobile.setText(findTestObject('Edit Profile/android.widget.EditText - Phone (1)'), findTestData('profile_data').getValue(
            3, i), 0)

    Mobile.tap(findTestObject('Object Repository/Edit Profile/android.widget.TextView - Update Profile'), 0)
}

