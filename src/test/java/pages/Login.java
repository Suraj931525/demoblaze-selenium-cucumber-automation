package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

 public Login(WebDriver driver) {
	 this.driver=driver;
 }
 
 By loginbuttonclick=By.id("login2");
 By loginusername=By.id("loginusername");
 By loginpassword=By.id("loginpassword");
 By confirmlogin=By.xpath("//button[text()='Log in']");
 
 
 public void loginbuttonaction() {
	 driver.findElement(loginbuttonclick).click();
 }
 
 public void loginusernameaction() {
	 driver.findElement(loginusername).sendKeys(SignUp.username);
 }
 
 public void loginpasswordaction() {
	 driver.findElement(loginpassword).sendKeys(SignUp.password);
 }
 
 public void confirmloginaction() {
	 driver.findElement(confirmlogin).click();
 }
 
 
}