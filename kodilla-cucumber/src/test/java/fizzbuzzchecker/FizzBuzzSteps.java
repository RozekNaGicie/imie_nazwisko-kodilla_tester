package fizzbuzzchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String fizzBuzz;

    public FizzBuzzSteps() {
        Given("{int} is divide by three and return", (Integer int1) -> {
            this.number = 3;
        });
        Given("{int} is divide by five and return", (Integer int1) -> {
            this.number = 5;
        });
        Given("{int}  is divide by five and three and return", (Integer int1) -> {
            this.number = 15;
        });

        Given("{int} is not divide by five or three or both of them and return", (Integer int1) -> {
            this.number = 31;
        });

        When("I asked this number is fizz or buzz or both", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.fizzBuzz = fizzBuzzChecker.numberCheck(this.number);
        });

        Then("I get {string}", (String string) -> {
            Assert.assertEquals(string,this.fizzBuzz);
        });
    }
}
