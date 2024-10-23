import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Wait_Mechanism {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();                                  
		
		      //{As FaceBook loads more than 3 sec so got error} 
		//Thread.sleep(3000);                                                                     //Thread.sleep() 
		
		      //(Implicit wait will wait for all the web elements dynamically --Global wait} 
		/*driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);                        //implicit Wait()
		driver.findElement(By.className("dropbtn")).click();                                    //(DROPDOWN option)
		driver.findElement(By.linkText("Facebook")).click();	*/                            //(DROPDOWN -FaceBook)
		
		
		
		       //{Explicit wait will wait only for the specific web element}
		/*driver.findElement(By.className("dropbtn")).click();                                  //(DROPDOWN option)
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement facebookElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));  //Explicit wait() //(DROPDOWN -FaceBook)
	    facebookElement.click();  */    
		
		        //{Sample program for fluent wait()}
		        //{ Waiting 30 seconds for an element to be present on the page, checking}
		        // {for its presence once every 5 seconds.}
		  /* Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)                 //Fluentwait()
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);

		   WebElement facebookElement = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.linkText("Facebook"));  */
		     }

}

