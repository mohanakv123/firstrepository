package Important_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HandlingWebTable
{
public static void main(String args[])
{
	
	//System.setProperty("webdriver,chromedriver", "chromedriver");
	
	
	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new SafariDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9165689515");
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("70902656831");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	
	
	
	
	

	
	
}
}
