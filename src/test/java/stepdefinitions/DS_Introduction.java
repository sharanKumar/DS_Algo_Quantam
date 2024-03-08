package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DS_Introduction {
	
	
		
		public static WebDriver driver;
		
		By signinLink = By.xpath("//a[text()='Sign in']");
		By usernameTextbox = By.xpath("//input[@name='username']");
		By passwordTextbox =By.xpath("//input[@name='password']");
		By loginbtn = By.xpath("//input[@value='Login']");
		
		String URL = "https://dsportalapp.herokuapp.com/login";
		
		By Getstarted_btn = By.xpath("//a[@href='data-structures-introduction']");
		By Time_cmp = By.xpath("//a[@href='time-complexity']");
		By try_here = By.xpath("//a[@class='btn btn-info']");
		By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		By run = By.xpath("//button[text() = \"Run\"]");
		By practice_qa = By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
		By empty_pp = By.xpath("//html[@lang = \"en\"]");
		By signoutbtn = By.xpath("//a[text()='Sign out']");
		
		@Given("I navigate to the login page")
		public void i_navigate_to_the_login_page() {
			
			 Common_Step_Def.driver.get(URL);
			 
		}
	   @When("I submit username and password")
		public void i_submit_username_and_password() {
		   
			Common_Step_Def.driver.findElement(usernameTextbox).sendKeys("quantum@testers");
			Common_Step_Def.driver.findElement(passwordTextbox).sendKeys("numpyninja1234");
			}

		@Then("I should be logged in")
		public void i_should_be_logged_in() {
			
			Common_Step_Def.driver.findElement(loginbtn).click();
		   
		}


		@Given("the user is on the DS Algo Home Page")
		public void the_user_is_on_the_ds_algo_home_page() {
		   
			//Common_Step_Def.driver.get(URL);
			
		}

		@When("the user clicks  Get Started button below the Data structures-Introduction")
		public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
		    
			 Common_Step_Def.driver.findElement(Getstarted_btn).click();
		}

		@Then("The user should land in {string} page")
		public void the_user_should_land_in_page(String string) {
			String currentURL =Common_Step_Def.driver.getCurrentUrl();
			   String expectedURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
			   Assert.assertEquals(currentURL, expectedURL);
			   System.out.println("User is on the signin page");
		   }

		@When("the user clicks Time Complexity link")
		public void the_user_clicks_time_complexity_link() throws InterruptedException {
		    
			 Common_Step_Def.driver.findElement(Time_cmp ).click();
			
		}

		@Then("the user should be redirected to \"Time Complexity\"TC page")
		public void the_user_should_be_redirected_to_time_complexity_tc_page() {
		    
		}

		@When("The user clicks Try Here  button of Time Complexity page")
		public void the_user_clicks_try_here_button_of_time_complexity_page() {
			
			
			 Common_Step_Def.driver.findElement(try_here).click();
		}

		@Then("The user should be redirected to a page having an Python Editor with a url {string}")
		public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
		  
		}

		@Given("The user is on the Python Editor page")
		public void the_user_is_on_the_python_editor_page() {
		    
			
		}

		@When("the user writes invalid code with (.*) and (.*)$")
		public void the_user_writes_invalid_code_with_print_hai_and_expected_output(String input , String output) {
		   
			Common_Step_Def.driver.findElement(textbox).sendKeys(input);
		}

		@When("Click the Run Button")
		public void click_the_run_button() {
			
			Common_Step_Def.driver.findElement(run).click();
		    
		}

		@Then("The user should able to see an error message in alert window")
		public void the_user_should_able_to_see_an_error_message_in_alert_window() throws InterruptedException {
			
			Common_Step_Def.driver.switchTo().alert().accept();
			
		}
		
		@Given("user is on hompage")
		public void user_is_on_hompage() {
		   
		}

		@When("user clicks get started on DS_introduction")
		public void user_clicks_get_started_on_ds_introduction() {
		    
			 Common_Step_Def.driver.findElement(Getstarted_btn).click();
		}

		@When("user clicks try here button")
		public void user_clicks_try_here_button() {
		    
			Common_Step_Def.driver.findElement(try_here).click();
		}

		@When("the user writes valid python code with (.*) and (.*)$")
		public void user_writes_valid_python_code_with_print_and_expected_output(String input, String output) throws InterruptedException {
		    
			Common_Step_Def.driver.findElement(textbox).sendKeys(input);
			
		}

		
		@When("Click the  python page run Button")
		public void click_the_python_page_run_button() {
			
			Common_Step_Def.driver.findElement(run).click();
		}

		@Then("The user should able to see output in the console")
		public void the_user_should_able_to_see_output_in_the_console() {
			 
			System.out.println("print hello");
		   
		}

		@Given("The user is on the Time Complexity Data Structure Home Page")
		public void the_user_is_on_the_time_complexity_data_structure_home_page() {
			
			Common_Step_Def.driver.findElement(Getstarted_btn).click();
			Common_Step_Def.driver.findElement(Time_cmp ).click();
		}

		@When("The user clicks Practice Questions link")
		public void the_user_clicks_practice_questions_link() {
			
			Common_Step_Def.driver.findElement(practice_qa ).click();
		}

		@When("the user will land on the practice question page")
		public void the_user_will_land_on_the_practice_question_page() {
		   
		}

		@Then("The user doesn't find any practice problems and the page is blank")
		public void the_user_doesn_t_find_any_practice_problems_and_the_page_is_blank() {
			 
		    Common_Step_Def.driver.findElement(signoutbtn).click();
		}


		

		

	}


