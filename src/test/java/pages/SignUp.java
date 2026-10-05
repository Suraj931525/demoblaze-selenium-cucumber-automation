package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    WebDriver driver;
    
    public static String username="user"+System.currentTimeMillis();
    public static String password="Suraj";

   public SignUp(WebDriver driver) {
	   this.driver=driver; 
   }
   
   By signupclick=By.id("signin2");
   By signupusername=By.id("sign-username");
   By signuppassword=By.id("sign-password");
   By signupconfirmbutton=By.xpath("//button[text()='Sign up']");
   
   public void signaction() {
	   driver.findElement(signupclick).click();
   }
   public void signupusernameaction() {
	   driver.findElement(signupusername).sendKeys(username);
		   
	   
   }
   public void signuppasswordaction () {
	   driver.findElement(signuppassword).sendKeys(password);
   }
   
   
   public void clicksignupbutton() {
	   driver.findElement(signupconfirmbutton).click();
   }
   
   
   
   
}