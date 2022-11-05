package Important_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Simple {

	public static void main(String[] args) {
		System.setProperty("webdriver,chromedriver", "chromedriver");
		//Object And Method To Make Headless
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		//^^^^^^^^^^^^^^^^^^^^^^^^
		WebDriver driver=new ChromeDriver(option);
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("9164689515");
		driver.findElement(By.name("pass")).sendKeys("70902656831");
	    driver.findElement(By.name("login")).click();
		System.out.println("The title of page is:"+driver.getTitle());
		String expectetitlr="Facebook";
		if (expectetitlr==driver.getTitle())
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is not pass");
		}
		
		driver.close();
	}

}
