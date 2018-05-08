package com.bancolombia.fenix.steps;

import java.util.List;

import com.bancolombia.fenix.pageobjects.AgreemmentPages;

import net.thucydides.core.annotations.Step;

public class AgreementSteps {
	
	AgreemmentPages agreementPages;
	
	@Step
	public void ingresarFormularioConvenio() {
		agreementPages.open();
	}
	
	@Step
	public void crearConvenio(List<String> datosTabla) throws InterruptedException {
	agreementPages.limpiarFormulario();	
	agreementPages.diligenciarCodConvenio(datosTabla.get(0).trim());
	agreementPages.diligenciarRazonSocial(datosTabla.get(1).trim());
	agreementPages.seleccionarTipoDocumento(datosTabla.get(2).trim());
	agreementPages.diligenciarNroDto(datosTabla.get(3).trim());
	agreementPages.diligenciarCupoConvenio(datosTabla.get(4).trim());
	agreementPages.diligenciarCiudadConvenio(datosTabla.get(5).trim());
	agreementPages.diligenciarComision(datosTabla.get(6).trim());
	agreementPages.seleccionarEstadoConvenio(datosTabla.get(7).trim());
	agreementPages.seleccionarTipoCuenta(datosTabla.get(8).trim());
	agreementPages.diligenciarCuenta(datosTabla.get(9).trim());
	agreementPages.seleccionarTipoTarjeta(datosTabla.get(10).trim());
	agreementPages.seleccionarTipoEstracto(datosTabla.get(11).trim());
	agreementPages.diligenciarBin(datosTabla.get(12).trim());
	agreementPages.diligenciarLogo(datosTabla.get(13).trim());
	agreementPages.diligenciarNombreContacto(datosTabla.get(14).trim());
	agreementPages.diligenciarTelefonoContacto(datosTabla.get(15).trim());
	agreementPages.diligenciarCorreoContacto(datosTabla.get(16).trim());
	agreementPages.diligenciarNombreGerenciador(datosTabla.get(17).trim());
	agreementPages.diligenciarIdGerenciador(datosTabla.get(18).trim());
	agreementPages.guardarConvenio();
	}

}
