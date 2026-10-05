# DemoBlaze Selenium Cucumber Automation

## 📌 Project Overview

This project is an **End-to-End Web Automation Testing Framework** developed for the [DemoBlaze](https://www.demoblaze.com/) e-commerce website.

The project automates important user flows such as **user registration, login, product selection, adding products to the cart, placing an order, and logout**.

The framework is developed using **Java, Selenium WebDriver, Cucumber BDD, Maven, and Page Object Model (POM)**.

---

## 🚀 Technologies Used

* **Java**
* **Selenium WebDriver**
* **Cucumber BDD**
* **Maven**
* **TestNG**
* **JUnit**
* **Page Object Model (POM)**
* **Eclipse IDE**
* **Chrome WebDriver**

---

## 🏗️ Project Structure

```text
demoblaze-selenium-cucumber-automation/
│
├── features/
│   └── featuresE2E.feature
│
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── Basetest.java
│           │
│           ├── pages/
│           │   ├── SignUp.java
│           │   ├── Login.java
│           │   ├── Addtocard.java
│           │   ├── purchase.java
│           │   └── LogOut.java
│           │
│           └── stepdefinitions/
│               ├── PurchaseTestE2E.java
│               └── demoBlazeFlowRunner.java
│
├── pom.xml
└── README.md
```

---

## 🧪 Automated Test Scenarios

The project covers the following end-to-end scenarios:

### 1. User Signup

* Launch DemoBlaze website
* Click on Signup
* Enter username
* Enter password
* Click Signup
* Verify successful registration

### 2. User Login

* Click Login
* Enter valid username
* Enter password
* Click Login
* Verify successful login

### 3. Add Product to Cart

* Navigate to Phones category
* Select a product
* Click **Add to cart**
* Handle confirmation alert
* Verify product is added to cart

### 4. Place Order

* Open Cart
* Click **Place Order**
* Enter customer details
* Enter payment details
* Click Purchase
* Verify order completion

### 5. User Logout

* Click Logout
* Verify user is logged out successfully

---

## 🧩 Framework Design

The project follows the **Page Object Model (POM)** design pattern.

### Base Class

`Basetest.java`

Responsible for:

* Starting Chrome browser
* Opening DemoBlaze website
* Maximizing browser window
* Closing the browser

### Page Classes

The application pages are separated into individual classes:

* `SignUp.java` → Signup functionality
* `Login.java` → Login functionality
* `Addtocard.java` → Product and cart functionality
* `purchase.java` → Order placement functionality
* `LogOut.java` → Logout functionality

### Step Definitions

`PurchaseTestE2E.java`

Contains the implementation of the Cucumber steps and connects the feature file with the page objects.

### Feature File

`featuresE2E.feature`

Contains the BDD scenarios written in **Given / When / Then** format.

---

## 🔄 Test Flow

```text
Launch Website
      ↓
    Signup
      ↓
     Login
      ↓
Select Product
      ↓
  Add to Cart
      ↓
 Place Order
      ↓
 Purchase Product
      ↓
    Logout
```

---

## ⚙️ Prerequisites

Before running this project, make sure you have:

1. Java JDK installed
2. Eclipse IDE installed
3. Maven installed/configured
4. Google Chrome installed
5. Selenium WebDriver dependencies
6. Cucumber dependencies

---

## 📥 Clone the Repository

```bash
git clone https://github.com/your-username/demoblaze-selenium-cucumber-automation.git
```

Navigate to the project:

```bash
cd demoblaze-selenium-cucumber-automation
```

---

## ▶️ Run the Tests

Run the project using Maven:

```bash
mvn test
```

You can also execute the Cucumber runner from Eclipse.

---

## 📊 Test Reports

After execution, Cucumber generates an HTML report.

```text
target/cucumberReport.html
```

Test execution reports can also be found inside:

```text
test-output/
```

---

## 🎯 Key Learning Outcomes

Through this project, the following automation testing concepts were practiced:

* Selenium WebDriver automation
* Cucumber BDD
* Feature files
* Step definitions
* Page Object Model
* Maven project management
* Browser automation
* Web element locators
* Alerts handling
* End-to-End testing
* Test execution and reporting
* Reusable page classes

---

## 🔮 Future Improvements

The framework can be enhanced by adding:

* Explicit waits instead of `Thread.sleep()`
* Assertions for proper validation
* Screenshot capture on test failure
* Better test data management
* Configuration/property files
* WebDriverManager
* Extent Reports
* Parallel test execution
* CI/CD integration using Jenkins or GitHub Actions

---

## 👨‍💻 Author

**Your Name**

Java | Selenium | Cucumber | Automation Testing

---

## ⭐ Project

If you find this project useful for learning Selenium and Cucumber automation testing, consider giving the repository a ⭐.
