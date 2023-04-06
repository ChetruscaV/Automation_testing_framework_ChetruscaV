package stepDefinitions;

import contextManagers.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.jupiter.api.Assertions;

import java.util.function.BooleanSupplier;

public class GeneralSteps {
    private TestContext testContext;

    public GeneralSteps(TestContext context){
        testContext=context;
    }
    @Given("^\"([^\"]*)\" is accessed$")
    public void isAccessed(String adresaURL) {
        testContext.getWebDriverManager().getDriver().get(adresaURL);
    }


    @Then("^\"([^\"]*)\" is present within the current URL$")
    public void isPresentWithinTheCurrentURL(String urlKeyWord)  {
        Assertions.assertTrue(testContext.getWebDriverManager().getDriver().getCurrentUrl().contains(urlKeyWord));

    }
}
