package com.ferias.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class UnipanamericanaPage extends PageObject{

	@FindBy(xpath = "//a[contains(@href,'oferta_sitio_area.asp')]")
	List<WebElementFacade> lstAreas;
	
	@FindBy(xpath = "//a[contains(text(),'Ver Todas las Áreas')]")
	WebElementFacade btnTodasAreas;
	
	@FindBy(name = "palabraclave")
	WebElementFacade txtPalabraClave;
	
	@FindBy(xpath = "//button[contains(text(),'Buscar')]")
	WebElementFacade btnBuscar;
	
	@FindBy(xpath = "//a[@class='offers-item-title-link']")
	List<WebElementFacade> lstOferta;
	
	@FindBy(name = "cmdSubmit")
	WebElementFacade btnAplicarOferta;
	
	@FindBy(xpath="//a[contains(@class, 'btn btn-primary')]")
	WebElementFacade btnAceptarAplicacion;
	
	@FindBy(xpath="//div[@id='messageResponse']/p")
	WebElementFacade lblAplicacionOferta;
	
	Helpers helpers = new Helpers();
	
	public void ingresarBusquedaOfertas(String area) {
		esperaMientrasCarga();
		waitFor(ExpectedConditions.visibilityOf(btnTodasAreas));
		withAction().moveToElement(btnTodasAreas).perform();
		btnTodasAreas.click();
		esperaMientrasCarga();
		seleccionarArea(area);
	}
	
	public void esperaMientrasCarga() {
		helpers.esperaSelenium(2);
		this.getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	public void realizarBusqueda(String oferta) {
		txtPalabraClave.sendKeys(oferta);
		btnBuscar.click();
		esperaMientrasCarga();
		seleccionarOferta(oferta);
		waitFor(ExpectedConditions.visibilityOf(btnAplicarOferta));
		helpers.esperaSelenium(2);
		btnAplicarOferta.click();
		esperaMientrasCarga();
	}
	
	
	public boolean aplicacionOfertaExitosa() {
		boolean aplicacionExitosa = false;
		waitFor(ExpectedConditions.visibilityOf(btnAceptarAplicacion));
		aplicacionExitosa = lblAplicacionOferta.getText().contains("Aplicación exitosa de la oferta" ) || lblAplicacionOferta.getText().contains("Ya aplicaste a esta oferta");
		btnAceptarAplicacion.click();
		esperaMientrasCarga();
		return aplicacionExitosa;
	}
	
	public void seleccionarArea(String area) {
		desplazarPaginaHaciaAbajo();
		desplazarPaginaHaciaArriba();
		for (int i = 0; i < lstAreas.size(); i++) {
			if (lstAreas.get(i).getText().equals(area)) {
				lstAreas.get(i).click();
				break;
			}
		}
	}
	
	public void seleccionarOferta(String oferta) {
		for (int i = 0; i < lstOferta.size(); i++) {
			if (lstOferta.get(i).getText().equalsIgnoreCase(oferta)) {
				withAction().moveToElement(lstOferta.get(i)).perform();
				esperaMientrasCarga();
				lstOferta.get(i).click();
				break;
			}
		}
	}
	
	public void desplazarPaginaHaciaAbajo() {
		JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
		jse.executeScript("window.scrollBy(0,1000000)", "");
		helpers.esperaSelenium(3);
	}
	
	public void desplazarPaginaHaciaArriba() {
		JavascriptExecutor jse = (JavascriptExecutor)this.getDriver();
		jse.executeScript("window.scrollBy(0,-1000000)", "");
		helpers.esperaSelenium(2);
	}
}
