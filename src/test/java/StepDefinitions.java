import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefinitions {

    private Account account;
    private double result;

    @Given("account balance is {double}")
    public void givenAccountBalance(Double initialBalance) {
        account = new Account(initialBalance);
    }

    @When("the account is deposited with {double}")
    public void whenAccountDeposit(double amount) {
        result = account.deposit(amount);
    }

    @Then("account should have a balance of {double}")
    public void thenAccountShouldHaveBalance(double expectedBalance) {
        assertEquals(expectedBalance, result, 0.001);
    }

}
