package JUnitPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HudsonBay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thebay.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();;
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		Thread.sleep(2000);
			
		driver.findElement(By.className("nav_link nav_link--parent category__nav-link")).click();
		
		//Thread.sleep(3000);
		
		
		//(driver.findElement(By.xpath("//a[contains(text(),'MEN')]"))).click();
		
		
		

	}

}
