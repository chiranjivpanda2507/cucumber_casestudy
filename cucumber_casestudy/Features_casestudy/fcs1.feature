Feature: CaseStudy

Background: 
Given TestMe app is up

@Registration
Scenario: Registration
Given click on signup
And username is "chiranjiv123"
And First Name is "Chiranjiv"
And Last Name is "Panda"
And Password is "seleniumuft"
And Confirm password with "seleniumuft"
And Select Gender as "Male"
And Email is "chiranjiv@gmail.com"
And Mobile Number is "9874585478"
And Date of Birth is "11/25/1997"
And Address is "Bhubaneswar"
And Security question is "What is your Birth Place"
And Answer is "Barbil"
Then Click on Register

@Login
Scenario Outline: Login 
Given click on SignIn
And given username is "<username>"
And given password is "<password>"
Then click on Login
Examples: 
|username|    |password|
|lalitha|     |password123|
|chiranjiv123||seleniumuft|

@Addtocart
Scenario: product purchase
Given signin with credentials "lalitha" and "password123"
And search for a product 
And click on find details
And click on add to cart
And click on cart
Then check if the added product is in cart or not
And click on proceed to checkout
