package com.ferias.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/AplicarOferta.feature",
		glue = "com.ferias.stepsDefinitions",
        snippets = SnippetType.CAMELCASE
		)
public class AplicarOfertaRunner {

}
