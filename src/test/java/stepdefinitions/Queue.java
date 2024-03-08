

  package stepdefinitions;
  
  import org.openqa.selenium.By;
  
  import org.testng.Assert;
  
  import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then;
  import io.cucumber.java.en.When;
  
  public class Queue {
  
  //public static WebDriver driver;
  
  By signinLink = By.xpath("//a[text()='Sign in']");
  By username_textbox =By.xpath("//input[@name='username']");
  By password_textbox=By.xpath("//input[@name='password']");
  By login=By.xpath("//input[@value='Login']");
  
  String URL = "https://dsportalapp.herokuapp.com/login";
  
  By getstarted_btn = By.xpath("//a[@href='queue']"); 
  By click_implementation = By.xpath("//a[text() = 'Implementation of Queue in Python']");
  By tryhere = By.xpath("//a[@class='btn btn-info']");
  By text_box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
  By Run = By.xpath("//button[text() = 'Run']");
  By implementationcollection = By.xpath("//a[text() = 'Implementation using collections.deque']");
  By array= By.xpath("//a[text() = 'Implementation using array']");
  By Queue_operation= By.xpath("//a[text() = 'Queue Operations']");
  By practice_qa=By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
  By empty_pp = By.xpath("//html[@lang = \"en\"]");
  By signoutbtn =By.xpath("//a[text()='Sign out']");
  
  
  
  
  
  @Given("user navigates to the login page")
  public void user_navigate_to_the_login_page() {
  
  Common_Step_Def.driver.get(URL);
  
  }
  
  @When("user enters username and password")
  public void user_submit_username_and_password() {
  
  Common_Step_Def.driver.findElement(username_textbox).sendKeys("quantum@testers");
  Common_Step_Def.driver.findElement(password_textbox).sendKeys("numpyninja1234");
  
  
  
  
  }
  
  @Then("user must be logged in")
  public void user_should_be_logged_in() {
  
  Common_Step_Def.driver.findElement(login).click();
  
  }
  
  @Given("the user is on the DS_Algo Home Page")
  public void the_user_is_on_the_ds_algo_home_page() {
  
  }
  
  @When("the user clicks  Get Started button below the Queue")
  public void the_user_clicks_get_started_button_below_the_queue() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  @Then("The user should be directed to {string} Page")
  public void the_user_should_be_directed_to_page(String string) {
  
  String currentURL =Common_Step_Def.driver.getCurrentUrl(); String
  expectedURL= "https://dsportalapp.herokuapp.com/queue/";
  Assert.assertEquals(currentURL, expectedURL);
  System.out.println("User is on the signin page");
  }
  
  @When("the user clicks the  {string} button")
  public void the_user_clicks_the_button(String string) {
  
  Common_Step_Def.driver.findElement( click_implementation).click();
  }
  
  
  @When("The user clicks {string} button") 
  public void the_user_clicks_button(String string) {
  
  Common_Step_Def.driver.findElement(tryhere).click();
  
  }
  
  @Then("The user should be redirected to a page with the url {string}")
  public void the_user_should_be_redirected_to_a_page_with_the_url(String string) {
  
  }
  
  @When("The User writes Valid python code with (.*) and (.*)$")
  public void the_user_writes_valid_python_code_with_print_and_expected_output(String input, String output) throws InterruptedException {
  
  Common_Step_Def.driver.findElement(text_box).sendKeys("print 'hello'");
  
  }
  
  @When("clicks the run button")
  public void clicks_the_run_button() {
  
  Common_Step_Def.driver.findElement(Run).click();
  
  }
  
 
  @Given("user is on the DS_Algo Home Page")
  public void user_is_on_the_ds_algo_home_page() {
  
  }
  
  @When("user clicks  Get Started button below the Queue") 
  public void user_clicks_get_started_button_below_the_queue() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  @When("The user clicks Implementation using Collections.deque page") 
  public void the_user_clicks_implementation_using_collections_deque_page() {
  
  Common_Step_Def.driver.findElement(implementationcollection ).click();
  }
  
  @Then("The user should be redirected to a pagewith the url {string}")
  public void the_user_should_be_redirected_to_a_pagewith_the_url(String string) {
  
  }
  
//  @When("The User writes Valid python code (.*) and (.*)$") 
//  public void the_user_writes_valid_python_code(String input , String output) throws InterruptedException {
//  
//  Common_Step_Def.driver.findElement(text_box).sendKeys(input);
//  Thread.sleep(10000);
//  }
  
  @When("user clicks the run button") 
  public void user_clicks_the_run_button()throws InterruptedException {
  
  Common_Step_Def.driver.findElement(Run).click(); Thread.sleep(10000);
  }
  
  @Then("User able to see the output in console") 
  public void User_able_to_see_the_output_in_console() {
  
  System.out.println("print hello"); }
  
  
  @Given("the user is on the dS_algo Home Page")
  public void the_user_is_on_the_ds_algo_Home_page() {
  
  }
  
  @When("the user clicks  get started button below the Queue")
  public void the_user_clicks_get_started_button_below_the_Queue() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  @When("The user clicks Implementation using array")
  public void the_user_clicks_implementation_using_array() {
  Common_Step_Def.driver.findElement(array ).click();
  }
  
  @When("user writes the invalid code with (.*) and (.*)$")
  public void user_writes_the_invalid_code_with_print_hai_and_expected_output(String input,String output) {
  Common_Step_Def.driver.findElement(text_box).sendKeys(input); 
  }
  
  @When("click the Run Button") 
  public void click_the_run_button() {
  Common_Step_Def.driver.findElement(Run).click();
  
  }
  
  @Then("The user should be able to see an error message in alert window")
  public void the_user_should_be_able_to_see_an_error_message_in_alert_window()
  {
  
  Common_Step_Def.driver.switchTo().alert().accept();
  }
  
  @Given("the user on DS_Algo Home Page")
  public void the_user_on_the_ds_algo_Home_page() {
  
  }
  
  @When("user click  Get started button Below the Queue")
  public void user_click_get_started_button_below_the_Queue() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  
  @When("the user writes the valid code with (.*) and (.*)$")
  public void the_user_writes_the_valid_code_with_print_and_expected_output(String input,String output) {
  
  Common_Step_Def.driver.findElement(text_box).sendKeys(input);
  }
  
  @When("user click the Run Button")
  public void user_click_the_run_button() {
  
  Common_Step_Def.driver.findElement(Run).click();
  }
  
  @Then("The user should able to see the ouput in the console") 
  public void the_user_should_able_to_see_the_ouput_in_the_console() {
  System.out.println("print hello");
  
  }
  
  @Given("user is on the DS_Algo home page")
  public void user_is_on_the_ds_algo_Home_page() {
  
  }
  
  @When("user click  Get Started button below the queue")
  public void user_clicks_get_started_button_below_the_Queue() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  @When("The user clicks Queue Operations")
  public void the_user_clicks_queue_operations() {
  
  Common_Step_Def.driver.findElement( Queue_operation ).click();
  
  }
  
  @When("user writes Valid python code  with (.*) and (.*)$")
  public void user_writes_valid_python_code_with_print_and_expected_output(String input , String output) {
     
      Common_Step_Def.driver.findElement(text_box).sendKeys(input); 
  }
  
  
  
  @When(" clicks the Run Button")
  public void clicks_the_Run_button() {
  
  Common_Step_Def.driver.findElement(Run).click(); 
  }
  
  @Then("User is able to see the output in console") 
  public void User_is_able_to_see_the_output_in_console() {
  System.out.println("print hello");
  }
  
  @Given("the user is on the DSalgo Home_page")
  public void user_is_on_the_Ds_algo_Home_page() {
  
  }
  
  @When("user click  Get Started button on the Queue pannel") 
  public void user_click_get_started_button_below_the_Queue_pannel() {
  
  Common_Step_Def.driver.findElement(getstarted_btn).click();
  
  }
  
  @When("user click Queue Operations")
  public void user_click_queue_operations() {
  
  Common_Step_Def.driver.findElement( Queue_operation).click(); 
  }
  
  @When("user clicks the Practice QP" )
  public void user_clicks_the_Practice_QP() {
  
  Common_Step_Def.driver.findElement(practice_qa).click();
  }
  
  @When("user finds the page is blank")
  public void user_finds_the_page_is_blank() {
  Common_Step_Def.driver.findElement(signoutbtn).click();
  
     }
  
}
  
  
  
 























