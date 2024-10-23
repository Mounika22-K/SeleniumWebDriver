import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taking_Screenshots {
   public static void main(String []args) throws IOException   {
	   System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://omayo.blogspot.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	   //{Take Screenshot for above omayo.blogspot website below program shoould be used}
	   File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	   FileUtils.copyFile(src1, new File("screenshots\\screenshot1.png"));
	  
	   driver.findElement(By.linkText("theautomatedtester")).click();                  //linkText()   (theautomatedtester Link)
	   //{Take another Screenshot for above link}
	   File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src2, new File("screenshots\\screenshot2.png"));
	   
   }
}
