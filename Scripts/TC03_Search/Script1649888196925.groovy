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

Mobile.tap(findTestObject('Search/android.view.View - Search Menu'), 0)

Mobile.tap(findTestObject('Search/android.widget.ImageView - Choose city'), 0)

Mobile.tap(findTestObject('Object Repository/Search/android.widget.TextView - Jakarta'), 0)

Mobile.tap(findTestObject('Search/android.widget.TextView - DatePicker'), 0)

Mobile.tap(findTestObject('Object Repository/Search/android.widget.TextView - 28'), 0)

Mobile.tap(findTestObject('Object Repository/Search/android.widget.TextView - 30 (1)'), 0)

for (int i = 1; i <= 4; i++) {
    Mobile.setText(findTestObject('Change/android.widget.EditText - Guest'), findTestData('guest_data').getValue(1, i), 
        0)

    Mobile.tap(findTestObject('Object Repository/Change/android.widget.TextView - Search'), 0)

    if (i != 4) {
        Mobile.pressBack()
    }
}

Mobile.verifyElementExist(findTestObject('Search/android.widget.TextView - Jakarta, Special Capital Region of Jakarta, Indonesia'), 
    0)

