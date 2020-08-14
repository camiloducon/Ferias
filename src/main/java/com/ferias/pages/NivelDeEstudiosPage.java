package com.ferias.pages;

import java.util.List;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class NivelDeEstudiosPage extends PageObject{

	Helpers helpers = new Helpers();
	
	@FindBy(name = "EducationLevel.SelectedIds")
	WebElementFacade cmbNivelEstudios;
	
	@FindBy(xpath = "//div[@class='form-inline experience-wrapper']//input")
	List<WebElementFacade> rdbTieneExperiencia;	
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-create-cv js-createCurriculom']")
	WebElementFacade btnCrearHojaDeVida;
	
	public void nivelEstudios(String nivelEstudios, String experienciaLaboral) {
		cmbNivelEstudios.click();
		cmbNivelEstudios.selectByVisibleText(nivelEstudios);
		seleccionarExperienciaLaboral(experienciaLaboral);
		btnCrearHojaDeVida.click();
		helpers.esperaSelenium(5);
		
	}
	
	public void seleccionarExperienciaLaboral(String experienciaLaboral) {
		for (WebElementFacade listaExperiencia : rdbTieneExperiencia) {
			if (listaExperiencia.getText().equals(experienciaLaboral)) {
				listaExperiencia.click();
			}
		}
	}
}
