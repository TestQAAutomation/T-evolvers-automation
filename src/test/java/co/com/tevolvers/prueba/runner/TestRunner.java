package co.com.tevolvers.prueba.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/tevolvers/prueba/features/",
        glue = {"co.com.tevolvers.prueba.stepdefinitions", "co.com.tevolvers.prueba.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@RegressionTest"
)
public class TestRunner {
}
