package com.ferias.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CrearTuCuentaPage extends PageObject{
	@FindBy(xpath = "//div[2]/a[2]")
	WebElementFacade btnAceptarTerminos;
	
	@FindBy(name = "IdentificationType.SelectedIds")
	WebElementFacade cmbTipoIdentificacion;

	@FindBy(name = "IdentificationNumber")
	WebElementFacade txtNumeroIdentificacion;

	@FindBy(name = "Email")
	WebElementFacade txtCorreoElectronico;

	@FindBy(xpath = "//button[contains(text(),'Continuar')]")
	WebElementFacade btnContinuarRegistro;

	public void crearTuCuentaEnElempleo(String tipoIdentificacion, String numeroIdentificacion,
			String correoElectronico) {
		if (btnAceptarTerminos.isCurrentlyVisible()) {
			btnAceptarTerminos.click();
		}
		cmbTipoIdentificacion.click();
		cmbTipoIdentificacion.selectByVisibleText(tipoIdentificacion);
		txtNumeroIdentificacion.sendKeys(numeroIdentificacion);
		txtCorreoElectronico.sendKeys(correoElectronico);
		btnContinuarRegistro.click();

	}
}
