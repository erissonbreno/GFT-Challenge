package com.br.gft.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "src/test/java/com/br/gft/steps",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberRunner {
}
