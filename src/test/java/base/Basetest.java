package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basetest {
	public static WebDriver driver;
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
	}
	
	public  void close(){
		driver.quit();
	}
	
    
}