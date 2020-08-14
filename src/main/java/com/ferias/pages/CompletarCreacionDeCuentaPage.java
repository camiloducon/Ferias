package com.ferias.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompletarCreacionDeCuentaPage extends PageObject{

	Helpers helpers = new Helpers();

	@FindBy(name = "Password")
	WebElementFacade txtCrearContraseña;

	@FindBy(name = "Names")
	WebElementFacade txtNombres;

	@FindBy(name = "FirstSurName")
	WebElementFacade txtPrimerApellido;

	@FindBy(name = "SecondSurName")
	WebElementFacade txtSegundoApellido;

	@FindBy(xpath = "//select[contains(@name='month')]")
	WebElementFacade cmbMesFechaNacimiento;

	@FindBy(xpath = "//div[@class='radio']")
	List<WebElementFacade> rdbTipoEstudios;
	
	@FindBy(xpath = "//div[@class='radio']//input")
	List<WebElementFacade> btnTipoEstudios;

	@FindBy(name = "Area.typehead")
	WebElementFacade txtProfesionOcupacion;

	@FindBy(name = "Position")
	WebElementFacade txtUltimoCargo;

	@FindBy(name = "Company")
	WebElementFacade txtDondeTrabajasoTrabajaste;

	@FindBy(name = "Phone")
	WebElementFacade txtDondeTePuedenLlamar;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-create-account js-create-account']")
	WebElementFacade btnCrearCuenta;

	public void completarCreaciónHojaDeVida(String contrasena, String nombres, String primerApellido,
			String segundoApellido, String fechaNacimiento, String tipoEstudios, String profesionOcupacion, String ultimoCargo,
			String dondeTrabajas, String dondeTePuedenLlamar) {
		txtCrearContraseña.sendKeys(contrasena);
		txtNombres.sendKeys(nombres);
		txtPrimerApellido.sendKeys(primerApellido);
		txtSegundoApellido.sendKeys(segundoApellido);
		seleccionarFechaNacimiento(fechaNacimiento);
		seleccionarTipoEstudios(tipoEstudios);
		if (txtProfesionOcupacion.isCurrentlyVisible()) {
			txtProfesionOcupacion.sendKeys(profesionOcupacion);
			WebElement profesionElem = find(
					By.xpath("//input[@name ='Area.typehead']//following::div/div/div/strong[1]"));
			profesionElem.click();
		}
		txtUltimoCargo.sendKeys(ultimoCargo);
		txtDondeTrabajasoTrabajaste.sendKeys(dondeTrabajas);
		txtDondeTePuedenLlamar.sendKeys(dondeTePuedenLlamar);
		btnCrearCuenta.click();
		helpers.esperaSelenium(10);
		
	}

	public void seleccionarTipoEstudios(String tipoEstudios) {
		for (int i = 0; i < rdbTipoEstudios.size(); i++) {
			if (rdbTipoEstudios.get(i).getText().equals(tipoEstudios)) {
				btnTipoEstudios.get(i).click();
			}
		}
	}
	
	public void seleccionarFechaNacimiento(String fechaNacimiento) {
		String [] fecha = fechaNacimiento.split("-");
		WebElementFacade txtdia = find(
				By.xpath("//input[@placeholder='Día']"));
		txtdia.sendKeys(fecha[0]);
		WebElementFacade cmbMes = find(
				By.xpath("//select[contains(@name,'Birthday.date')]"));
		cmbMes.click();
		cmbMes.selectByVisibleText(fecha[1]);
		WebElementFacade txtAnio = find(
				By.xpath("//input[@placeholder='Año']"));
		txtAnio.sendKeys(fecha[2]);
		
	}
}
