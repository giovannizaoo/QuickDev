package quickdev.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/resources/feature",
        tags = "@cadastro",
        dryRun = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "quickdev",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports.html"}

)

public final class Executa {

}
