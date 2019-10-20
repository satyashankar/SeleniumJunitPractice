package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicsAnnoations {
	
	@BeforeSuite
	public void SetUP(){
	System.out.println("setup system propeerty for chrome");		
	}
	
	@BeforeTest
	public void lauchBrowser() {
		System.out.println("launch Browser");		
		
	}
	
	@BeforeClass
	public void login() {
		System.out.println("login to app");			
		
	}
	
	@BeforeMethod
	public void enterUrl(){
		System.out.println("enter url");		
		
	}
	
	@Test
	public void GoogleTest(){
		System.out.println("title of the page");
		
		}
	@AfterMethod
	public void deleteAllCookies() {
		System.out.println("Delete All Cookies");		
		
	} 
	@AfterClass
	public void logut() {
		System.out.println("logout from the app");		
		
	}
	
	
	

}
