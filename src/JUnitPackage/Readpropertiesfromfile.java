package JUnitPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Readpropertiesfromfile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\SandeepGoud\\eclipse-workspace\\seleniumProject\\src\\SelPackage\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver(); 	
			
			driver.get(url);
			
			driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstName"));
			driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
			driver.findElement(By.xpath(prop.getProperty("mobilenumber_xpath"))).sendKeys(prop.getProperty("MobileNumber"));
		
		
		
	}
	}


