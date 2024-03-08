package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graph {
	
	
	public static WebDriver driver;
	
	By signinLink = By.xpath("//a[text()='Sign in']");
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");
	
	String URL = "https://dsportalapp.herokuapp.com/login";
	
	By Getstarted_btn = By.xpath("//a[@href='graph']");
	By Graphlink = By.xpath("//a[@href = 'graph']");
	By try_here = By.xpath("//a[@class='btn btn-info']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text() = 'Run']");
	By graphrepresentation = By.xpath("//a[text() = 'Graph Representations']");
	By practice_qp = By.xpath("//a[@class = 'list-group-item list-group-item-light text-info']");
	By empty_pp = By.xpath("//html[@lang = 'en']");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	
	@Given("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		
		Common_Step_Def.driver.get(URL);
	    
	}

	@When("user must enter the username and password")
	public void user_must_enter_the_username_and_password() {
		
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("quantum@testers");
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys("numpyninja1234");
		
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {
		
		Common_Step_Def.driver.findElement(loginbtn).click();
	    
	}

	@Given("user clicks the get started button below the graph")
	public void user_clicks_the_get_started_button_below_the_graph() {
		
		Common_Step_Def.driver.findElement(Getstarted_btn).click();
	    
	}

	@When("the user clicks graph link")
	public void the_user_clicks_graph_link() {
		
		Common_Step_Def.driver.findElement(Graphlink).click(); 
	    
	}

	@When("the user clicks try here button")
	public void the_user_clicks_try_here_button() {
		
		Common_Step_Def.driver.findElement(try_here).click();
	   
	}

	@Then("the user should be directed to the url {string}")
	public void the_user_should_be_directed_to_the_url(String string) {
	   
	}

	@Then("the user writes the valid python code with (.*) and (.*)$")
	public void the_user_writes_the_valid_python_code_with_print_hello_and_expected_output(String input , String output) {
		
		Common_Step_Def.driver.findElement(textbox).sendKeys(input);
	    
	}

	@Then("user should clicks the run button")
	public void user_should_clicks_the_run_button() {
		
		Common_Step_Def.driver.findElement(run).click();
	   
	}

	@Then("the user should be able to see the output")
	public void the_user_should_be_able_to_see_the_output() {
		
	}

	@When("the user clicks the graph representation")
	public void the_user_clicks_the_graph_representation() {
		
		Common_Step_Def.driver.findElement(graphrepresentation).click(); 
	    
	}

	@Then("the user writes the invalid python code (.*) and (.*)$")
	public void the_user_writes_the_invalid_python_code_print_hai_and_expected_ouput(String input , String output){
		   
		Common_Step_Def.driver.findElement(textbox).sendKeys(input);
	}

	@Then("the user should be able to see the error msg in the alert window")
	public void the_user_should_be_able_to_see_the_error_msg_in_the_alert_window() {
		
		Common_Step_Def.driver.switchTo().alert().accept();
	   
	}

	@When("the user clicks the practice question")
	public void the_user_clicks_the_practice_question() {
		
		Common_Step_Def.driver.findElement(practice_qp ).click();
	   
	}

	@Then("the user finds the page is blank")
	public void the_user_finds_the_page_is_blank() {
		
		Common_Step_Def.driver.findElement(signoutbtn).click();
	    
	}




}
