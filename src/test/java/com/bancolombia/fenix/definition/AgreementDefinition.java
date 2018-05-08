package com.bancolombia.fenix.definition;

import java.util.List;

import com.bancolombia.fenix.steps.AgreementSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AgreementDefinition {
	@Steps
	AgreementSteps agreementSteps;
	
	@Given("^Verificar ingreso opción Convenios$")
	public void verificar_ingreso_opción_Convenios() {
	  agreementSteps.ingresarFormularioConvenio();
	}

	@When("^Ingresar los datos requeridos del formulario$")
	public void ingresar_los_datos_requeridos_del_formulario(DataTable datosTabla)  {
		/*List<List<String>> data = datosTabla.raw();
		agreementSteps.crearConvenio(data);*/
	}

	@Then("^Guardar registro$")
	public void guardar_registro() {
	   
	}

}
