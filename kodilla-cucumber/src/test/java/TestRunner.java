import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.time.MonthDay;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/wallet"}
)
public class TestRunner {
}