import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	 public static void main(String [] args)  {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		         //{Handling inside the frame elements} 
		 /* WebElement iframe2 = driver.findElement(By.id("iframe2"));      //(iframe1 &iframe2 )
		          //{ SwitchTo().frame() is used to switch the frame} 
		 driver.switchTo().frame(iframe2);
		 driver.findElement(By.id("q")).sendKeys("Mounika");              //(iframe1 &iframe2) 
		     //{As text area filed is outside of the  above frame (normal  frame) need to switch it back to normal frame.Use switchTo().defaultContent()}
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("ta1")).sendKeys("Mounika");     */        //(text area)        
		 
		         //{Handling frames Using Tag Names}
		System.out.println(driver.findElement(By.tagName("iframe")).size();
		 
	 
	 }
}
