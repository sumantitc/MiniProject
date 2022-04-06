package TestLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import UtilTest.TestLoginUtil;

public class SignUpTestNG {

	WebDriver driver;

	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Pandey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser1() throws InterruptedException {
	driver.get("https://wordwall.net/");
	driver.findElement(By.tagName("h3")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"outer_wrapper\"]/div[2]/div/div[1]/div[2]/a")).click();
	}

	
	@Test(priority = 1)
	public void signUp1() throws InterruptedException {
		driver.findElement(By.id("email_input")).clear();
		driver.findElement(By.id("email_input")).sendKeys("amrendrahp1@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("amre@1415");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm_password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		WebElement sel=driver.findElement(By.name("LocaleId"));
		Select selname= new Select(sel);
		selname.selectByVisibleText("Australia");
		Thread.sleep(1000);
		driver.findElement(By.name("Terms")).click();
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Test(priority = 2)
	public void signUp2() throws InterruptedException {
		driver.findElement(By.id("email_input")).clear();
		driver.findElement(By.id("email_input")).sendKeys("amrendrahp1gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm_password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		WebElement sel=driver.findElement(By.name("LocaleId"));
		Select selname= new Select(sel);
		selname.selectByVisibleText("Australia");
		Thread.sleep(1000);
		driver.findElement(By.name("Terms")).click();
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Test(priority = 3)
	public void signUp3() throws InterruptedException {
		driver.findElement(By.id("email_input")).clear();
		driver.findElement(By.id("email_input")).sendKeys("amrendrahp1gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("amre@1415");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm_password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		WebElement sel=driver.findElement(By.name("LocaleId"));
		Select selname= new Select(sel);
		selname.selectByVisibleText("Australia");
		Thread.sleep(1000);
		driver.findElement(By.name("Terms")).click();
		driver.findElement(By.linkText("Sign Up")).click();
	}
	@Test(priority = 4)
	public void signUp4() throws InterruptedException {
		driver.findElement(By.id("email_input")).sendKeys("sumant.hp1@gmail.com");
		driver.findElement(By.id("password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm_password_input")).sendKeys("sumu@1415");
		Thread.sleep(1000);
		WebElement sel=driver.findElement(By.name("LocaleId"));
		Select selname= new Select(sel);
		selname.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.name("Terms")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(10000);
		//driver.close();
		
		
	}
	@AfterMethod
	public void postSignUp() throws InterruptedException {
		System.out.println(driver.getCurrentUrl());

	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		driver.quit();
		
	}
	
	
}
