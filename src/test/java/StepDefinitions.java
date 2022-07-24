import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    public WebDriver driver;

    @Given("^User visits e-commerce website$")
    public void user_visits_e_commerce_website() throws Exception {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com");

    }

    @When("^User enters valid credentials$")
    public void user_enters_valid_credentials() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User can logged in successfully$")
    public void user_can_logged_in_successfully() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }
}
