package com.ferias.pages;

import java.util.List;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UnipanamericanaPage extends PageObject{

	@FindBy(xpath = "//a[contains(@href,'oferta_sitio_area.asp')]")
	List<WebElementFacade> lstAreas;
	
	@FindBy(xpath = "//a[contains(text(),'Ver Todas las �reas')]")
	WebElementFacade btnTodasAreas;
	
	@FindBy(name = "palabraclave")
	WebElementFacade txtPalabraClave;
	
	@FindBy(xpath = "//button[contains(text(),'Buscar')]")
	WebElementFacade btnBuscar;
	
	@FindBy(xpath = "//a[@class='offers-item-title-link']")
	List<WebElementFacade> lstOferta;
	
	@FindBy(name = "cmdSubmit")
	WebElementFacade btnAplicarOferta;
	
	Helpers helpers = new Helpers();
	
	public void ingresarBusquedaOfertas(String area) {
		btnTodasAreas.click();
		seleccionarArea(area);
	}
	
	public void realizarBusqueda(String oferta) {
		txtPalabraClave.sendKeys(oferta);
		btnBuscar.click();
		seleccionarOferta(oferta);
		btnAplicarOferta.click();
		
	}
	
	public void seleccionarArea(String area) {
		for (int i = 0; i < lstAreas.size(); i++) {
			if (lstAreas.get(i).getText().equals(area)) {
				lstAreas.get(i).click();
				break;
			}
		}
	}
	
	public void seleccionarOferta(String oferta) {
		for (int i = 0; i < lstOferta.size(); i++) {
			if (lstOferta.get(i).getText().equals(oferta)) {
				lstOferta.get(i).click();
				break;
			}
		}
	}
}
