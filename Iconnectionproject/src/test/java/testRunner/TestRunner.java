package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( //features= {".//FeaturesFiles/"},
		         //features= {".//FeaturesFiles/login.feature"},
                 features= {".//FeaturesFiles/createNewInvestor.feature"},
                           glue="stepsDefination",
          plugin= {"pretty", "html:reports/myreport.html", 
		  //"rerun:target/rerun.txt",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
      dryRun=false,
      monochrome=true,
      publish=true
      
)


public class TestRunner {

}
