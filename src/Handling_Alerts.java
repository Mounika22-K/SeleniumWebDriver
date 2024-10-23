import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {
	
	public static void main(String [] args)  {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 driver.findElement(By.id("alert1")).click();                 //(AlertDemo --ClicktoGetAlert button
	     Alert alert = driver.switchTo().alert();                    //switchTo().alert()
	     String TextDisplayedOnAlert = alert.getText();              //alert.getText()
	     System.out.println(TextDisplayedOnAlert);
	     alert.accept();                                             //alert.accept()                                       
		 
	}

}
