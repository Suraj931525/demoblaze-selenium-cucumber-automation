package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOut {

    WebDriver driver;

    By logOut = By.id("logout2");

    public LogOut(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.findElement(logOut).click();
    }
}