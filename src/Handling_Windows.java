import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		      //{Main window (omayo URL)}
		//driver.get("https://omayo.blogspot.com/");                                       //get()
		//driver.manage().window().maximize();                                             //manage().window()..maximize()
		
		      //{Child Window ("Open a popup window" link)}
		//driver.findElement(By.linkText("Open a popup window")).click();                  //findElement -linkText() & click()
		
		      //{To retrieve all the ids of the currently opened windows}
		//Set<String> windowids = driver.getWindowHandles();                               //getWindowHandles()
		
		     // {while Condition written to verify all opened windows one after another}
		/*Iterator<String> itr = windowids.iterator();                                                                     
		while(itr.hasNext()) {                                    
		String childwindowid = itr.next();
		     //{Here switch to child window}
		driver.switchTo().window(childwindowid);                                         //switchTo()
		}
		      //{(Inside Text of "Open a popup window" link)}
		//String childwindow = driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText(); //findElement(By.cssSelector()
		System.out.println(childwindow);
		String mainwindowid = itr.next();
		       //{Return/switch to main window}
		//driver.switchTo().window(mainwindowid ); */
		
		      //{If Condition to verify specified window text from all the windows by giving title reference}
		driver.get("https://omayo.blogspot.com/");                                     
		driver.manage().window().maximize();                                             
		driver.findElement(By.linkText("Open a popup window")).click(); 
		driver.findElement(By.linkText("Blogger")).click();                   //(Blogger Link)
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();   
		String Textonpopupwindow = null;
		while(itr.hasNext()) {                                    
		String windowid = itr.next();
		driver.switchTo().window(windowid);
		if(driver.getTitle().equals("New Window")) {
		Textonpopupwindow = driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText();
		}
		}
		System.out.println(Textonpopupwindow);
	}

}
