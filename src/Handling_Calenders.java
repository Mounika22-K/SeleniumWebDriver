import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Calenders {
    public static void main(String []args) throws InterruptedException  {
    	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	    //{Select Calender dates}
    	driver.get("https://www.path2usa.com/travel-companion/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	WebElement dot = driver.findElement(By.id("form-field-travel_comp_date"));
    	Actions a = new Actions(driver);
    	a.moveToElement(dot).click().build().perform();
    	
    	System.out.println(driver.findElement(By.className("cur-month")));

    	
   //while(!driver.findElement(By.className("cur-month")).getText().contains("December")) {
    	//	 driver.findElement(By.className("flatpickr-next-month")).click();
    	//	 Thread.sleep(1000);
    	//}

    	
//    	int i=0;
//    	while (i<2) {
//        driver.findElement(By.className("flatpickr-next-month")).click();
//    	Thread.sleep(2000);
//    	i++	;
//    	}
   // 	 driver.findElement(By.xpath("//span[@class='flatpickr-day '][15]"));
   // 	 Thread.sleep(2000);
    //	 Actions a1= new Actions(driver);
    //	a1.moveToElement(dot).click().build().perform();
    		}
    	
    }

