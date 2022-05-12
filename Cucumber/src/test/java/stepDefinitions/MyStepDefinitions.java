package stepDefinitions;


import org.junit.runner.RunWith;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on Netbanking Landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       System.out.println("Navigate to login URL");
    }

    @When("^User Login into application with \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable{
       System.out.println(strArg1);
       System.out.println(strArg2);
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
       System.out.println("Login success");
    }


    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
       System.out.println(strArg1);
    }

}