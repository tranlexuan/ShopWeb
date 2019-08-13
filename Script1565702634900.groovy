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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait 
import java.util.concurrent.TimeUnit as TimeUnit

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

// action 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
List <WebElement> checkboxs= driver.findElements(By.cssSelector("div[class='oZ-jc T-Jo J-J5-Ji ']"));
for(int i = 1 ; i < 10 ; i++)
	{
		checkboxs[i].click()
	}

//driver.findElement(By.cssSelector("td[class='oZ-x3 xY']>div[class='oZ-jc T-Jo J-J5-Ji '][id=':3o']")).click()
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)

driver.findElement(By.cssSelector("div[class='asa']>div[class='ar9 T-I-J3 J-J5-Ji']"))
println('đã tìm được nút xóa ')
//driver.findElement(By.cssSelector("div[class='ar9 T-I-J3 J-J5-Ji']")).click()
//println ('đã xóa 1 email ')
