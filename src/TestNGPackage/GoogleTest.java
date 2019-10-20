package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
	    driver = new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();;
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");		
		
	}
	@Test
	public void  TitlePage(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void GoogleLog() {
		Boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	
	@Test
	public void linkTest() {
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.close();
	}
	



}
