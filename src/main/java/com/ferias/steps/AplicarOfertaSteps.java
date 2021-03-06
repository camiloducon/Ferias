package com.ferias.steps;

import com.ferias.pages.FeriasPage;
import com.ferias.pages.UnipanamericanaPage;

import net.thucydides.core.annotations.Step;

public class AplicarOfertaSteps {

	
	FeriasPage feriasPage;
	UnipanamericanaPage unipanamericanaPage;
	
	@Step
	public void ingresoFerias(String sitio, String marca, String segmentacion) {
		feriasPage.open();
		feriasPage.ingresarRegistroHojaDeVida();
	}
	
	@Step
	public void realizarLogin(String sitio, String usuario, String contrasena) {
		feriasPage.open();
		feriasPage.login(usuario, contrasena);
	}
	
	@Step
	public void seleccionarOfertaEmpleo(String area) {
		unipanamericanaPage.ingresarBusquedaOfertas(area);
	}
	
	@Step
	public void buscarOferta(String oferta) {
		unipanamericanaPage.realizarBusqueda(oferta);
	}
	
	@Step
	public boolean aplicacionDeOfertaExitosa() {
		return unipanamericanaPage.aplicacionOfertaExitosa();
	}
}
