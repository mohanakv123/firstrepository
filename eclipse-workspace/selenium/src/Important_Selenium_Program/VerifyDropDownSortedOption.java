package Important_Selenium_Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOption {  

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver,chromedriver", "chromedriver");
		//Headless
		ChromeOptions option=new ChromeOptions();
		option.setHeadless(true);
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement ele=driver.findElement(By.id("animals"));
		Select sel=new Select(ele);
		
		List<WebElement> options=sel.getOptions();
		
		
		List orilist=new ArrayList();
		List templist=new ArrayList();
	       
		
		for(WebElement  e:options)
		{
			orilist.add(e.getText());
			templist.add(e.getText());
		}
		
		
         System.out.println("Before Sorting Original List"+orilist+" ");
         System.out.println("Before Sorting Templist"+templist+" ");
         
         Collections.sort(templist);
         
         System.out.println("After Sorting Original List"+orilist+" ");
         System.out.println("After Sorting Templist"+templist+" ");
         
         if(orilist==templist)
         {
        	 System.out.println("Dropdown sorted");
         }
         else
         {
        	 System.out.println("Dropdown Not sorted");
         }
     
        driver.close(); 
	}

}
