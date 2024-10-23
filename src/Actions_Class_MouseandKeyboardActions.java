import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_Class_MouseandKeyboardActions {
 public static void main(String []args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	
	        // {Mouse click Operation  by using program}
	 /*driver.get("https://omayo.blogspot.com/p/lightbox.html");
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 	 
	      //{Mouse click operation by using "moveToElement()"}
	  WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));                                  //(blogsmenu header)
	 WebElement Selenium143option = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));  //(blogsmenu --selenium143) 
	         //{Actions() should be used to perform Mouse click operations}
	 Actions a = new Actions(driver);
	        //{Inorder to perform the action //moveToElement and perform--should be used at the end.}
	 a.moveToElement(blogsmenu).perform();                                                         //perform()  //(blogsmenu header)
	        //{If we have number of actions is be performed so  add build() as well}
	 a.moveToElement(Selenium143option).click(Selenium143option).build().perform(); */        //click(),build(),perform() //(blogsmenu --selenium143)
	 
	 
	 
	      //{Increasing and Decresing slides click operation by using dragAndDropBy() }
	/*driver.get("https://omayo.blogspot.com/p/page3.html"); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	 WebElement minPrice = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));   //RangeSlider
	 Actions a = new Actions(driver);
	 Thread.sleep(2000);
	      //{Increase the slide by using "dragAndDropBy()"}
	 a.dragAndDropBy(minPrice,100,0).perform();                                                       //dragAndDropBy()                     
	 Thread.sleep(2000);
	      //{Decrease the slide by using "dragAndDropBy()"}
	 a.dragAndDropBy(minPrice,-200,0).build().perform();  */                                            //dragAndDropBy() 
	 
	 
	 
	      //{Right click the searchbox filed}
	/* driver.get("https://omayo.blogspot.com/p/page3.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	 WebElement searchbox = driver.findElement(By.name("q"));                                      //{search this blog -- searchbox
	  Actions a = new Actions(driver);
	  Thread.sleep(2000);
	     //{Right click on searchbox using "contextClick()"}
	  a.contextClick(searchbox).perform();  */                                                    //contextClick()
	 
	 
	 
	         //{Double click  the search box field to enter text}
	 /*driver.get("https://omayo.blogspot.com/p/page3.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	 WebElement searchbox = driver.findElement(By.name("q"));                //{search this blog -- searchbox
	 Thread.sleep(3000);
	        //{Use "sendKeys()" to enter text}
	 searchbox.sendKeys("Mounika");                                         //sendKeys()
	 Actions a = new Actions(driver);
	 Thread.sleep(2000);
	       //{ Use "doubleClick" to search box field}
	 a.doubleClick(searchbox).perform();  */                                     //doubleClick()
	
	 
	 
	          //{Drag and Drop the Element horizontally or vertically from one place to another}
	/* driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	WebElement Oslo = driver.findElement(By.id("box1"));                        //Drag and drop - demo 3 box --Oslo field
	WebElement Norway = driver.findElement(By.id("box101"));                    //Drag and drop - demo 3 box --Norway field
	Actions a = new Actions(driver);
	Thread.sleep(3000);
	        //{Drag Oslo and drop it in norway field using "dragAndDrop()"}
	a.dragAndDrop(Oslo, Norway).perform(); */                                   //dragAndDrop()
	 
	 
	 
	          //Keyboard Keys to hold and leave (Ctrl)Key
	/* driver.get("https://omayo.blogspot.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 
	 WebElement compendiumDevLink = driver.findElement(By.linkText("compendiumdev"));    //(Other sites to practice automationn -compendiumdev)
	 Actions a = new Actions(driver);
	        // {keyDown is a class of Action used to  hold the key}
	        // {keyUp is a class of Action used to release the key}
	       //{Key is a class of Key  and CONTROL is ctrl button in keyboard}
	 Thread.sleep(3000);
	 a.keyDown(Keys.CONTROL).click(compendiumDevLink).keyUp(Keys.CONTROL).build().perform(); */  //keyDown()--Hold the Key & keyUp()--Release the Key.
	 
	 
	 
	        //Keyboard Keys for Shifting the cursor to other elements (Tab) Key 
	/* driver.get("https://omayo.blogspot.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  
	 WebElement usernamefield = driver.findElement(By.name("userid"));               //Simple Login Page --Username
	  usernamefield.sendKeys("Mounika");
	  Actions a = new Actions(driver);
	        //{sendKeys() Tab() is  used for (Tab) key}
	        //{//{sendKeys(Keys.TAB) -- Moving the cursor}
	  a.sendKeys(Keys.TAB).perform();                                                //sendKeys(Keys.TAB)
	  Thread.sleep(3000);
	  WebElement passwordfield = driver.findElement(By.name("pswrd"));              //Simple Login Page --Password
	  passwordfield.sendKeys("1234");
	  Thread.sleep(2000);
	        //{Moving the cursor through (tab)key and click on (enter) key}
	        //{sendKeys(Keys.TAB) -- Moving the cursor}
	        //{sendKeys(Keys.ENTER) -- Clicking on Enter}
	  a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();       */           //sendKeys(Keys.TAB) & sendKeys(Keys.ENTER)
	  
	 
	 
	             //Login using Enter key
	/* driver.get("https://omayo.blogspot.com/p/page3.html");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	 driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	 driver.findElement(By.id("input-email")).sendKeys("Mounika2gmail.com");         //(Email Address)
	 driver.findElement(By.id("input-password")).sendKeys("1234");                   //(Password)
	 //{Enter after password i.e., Login after enter clicks on login button}
	 driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);    */           //enter which is login
	 
	 
	            //{Performing Two Keys(Ctrl+Z) at a time by Using "Keys.chord"  
	 driver.get("https://omayo.blogspot.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	 driver.findElement(By.id("ta1")).sendKeys("Mounika");                             // Text Area Field
	 Thread.sleep(2000);
	        //{Performing two keys (Ctrl+z) as "sendKeys(Keys.chord(Keys.CONTROL,"z"))"}
	        // (Ctrl+z) --- Used to Erase wwriiten text.
	 driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));            //sendKeys(Keys.chord(Keys.CONTROL,"z"))	 
 }
}
