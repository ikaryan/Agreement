package com.bancolombia.fenix.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://icpingress.bancolombia.corp/fenixdev/")
public class AgreemmentPages extends PageObject {
	
	@FindBy(id="agreementCode") 
	public WebElementFacade txtagreementCode;
	
	@FindBy(id="documentType") 
	public WebElementFacade lstdocumentType;
	
	@FindBy(id="agreementQuota") 
	public WebElementFacade txtagreementQuota;
	
	@FindBy(id="feePercent") 
	public WebElementFacade txtfeePercent;
	
	@FindBy(id="accountType") 
	public WebElementFacade lstaccountType;
	
	@FindBy(id="cardType")
	public WebElementFacade lstcardType;
	
	@FindBy(id="bin") 
	public WebElementFacade txtbin;
	
	@FindBy(id="companyName") 
	public WebElementFacade txtcompanyName;
	
	@FindBy(id="documentNumber") 
	public WebElementFacade txtdocumentNumber;
	
	@FindBy(id="cityAgreement") 
	public WebElementFacade txtcityAgreement;
	
	@FindBy(id="agreementStatus") 
	public WebElementFacade lstagreementStatus;
	
	@FindBy(id="agreementAccount") 
	public WebElementFacade txtagreementAccount;
	
	@FindBy(id="statementType") 
	public WebElementFacade lststatementType;
	
	@FindBy(id="logo") 
	public WebElementFacade txtlogo;
	
	@FindBy(id="contactClientName") 
	public WebElementFacade txtcontactClientName;
	
	@FindBy(id="contactEmail") 
	public WebElementFacade txtcontactEmail;
	
	@FindBy(id="idExecutiveManager") 
	public WebElementFacade txtidExecutiveManager;
	
	@FindBy(id="contactPhoneNumber") 
	public WebElementFacade txtcontactPhoneNumber;
	
	@FindBy(id="executiveManager") 
	public WebElementFacade txtexecutiveManager;
	
	@FindBy (xpath="/html/body/app-root/app-administrativo/button")
	public WebElementFacade btnLimpiar;
	
	@FindBy (xpath="//*[@id=\"agreement_form\"]/div[3]/button")
	public WebElementFacade btnGuardar;
	
	public void diligenciarCodConvenio(String datosTabla) {
		txtagreementCode.click();
		txtagreementCode.clear();
		txtagreementCode.sendKeys(datosTabla);
	}
	
	public void seleccionarTipoDocumento(String datosTabla) {
		lstdocumentType.selectByVisibleText(datosTabla);
	}
	
	public void diligenciarCupoConvenio(String datosTabla) {
		txtagreementQuota.click();
		txtagreementQuota.clear();
		txtagreementQuota.sendKeys(datosTabla);
	}
	
	public void diligenciarComision(String datosTabla) {
		txtfeePercent.click();
		txtfeePercent.clear();
		txtfeePercent.sendKeys(datosTabla);
	}
	
	public void seleccionarTipoCuenta(String datosTabla) {
		lstaccountType.selectByVisibleText(datosTabla);
	}
	
	public void seleccionarTipoTarjeta(String datosTabla) {
		 lstcardType.selectByVisibleText(datosTabla);
	}
	
	public void diligenciarBin(String datosTabla) {
		txtbin.click();
		txtbin.clear();
		txtbin.sendKeys(datosTabla);
	}
	
	public void diligenciarRazonSocial(String datosTabla) {
		txtcompanyName.click();
		txtcompanyName.clear();
		txtcompanyName.sendKeys(datosTabla);
	}
	
	public void diligenciarNroDto(String datosTabla) {
		txtdocumentNumber.click();
		txtdocumentNumber.clear();
		txtdocumentNumber.sendKeys(datosTabla);
	}
	
	public void diligenciarCiudadConvenio(String datosTabla) {
		txtcityAgreement.click();
		txtcityAgreement.clear();
		txtcityAgreement.sendKeys(datosTabla);
	}
	
	public void seleccionarEstadoConvenio(String datosTabla) {
		 lstagreementStatus.selectByVisibleText(datosTabla);
	}
	
	public void diligenciarCuenta(String datosTabla) {
		txtagreementAccount.click();
		txtagreementAccount.clear();
		txtagreementAccount.sendKeys(datosTabla);
	}
	
	public void seleccionarTipoEstracto(String datosTabla) {
		lststatementType.selectByVisibleText(datosTabla);
	}
	
	public void diligenciarLogo(String datosTabla) {
		txtlogo.click();
		txtlogo.clear();
		txtlogo.sendKeys(datosTabla);
	}
	
	public void diligenciarNombreContacto(String datosTabla) {
		txtcontactClientName.click();
		txtcontactClientName.clear();
		txtcontactClientName.sendKeys(datosTabla);
	}
	
	public void diligenciarCorreoContacto(String datosTabla) {
		txtcontactEmail.click();
		txtcontactEmail.clear();
		txtcontactEmail.sendKeys(datosTabla);
	}
	
	public void diligenciarIdGerenciador(String datosTabla) {
		txtidExecutiveManager.click();
		txtidExecutiveManager.clear();
		txtidExecutiveManager.sendKeys(datosTabla);
	}
	
	public void diligenciarTelefonoContacto(String datosTabla) {
		txtcontactPhoneNumber.click();
		txtcontactPhoneNumber.clear();
		txtcontactPhoneNumber.sendKeys(datosTabla);
	}
	
	public void diligenciarNombreGerenciador(String datosTabla) {
		txtexecutiveManager.click();
		txtexecutiveManager.clear();
		txtexecutiveManager.sendKeys(datosTabla);
	}
	
	public void guardarConvenio() {
		btnGuardar.click();
	}
	
	public void limpiarFormulario() {
		btnLimpiar.click();
	}
}
