package stepdef_casestudy;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import browsers.Drivers;
//import org.openqa.selenium.chrome.ChromeDriver;

import browsers.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
public class Stepdefine {
	WebDriver driver;
	

	@Given("TestMe app is up")
	public void testme_app_is_up() {
		driver=Drivers.getDriver1("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	    driver.manage().window().maximize(); 
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("click on signup")
	public void click_on_signup() {
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("username is {string}")
	public void username_is(String uname) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(uname);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("First Name is {string}")
	public void first_Name_is(String fname) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Last Name is {string}")
	public void last_Name_is(String lname) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Password is {string}")
	public void password_is(String pwd) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Confirm password with {string}")
	public void confirm_password_with(String cpwd) {
		driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys(cpwd);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Select Gender as {string}")
	public void select_Gender_as(String gender) {
		driver.findElement(By.xpath("//label[@class='form-control input-lg']//input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Email is {string}")
	public void email_is(String mail) {
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys(mail);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Mobile Number is {string}")
	public void mobile_Number_is(String mnumber) {
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys(mnumber);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Date of Birth is {string}")
	public void date_of_Birth_is(String dob) {
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(dob);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Address is {string}")
	public void address_is(String address) {
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Security question is {string}")
	public void security_question_is(String string) {
    Actions act=new Actions(driver);
    WebElement sq=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
    act.moveToElement(sq).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Answer is {string}")
	public void answer_is(String security) {
		driver.findElement(By.xpath("//input[@id='answer']")).sendKeys(security);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Click on Register")
	public void click_on_Register() {
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@Given("click on SignIn")
	public void click_on_SignIn() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("given username is {string}")
	public void given_username_is(String user) {
		driver.findElement(By.name("userName")).sendKeys(user);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("given password is {string}")
	public void given_password_is(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on Login")
	public void click_on_Login() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
	@Given("signin with credentials {string} and {string}")
	public void signin_with_credentials_and(String username, String pwd) {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("search for a product")
	public void search_for_a_product() {
		Actions act =new Actions(driver);
		   WebElement search=driver.findElement(By.id("myInput"));

		   act.keyDown(search, Keys.SHIFT).sendKeys("B").pause(3000).sendKeys("A").pause(3000).sendKeys("G").pause(3000).keyUp(Keys.SHIFT).perform();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Shopping bag')]"))).click().perform();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	//@Given("select the product")
	///public void select_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	//}

	@Given("click on find details")
	public void click_on_find_details() {
		driver.findElement(By.xpath("//form//input[@name='val']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("click on cart")
	public void click_on_cart() {
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("check if the added product is in cart or not")
	public void check_if_the_added_product_is_in_cart_or_not() {
		 WebElement ca = driver.findElement(By.tagName("h4"));
		   String productname = ca.getText();
		  if(productname=="Shopping Bag") {
			  System.out.println("Valid product");
		  }
		  else
		  {
			  System.out.println("Invalid product");
		  }
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on proceed to checkout")
	public void click_on_proceed_to_checkout() {
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
}
