import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.RemoteWebDriver

WebUI.openBrowser('')
WebUI.navigateToUrl('https://mail.google.com/mail/u/0/#inbox')
WebDriver driver = DriverFactory.getWebDriver()
driver.findElement(By.id('identifierId')).sendKeys('tranlexuan1711')
driver.findElement(By.id("identifierNext")).click()
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
driver.findElement(By.cssSelector('div>input[type=password][name=password]')).sendKeys('tranleheo')

WebElement btn = driver.findElement(By.id('passwordNext'))
WebUI.delay(10)
btn.click()
println ('login success ')
