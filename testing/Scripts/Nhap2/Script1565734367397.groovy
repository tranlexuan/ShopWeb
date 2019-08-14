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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Desktop.Action as Action
import java.util.concurrent.TimeUnit as TimeUnit
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.ExpectedCondition as ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mail.google.com/mail/u/0/#inbox')

WebDriver driver = DriverFactory.getWebDriver()

//gmail login
driver.findElement(By.id('identifierId')).sendKeys('tranlexuan1711')

driver.findElement(By.id('identifierNext')).click()

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

driver.findElement(By.cssSelector('div>input[type=password][name=password]')).sendKeys('tranleheo')

WebElement btn = driver.findElement(By.id('passwordNext'))

WebUI.delay(10)

btn.click()

// watting time for mail box loading
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)

//WebElement element = driver.findElement(By.cssSelector('table>tbody>tr:nth-child(4)'))

//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)

//Actions action2 = new Actions(driver)

//action2.moveToElement(element).perform()
WebElement gg = driver.findElement(By.className("yP"))
String gg1 = gg.text()
if(gg1 == 'Google')
	{
		println('Tim duoc class name yP ')
	}
else 
	{
		println('false ')
	}
//chuyển thành unread + chup hinh
//List<WebElement> unRead = driver.findElements(By.cssSelector('td.bq4.xY>ul.bqY>li.bqX.brs'))

//unRead[3].click()

//println(' đã click unread ')

//WebUI.takeScreenshot('D:\\hinhanh\\unread.png')

// chuyen thanh button read + chup hinh
//WebElement read = driver.findElement(By.cssSelector('td.bq4.xY>ul.bqY>li.bqX.brr'))

//println('đã tìm được read')
//WebUI.delay(5)
//read.click()

//println('đã click read ')

//WebUI.takeScreenshot('D:\\hinhanh\\read.png')





