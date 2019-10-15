package Test.Pack.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {
	
	   public static void main(String args[])
	   {  
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		   String baseUrl = "http://www.advantageonlineshopping.com/#/";					
		   driver.get(baseUrl);					

		   driver.manage().window().maximize();
		    }  

}

