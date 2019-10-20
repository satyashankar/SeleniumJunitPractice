package JUnitPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SandeepGoud\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\SandeepGoud\\Desktop\\docs\\PIC1.pdf");
		Thread.sleep(5000);
		 
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent Window Id"+ parentWindowId);	
			
		
		String childWindowId = it.next();
		System.out.println("chiled Window Id"+ childWindowId);
		
		//driver.switchTo().window(childWindowId);
		
		
		
		
		
		

	}

}
