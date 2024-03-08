package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

public static WebDriver driver;
String URL = "https://dsportalapp.herokuapp.com/home";

By signinLink = By.xpath("//a[text()='Sign in']"); 

By usernameTextbox = By.xpath("//input[@name='username']");
By passwordTextbox =By.xpath("//input[@name='password']");
By loginbtn = By.xpath("//input[@value='Login']");

By errorMsg = By.xpath("//div[@class='alert alert-primary']");

@Given("the user is on the DS_Algo introduction page")
public void the_user_is_on_the_ds_algo_introduction_page() {
    Common_Step_Def.driver.get(URL);
}

@When("the user clicks on Sign_in button")
public void the_user_clicks_on_sign_in_button() {
   Common_Step_Def.driver.findElement(signinLink).click();
}

@When("the user should be redirected to signin page")
public void the_user_should_be_redirected_to_signin_page() {
	String currentURL =Common_Step_Def.driver.getCurrentUrl();
	   String expectedURL = "https://dsportalapp.herokuapp.com/login";
	   Assert.assertEquals(currentURL, expectedURL);
	   System.out.println("User is on the signin page");
}

@Then("the user must able to see {string} link text box")
public void the_user_must_able_to_see_link_text_box(String string) {
   
}

@Given("the user is on the DS_Algo signin page")
public void the_user_is_on_the_ds_algo_signin_page() {
    
}

@When("The user clicks login button after leaving the {string} textbox and {string} textbox blank")
public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String string, String string2) {
    Common_Step_Def.driver.findElement(loginbtn).click();
}

@Then("The error message {string} appears below Username textbox")
public void the_error_message_appears_below_username_textbox(String string) {
	WebElement activeElement = Common_Step_Def.driver.switchTo().activeElement();
	String messageStr = activeElement.getAttribute("validationMessage");
	System.out.println("Actual message appeared on screen: " + messageStr);
    
}

@When("The user clicks login button after entering the {string} textbox and leaves  {string} textbox blank")
public void the_user_clicks_login_button_after_entering_the_textbox_and_leaves_textbox_blank(String string, String string2) {
	Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("quantum@testers");
    Common_Step_Def.driver.findElement(loginbtn).click();
	
}

@Then("The error message {string} appears below Pwd textbox")
public void the_error_message_appears_below_pwd_textbox(String string) {
	WebElement activeElement = Common_Step_Def.driver.switchTo().activeElement();
	String messageStr = activeElement.getAttribute("validationMessage");
	System.out.println("Actual message appeared on screen: " + messageStr);
}

@When("the user clicks login button after entering invalid username and invalid password")
public void the_user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
	Common_Step_Def.driver.findElement(usernameTextbox).clear();
	Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("hello");
    Common_Step_Def.driver.findElement(passwordTextbox).sendKeys("numpyninja");
    Common_Step_Def.driver.findElement(loginbtn).click();
}

@Then("the user should able to see an error message {string}.")
public void the_user_should_able_to_see_an_error_message(String string) {
	String errormsg = Common_Step_Def.driver.findElement(errorMsg).getText();
	System.out.println(errormsg);
}

@When("The user clicks login button after entering valid username and valid password")
public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
	Common_Step_Def.driver.findElement(usernameTextbox).clear();
	Common_Step_Def.driver.findElement(passwordTextbox).clear();
	Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("quantum@testers");
	Common_Step_Def.driver.findElement(passwordTextbox).sendKeys("numpyninja1234");
	Common_Step_Def.driver.findElement(loginbtn).click();
}

@Then("The user should land in Data Structure Home Page")
public void the_user_should_land_in_data_structure_home_page() {
	String currentUrl = Common_Step_Def.driver.getCurrentUrl();
	   String expectedUrl ="https://dsportalapp.herokuapp.com/home";
	   Assert.assertEquals(currentUrl, expectedUrl);
	   System.out.println("User is on the hompage");
}



}