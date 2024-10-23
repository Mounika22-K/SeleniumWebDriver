import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_AUTO_suggestive_Dropdowns {
	public static void main(String []args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		WebElement logo = driver.findElement(By.xpath("//a[@data-cy='mmtLogo']"));           //("Make My Trip" Logo)
		Actions a = new Actions(driver);
		a.moveToElement(logo).click().build().perform();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");       //("From"  Select Location")
		Thread .sleep(3000);
	    int i=0;
	    while(i<4) {   
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		i++;
	    }
	    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
	}

}
