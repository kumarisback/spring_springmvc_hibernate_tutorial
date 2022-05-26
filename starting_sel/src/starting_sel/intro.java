package starting_sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class intro  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//code for firefox 
		//		geckodriver for firefox  
		//		WebDriver driver =new FirefoxDriver/EdgeDriver();
		
		//		System.setProperty("webdriver.gecko.driver", "D:/chromedriver_win32/chromedriver.exe");
		
		//used to set the chromedriver or any driver you are using and setting them  in webdriver
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
		//invoking browser
		WebDriver driver =new ChromeDriver();
		
		//passing url where you want to go
		driver.get("https://www.google.com/");
		
		//it will give you the title of your page
		driver.getTitle();
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		driver.close(); //use to close your main url which you have used to quit all url you can use       "driver.quit()" it will close all url
		}

}
