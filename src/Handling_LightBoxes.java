import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_LightBoxes {
   public static void main(String []args){
	   System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://omayo.blogspot.com/p/lightbox.html");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	         // {Handling lightboxs (popups which maskes background no need "switchTo" here)}
	   driver.findElement(By.id("lightbox1")).click();
	   driver.findElement(By.cssSelector(".close.cursor")).click();
	   
   }
}
