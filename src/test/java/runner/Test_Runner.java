package runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
      
@CucumberOptions(
         plugin = {"pretty" , "html:target/ishu.html"},
		
		
		
		//tags = "@Register", //tags from feature file
	    //tags = "@Signin", //tags from feature file
        
		//tags = "@DS_Introductionpage", //tags from feature file
       // tags = "@Graph",
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepdefinitions") //location of step definition files
		

	
					
public class Test_Runner extends AbstractTestNGCucumberTests{
	
	@Override
	   @DataProvider(parallel = false)
 public Object[][] scenarios() {
				
		return super.scenarios();
}
					
				}
				


