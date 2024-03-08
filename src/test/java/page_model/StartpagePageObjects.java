package page_model;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import stepdefinitions.Common_Step_Def;
	import utilities.Logger_Load;

	public class StartpagePageObjects {

		private WebDriver driver;
		// String URL = "https://dsportalapp.herokuapp.com";

		By GetStartedBtn = By.xpath("//button[text()='Get Started']");

//		boolean status = driver.findElement(GetStartedBtn).isDisplayed();
//		{
//			if (status) {
//				Logger_Load.info("Successfully logged in");
//			}
//
//		}

		private static StartpagePageObjects startPageObjects;

		private StartpagePageObjects() {
		};

		public static StartpagePageObjects getInstance() {
			if (startPageObjects == null) {
				startPageObjects = new StartpagePageObjects();
			}
			return startPageObjects;

		}

		
		

		public void algo_Startpage() {

			
			Common_Step_Def.driver.findElement(GetStartedBtn).click();

		}
	}


