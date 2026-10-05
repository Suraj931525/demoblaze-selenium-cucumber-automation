package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;

import base.Basetest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.Addtocard;
import pages.Login;
import pages.LogOut;
import pages.SignUp;
import pages.purchase;

public class PurchaseTestE2E extends Basetest {

    SignUp signup;
    Login login;
    Addtocard cart;
    purchase purc;
    LogOut logout;
    
    // Signup

    @Given("DemoBlaze website should be launched")
    public void demoblazeWebsiteShouldBeLaunched() {

        setup();

        signup = new SignUp(driver);
    }

    @When("user clicks on signup link")
    public void userClicksOnSignupLink() throws InterruptedException {

        signup.signaction();

        Thread.sleep(2000);
    }

    @And("user enter username")
    public void userEnterUsername() throws InterruptedException {

        signup.signupusernameaction();

        Thread.sleep(2000);
    }

    @And("user enter signup password")
    public void userEnterSignupPassword() throws InterruptedException {

        signup.signuppasswordaction();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
    }

    @And("user clicks on signup button")
    public void userClicksOnSignupButton() throws InterruptedException {

        signup.clicksignupbutton();

        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
        
    }

    @Then("signup should be successful")
    public void signupShouldBeSuccessful() {

        System.out.println("Signup successful");
//        driver.switchTo().alert().accept();
    }

    // Login

    @When("user clicks on login link")
    public void userClicksOnLoginLink() throws InterruptedException {

        login = new Login(driver);

        login.loginbuttonaction();

        Thread.sleep(2000);
    }

    @And("user enters username")
    public void userEntersUsername() throws InterruptedException {

        login.loginusernameaction();

        Thread.sleep(2000);
    }

    @And("user enters login password")
    public void userEntersLoginPassword() throws InterruptedException {

        login.loginpasswordaction();

        Thread.sleep(2000);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {

        login.confirmloginaction();

        Thread.sleep(2000);
    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {

        System.out.println("Login successful");
    }

    // Add to Cart

    @When("user clicks on Phones category")
    public void userClicksOnPhonesCategory() throws InterruptedException {

        cart = new Addtocard(driver);

        cart.clickOnPhone();

        Thread.sleep(2000);
    }

    @And("user selects a product")
    public void userSelectsAProduct() throws InterruptedException {

        cart.clickOnProduct();

        Thread.sleep(2000);
    }

    @And("user clicks on Add to cart")
    public void userClicksOnAddToCart() throws InterruptedException {

        cart.addToCart();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    @Then("product should be added in cart")
    public void productShouldBeAddedInCart() {

        System.out.println("Product added to cart successfully");
    }
    
    
    
    // purchase
    

@When("user click on cart")
public void user_click_on_cart() throws InterruptedException {
	purchase purc = new purchase(driver);
    purc.Cart();
    Thread.sleep(1000);
}

@When("click on place order")
public void click_on_place_order() {
	purchase purc = new purchase(driver);
   purc.placeorderbutton();
}

@When("Enter all valid Details")
public void enter_all_valid_details() throws InterruptedException {
	purchase purc = new purchase(driver);
    purc.name();
    purc.Country();
    purc.city();
    purc.creditcard();
    purc.month();
    purc.year();
    Thread.sleep(2000);
}

@When("click on purchase")
public void click_on_purchase() throws InterruptedException {
	purchase purc = new purchase(driver);
    purc.confirmPurchase();
    Thread.sleep(2000);
    purc. confirmok();
}

@Then("product order successfully")
public void product_order_successfully() {
	
    System.out.println("order place succesfully");
}



    // Logout

    @When("user clicks on Log out")
    public void userClicksOnLogOut() {

        logout = new LogOut(driver);

        logout.logout();
    }

    @Then("user should be logged out successfully")
    public void userShouldBeLoggedOutSuccessfully() {

        System.out.println("User logged out successfully");

        close();
    }
}