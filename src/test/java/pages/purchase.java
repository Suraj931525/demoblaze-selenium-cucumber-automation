package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class purchase {

	 WebDriver driver;
	 public purchase(WebDriver driver) {
		   this.driver=driver; 
	   }
	 
	 By cartclick=By.id("cartur");
	 By placeorder=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	 By Name=By.id("name");
	 By Country=By.id("country");
	 By city=By.id("city");
	 By creditcard = By.id("card");
	 By month=By.id("month");
	 By year=By.id("year");
	 
	 By confirmPurchase=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
	 
	 By confirmok=By.xpath("/html/body/div[10]/div[7]/div/button");

	 
	 public void Cart() {
		 driver.findElement(cartclick).click();
		 
	 }
	 public void placeorderbutton() {
		 driver.findElement(placeorder).click();
	 }
	 public void name() {
		 driver.findElement(Name).sendKeys("Suraj");
	 }
	 public void Country() {
		 driver.findElement(Country).sendKeys("india");
	 }
	 public void city() {
		 driver.findElement(city).sendKeys("sangli");
	 }
	 public void creditcard() {
		 driver.findElement(creditcard).sendKeys("123456789");
	 }
	 
	 public void month() {
		 driver.findElement(month).sendKeys("january");
	 }
	 public void year() {
		 driver.findElement(year).sendKeys("2026");
	 }
	 public void confirmPurchase() {
		 driver.findElement(confirmPurchase).click();
	 }
	 public void confirmok() {
		 driver.findElement(confirmok).click();
	 }
}
