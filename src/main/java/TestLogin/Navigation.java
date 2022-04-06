package TestLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigation {
	WebDriver sign;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Pandey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		sign=new ChromeDriver();
		//sign.manage().window().maximize();
		sign.get("https://wordwall.net/");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void Navipage() throws InterruptedException {
		sign.findElement(By.linkText("Features")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Interactives and printables")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Create using templates")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Switching template")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Edit any activity")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Themes and options")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Sharing with teachers")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Embedding on a website")).click();
		Thread.sleep(2000);
		sign.findElement(By.linkText("Student assignments")).click();
		Thread.sleep(3000);


	}
	@Test(priority=2)
	public void Navipriceplan() throws InterruptedException {
		sign.findElement(By.linkText("Price Plans")).click();
		Thread.sleep(3000);
		System.out.println("PricePlan Navigated successfully");

	}
	@Test(priority=3)
	public void NaviHome() throws InterruptedException {
		sign.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		System.out.println("Back To Home navigated");
	}
	@AfterMethod
	public void tearDown() {
		sign.quit();
	}

}



