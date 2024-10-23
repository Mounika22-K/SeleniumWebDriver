import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Commands {

	public static void main(String[] args) throws InterruptedException {
	        //{path  to be saved}
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Demo Project\\Driver\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver","E:\\Selenium\\Demo Project\\Driver\\msedgedriver.exe");
		
		    //{Blank chrome browser launched }
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		 
		
		      //{Provided URL opened in chrome browser(Omayo URL)}
		driver.get("https://omayo.blogspot.com/");                                       //get()
		
		    //{Maximize the browser window}
		//driver.manage().window().maximize();                                             //manage().window().maximize
		
		    //{FullScreen the browser window}                     
		//driver.manage().window().fullscreen();                                          //manage().window().fullscreen()
		
		       //{Finding UI Elements}
		//WebElement element = driver.findElement(By.id("but2"));                        //findElement -id()  (But2 button)
		//WebElement element = driver.findElement(By.name("q"));                         //findElement -name() (Search this Blog Option)
		//WebElement element = driver.findElement(By.id("textbox1"));                     // (TextBox with preloader text heading -Selenium Webdriver)
		//WebElement element = driver.findElement(By.className("classone"));             //findElement -className() (Locate using class option)
		//WebElement element = driver.findElement(By.linkText("compendiumdev"));         //findElement -linkText()  ("compendium" Link)
		//WebElement element = driver.findElement(By.partialLinkText("compendium"));     //findElement -partialLinkText() ("compendium" Link)
		//WebElement element = driver.findElement(By.cssSelector("#confirm"));           //findElement -cssSelector()  (Confirmation dialog - getconfirmation)
              //{For shortcut remove WebElement element and add click commend in same line}   
		//driver.findElement(By.xpath("//input[@id='confirm']")).click();                //fineElement -xpath()  (Confirmation dialog - getconfirmation)
		
		        //{retrieve the element text}
		/*String text = driver.findElement(By.id("pah")).getText();                      //getText()    ("Practice Automation Here" link)
		System.out.println(text);*/
		
		        //{Retrieve the title of the page}
		/*String title = driver.getTitle();                                              //getTitle()
		System.out.println("Title of the Page is "+title);*/
		
		       //{Retrieve one or more URLS of the page at a time}
		/*String url1 = driver.getCurrentUrl();                                          //getCurrentUrl()
		System.out.println("URL of the Page is "+url1);
		driver.findElement(By.linkText("compendiumdev"));                                //("compendium" Link)
		String url2 = driver.getCurrentUrl();
		System.out.println("URL of the Page is "+url2);*/
		
		      //{Retrieve the value stored in the specified attribute value}
		/*String text = driver.findElement(By.id("textbox1")).getAttribute("value");       //getAttribute()  (TextBox with preloader text heading -Selenium Webdriver)
		System.out.println(text);*/
		
		      //{Find out whether the element is displayed on the page}
		/*Boolean displayed = driver.findElement(By.id("but2")).isDisplayed();               //isDisplayed()    (Button2)
		System.out.println("Button is displayed on the page is "+displayed);*/
		
		      //{Find out whether the element is enabled or disabled}
	    /*boolean enabled = driver.findElement(By.id("but1")).isEnabled();                   //isEnabled        (Button1)
		System.out.println("Button is enabled on the page :"+enabled);*/
		
		      //{Find out the radio options and checkbox options}
	    /*boolean selected = driver.findElement(By.id("checkbox1")).isSelected();            //isSelected          (Radio Options)
		System.out.println("Checkbox is selected on the page :"+selected);*/
		
		      //{Perform operations  to navigate by giving URL in back,forward and refresh the current page}
		/*driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");            //navigate()         (Selenium URL)
		driver.navigate().back();                                                              //navigate().back()
		driver.navigate().forward();                                                           //navigate().forward()
		driver.navigate().refresh();*/                                                         //navigate().refresh()
		
		      //{To Retrieve the sourcecode}
		/*String sourcecode = driver.getPageSource();                                        //getPageSource() (select Source code by right click on emptyspace)
		System.out.println(sourcecode);*/
		
		       //{To submit the form( logins and Retrieve the html Tagnames of Elements)}
		 /*driver.get("https://www.facebook.com/login/");                                     (Facebook URL)
			driver.manage().window().maximize();
			driver.findElement(By.id("email")).sendKeys("Mounika,kasiboyina@gmail.com");      (Facebook email)
			driver.findElement(By.id("pass")).sendKeys("1234");                               (Facebook password)
			driver.findElement(By.xpath("//button[@id='loginbutton']")).submit();           //submit()  (Facebook Login)
			   String tagName = driver.findElement(By.id("email")).getTagName();            //getTagName()  (Facebook email)
			   System.out.println(tagName);*/
		
		       //{To Retrieve the height,size and position of the given element}
		/*String value = driver.findElement(By.id("home")).getCssValue("text-align");       //CssValue()  (Home Option)    
		System.out.println(value);*/
		
		        //{To Retrieve the height and width}
		/*Dimension d = driver.findElement(By.id("but2")).getSize();                          //getSize()    (button2) 
		System.out.println("Height of the button is "+d.height);	
		System.out.println("Height of the button is "+d.width);  */
		
		       //{To Retrieve the height and width}
		/*Point p = driver.findElement(By.id("but2")).getLocation();                      //getLocation      (button2)
		System.out.println("X Coordinate of the button is "+p.x);	
		System.out.println("Y Coordinate of the button is "+p.y); */ 
		
		
		     //{Close the browser window}
		//driver.close();                                                                 //close()
		
		
		/*driver.findElement(By.linkText("Open a popup window")).click();                //       ("Open a Popup Window"Link)
		driver.findElement(By.linkText("Blog")).click();                                     //     (Blogger Link)
              //{Clear all available browser window}
		driver.quit();*/                                                                 //quit()       
		
		        //{findElements()-Find and return more number of WebElements}
		//By.tagName()-hyperlink text on the Web Page
		 /*List<WebElement> elements = driver.findElements(By.tagName("a"));              //findElenets()--By.tagName()   ("compendium" Link)
		 for(int i=0;i<elements.size();i++) {                                               using for loop
				 System.out.println(elements.get(i));
		 }*/
		
		/*List<WebElement> elements = driver.findElements(By.tagName("a"));              //findElenets()--By.tagName()   ("compendium" Link)
		 for(WebElement j : elements) {                                                     using for each loop
		     if(j.getText().length()>0){                                              
				 System.out.println(j.getText());*/

		       //{Hold the program execution for 5 sec}
		//Thread.sleep(5000);
		
		      //{Enter text into text field}
		//element.sendKeys("Mounika");                                                   //sendKeys()
		
		     //{Click on confirm button}
		//element.click();                                                               //click()
		
		     //{Clear the text}
		//element.clear();                                                               //clear()
		
	
		}	
}
