package sekelon;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
 import cucumber.api.java.en.When;
public class stepdefinations
	 {
Person Sean=new Person();
	  @Given("Sean is {int} meaters away from Lucia")
	  public void sean_is_meaters_away_from_Lucia(Integer int1) 
	  {
	     Sean.setDistance(int1);
	  }

	 @When("Sean shouts {string}")
	  public void sean_shouts(String string)
	 {
	      Sean.setMessage(string);
	  }

	 @Then("Lucia {string} to the message")
	  public void lucia_Listens_to_the_message(String flag) {
	   if(flag.contentEquals("listens"))
	   {
	    String message=Sean.getMessage();
	    Assert.assertEquals("Free Coffee", message);
	    
	   }
	    
	   else if(flag.contentEquals("cannot Listen"))
	   {
	   
	   String message=Sean.getMessage();
	      Assert.assertEquals("CANNOT HEAR", message);
	   }
	  }



}
