package com.bancolombia.fenix;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
@CucumberOptions (features = "src/test/resources/features/bancolombia/fenix/formAgreement.feature", tags = "@EscenarioCreacionExitosa")
//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
/*@CucumberOptions (
plugin		= {"pretty"},
features	= {"src/test/resources/features/bancolombia/fenix/formAgreement.feature"}, 
tags= {"@EscenarioCreacionExitosa"},
glue		= {"com.bancolombia.fenix.definition"}
)

*/

public class RunnerTags {

}
