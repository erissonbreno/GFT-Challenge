package com.br.gft.web.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.br.gft.web.steps",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberRunner {
}
