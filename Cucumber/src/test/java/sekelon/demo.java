package sekelon;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class demo {
	WebDriver driver;

	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_APP() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}
	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
	driver.findElement(By.name("Login")).click();
	Assert.assertTrue(driver.getTitle().contains("Home"));
	}	


@When("user enters invalid data")
public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
List<List<String>> list=dataTable.asLists();
	
			for (List<String> list2 : list) {
				for (String s : list2) {
					
				System.out.println(s+"\t");
			}
	
			
			System.out.println();
			
			
			
			}
			
}
    
 @Then("user is in login")
public void user_is_in_login() {

	
}
	

}



