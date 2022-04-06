package TestLogin;



/*import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 

public class TestLoginUtil {
    
    static Workbook book;
    static Sheet sheet;
    
    public static String TESTDATA_SHEET_PATH ="C:\\Users\\Hemant Pandey\\Desktop\\Selenium\\Wordlogsign.xlsx";
    
    public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
        
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        }catch(IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for(int i = 0; i < sheet.getLastRowNum();i++) {
            for(int k = 0; k < sheet.getRow(0).getLastCellNum();k++) {
                data[i][k]= sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }
}*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestLoginUtil {
	WebDriver driver;

	@BeforeClass
	public void testSetup1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemant Pandey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@BeforeMethod
	public void openBrowser() throws InterruptedException {
		driver.get("https://wordwall.net/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("h3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign_in_btn")).click();
		Thread.sleep(1000);
	}

	
	@Test(priority = 1)
	public void Login1() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("Sumantpandey123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("amrendra@123");
		Thread.sleep(1000);
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
		Thread.sleep(8000);
		System.out.println("Invalid email entered & Invalid password entered ");
	}
	@Test(priority = 2)
	public void Login2() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("Sumantpandey@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sumant@123");
		Thread.sleep(1000);
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
		Thread.sleep(8000);
		System.out.println("Invalid email entered & Invalid password entered ");
	}
	@Test(priority = 3)
	public void Login3() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("Sumantpandey123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sumant@123");
		Thread.sleep(2000);
		driver.findElement(By.name("RememberMe")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#outer_wrapper > div.content-panel.info > form > div:nth-child(6) > div > button")).click();
		Thread.sleep(8000);
		System.out.println("Login Successfull");
		
	}
	@AfterMethod
	public void postSignUp() {
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(8000);
		driver.quit();
	}
  
}
