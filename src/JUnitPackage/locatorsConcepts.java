package JUnitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatorsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	//Filling FaceBook reg form
	
    //locator By.id	
	driver.findElement(By.id("u_0_e")).sendKeys("sathish");
	
	//locator By.name
	driver.findElement(By.name("lastname")).sendKeys("shankar");
	
	//locator By.xpath	
	driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("9704691010");
	
	driver.findElement(By.id("u_0_q")).sendKeys("123455");
	
	//locator: By.linktext
	//driver.findElement(By.linkText("Cookies Policy")).click();
	
	//cssseletor and drop down box by select method	
	Select selectmonth = new Select(driver.findElement(By.cssSelector("#month")));
	selectmonth.selectByVisibleText("May");
	Select selectdate = new Select(driver.findElement(By.cssSelector("#day")));
	selectdate.selectByVisibleText("13");
	Select selectyear = new Select(driver.findElement(By.cssSelector("#year")));
	selectyear.selectByVisibleText("1985");
	
	driver.findElement(By.id("u_0_9")).click();
	
	driver.findElement(By.id("u_0_y")).click(); 
}
}