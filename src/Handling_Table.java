import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Table {
	public static void main(String []args)   {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Demo Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		      
		       // {Printing Heading of the  tables}
		/*List<WebElement> headings = driver.findElements(By.xpath("//table[@id='table1']//th"));
		for(int i=0;i<headings.size();i++) {
			System.out.println(headings.get(i).getText());
		}*/
		
		
		       //{Body of Table}
		/*List<WebElement> body = driver.findElements(By.xpath("//table[@id='table1']//tbody"));
		for(int i=0;i<body.size();i++) {
			System.out.println(body.get(i).getText());
		}*/
		
		
		              //{Data in the table}
		/*List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']//td"));
		for(int i=0;i<data.size();i++) {
			System.out.println(data.get(i).getText());
		}*/
		
		
		              //{Single Row Data in the table}
		/*List<WebElement> singledata = driver.findElements(By.xpath("//table[@id='table1']//tr[1]/td"));
		for(int i=0;i<singledata.size();i++) {
			System.out.println(singledata.get(i).getText());
		}*/
		
		
		        //{Finding out the place with the help of name}
		/*String givenName = "Praveen";
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='table1']//td[1]"));
		int row=0;
		for(int i=0;i<names.size();i++) {
		if (names.get(i).getText().equalsIgnoreCase(givenName)) {
			row=i;
		     }
		}	
		String path = "//table[@id='table1']//tr["+(row+1)+"]//td[3]";	
		System.out.println(driver.findElement(By.xpath(path)).getText());*/
		 
		           //{Size of Rows and Columns}
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id='table1']//tr[1]//td")).size());
	}

}
