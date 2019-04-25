package sekelon;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},
features={"src/test/resources/sekelon/Demowebshop1.feature"},monochrome=true,dryRun=true)
public class runcucumber{
	
}

