import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Handling_SingleOrMultiselection_Options {
	
	public static void main(String [] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		       //{Selecting Single Dropdown Options}
		/*WebElement dropdownfield = driver.findElement(By.id("drop1"));          //(Old Newspaper Dropdown)
		Select select = new Select(dropdownfield); */                               //Select class
		
		//select.selectByVisibleText("doc 3");                                    //selectByVisibleText() 
		           //or
		//select.selectByIndex(3);                                                //selectByIndex()
		
		
		
		      //{Selecting Multiple option in MultiselectionBoxFiled}
		/*WebElement MultiSelectionBoxField = driver.findElement(By.id("multiselect1"));    //(Multi Selection Box)
		Select select = new Select(MultiSelectionBoxField); */                              //Select class                             
		
		/*select.selectByVisibleText("Volvo");                                              //selectByVisibleText()
		select.selectByVisibleText("Hyundai");
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);
		select.selectByVisibleText("Hyundai");
		select.deselectByValue("Hyundai"); */                                               //deselectByValue() 
		          //or
		/*select.selectByValue("volvox");                                                 //selectByValue()
		select.selectByValue("Hyundaix");
		select.selectByValue("audix");
		Thread.sleep(3000);
		Thread.sleep(3000);
		select.deselectByValue("Hyundaix"); */                                          //deselectByValue()
		             
		
		
		
		
	}

}
