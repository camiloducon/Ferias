package com.ferias.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://uatperson.elempleo.com/sitios-empresariales/colombia/feria-panamericana/registro.asp")
public class FeriasPage extends PageObject {

	@FindBy(xpath = "//a[contains(text(),' hacerlo aqu�')]")
	WebElementFacade btnCrear;

	@FindBy(xpath = "//a[@href='ingresohv.asp' or @href='crear_sitio_empresarial.asp?tipo=19,19']")
	WebElementFacade btnIngresarSuHojaDeVida;

	@FindBy(xpath = "//a[contains(@href,'crear_sitio_empresarial.asp')]")
	WebElementFacade btnIngresarRegistro;

	@FindBy(name = "txtlogin")
	WebElementFacade txtUsuario;

	@FindBy(name = "txtpassword")
	WebElementFacade txtContrase�a;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block scroll pd']")
	WebElementFacade btnIngresar;

	@FindBy(xpath = "//a[contains(text(),'Ofertas laborales')]")
	WebElementFacade btnIngresarOfertaLaboral;

	@FindBy(xpath = "//a[contains(@href,'detalle_oportunidad')]")
	List<WebElementFacade> lstOfertaLaboral;

	@FindBy(name = "cmdSubmit")
	WebElementFacade btnAplicarOferta;

	Helpers helpers = new Helpers();

	public void ingresarRegistroHojaDeVida() {
		btnCrear.click();
	}

	public void login(String usuario, String contrase�a) {
		txtUsuario.sendKeys(usuario);
		txtContrase�a.sendKeys(contrase�a);
		btnIngresar.click();
		helpers.esperaSelenium(3);
	}

	public void seleccionarOfertaLaboral(String ofertaLaboral) {
		for (int i = 0; i < lstOfertaLaboral.size(); i++) {
			if (lstOfertaLaboral.get(i).getText().equals(ofertaLaboral)) {
				lstOfertaLaboral.get(i).click();
				break;
			}
		}
	}
}
