Feature: DemoBlaze Website Flow

Scenario: To verify user signs up successfully in DemoBlaze website
Given DemoBlaze website should be launched
When user clicks on signup link
And user enter username
And user enter signup password
And user clicks on signup button
Then signup should be successful

Scenario: To verify user logs in successfully using valid credentials
When user clicks on login link
And user enters username
And user enters login password
And user clicks on login button
Then login should be successful

Scenario: To verify product is added to cart
When user clicks on Phones category
And user selects a product
And user clicks on Add to cart
Then product should be added in cart

Scenario:To verify that place order sucessfully
When user click on cart 
And click on place order
And Enter all valid Details
And click on purchase
Then product order successfully





Scenario: To verify user logs out successfully
When user clicks on Log out
Then user should be logged out successfully


