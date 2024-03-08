package page_model;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class DS_IntroductionPageObjects {
	
	private static  DS_IntroductionPageObjects ds_introductionpageobject;

	private DS_IntroductionPageObjects() {};

	public static DS_IntroductionPageObjects getInstance() {

		if(ds_introductionpageobject==null) {
			ds_introductionpageobject= new  DS_IntroductionPageObjects();
		}
		return ds_introductionpageobject;

	}

	By Getstarted_btn = By.xpath("//a[@href='data-structures-introduction']");
	By Time_cmp = By.xpath("//a[@href='time-complexity']");
	By try_here = By.xpath("//a[@class='btn btn-info']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text() = \"Run\"]");
	By practice_qa = By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
	By empty_pp = By.xpath("//html[@lang = \"en\"]");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	public void clickgetstarted() {
		
		Common_Step_Def.driver.findElement(Getstarted_btn).click();
	}
	public void clicktimecompilicity () {
		
		 Common_Step_Def.driver.findElement(Time_cmp ).click();
	}
	public void clicktryhere() {
		
		 Common_Step_Def.driver.findElement(try_here).click();
	}
	
	
	
	
	
	
}
