package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocard {

    WebDriver driver;

    By clickOnPhone = By.xpath("//a[text()='Phones']");
    By clickOnProduct = By.xpath("//a[text()='Samsung galaxy s6']");
    By addToCart = By.xpath("//a[text()='Add to cart']");

    public Addtocard(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnPhone() {
        driver.findElement(clickOnPhone).click();
    }

    public void clickOnProduct() {
        driver.findElement(clickOnProduct).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }
}