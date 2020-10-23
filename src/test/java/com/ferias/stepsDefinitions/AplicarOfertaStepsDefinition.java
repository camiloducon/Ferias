package com.ferias.stepsDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.ferias.steps.AplicarOfertaSteps;
import com.ferias.utils.DataDrivenExcel;
import com.ferias.utils.Excel;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class AplicarOfertaStepsDefinition {

	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	List<Map<String, String>> processExcel;
	Map<String, String> data = new HashMap<>();

	@Steps
	AplicarOfertaSteps aplicarOfertaSteps;

	@Dado("^que deseo aplicar a una oferta (.*)$")
	public void queDeseoAplicarAUnaOferta(int row, DataTable dataExcel) {
		processExcel = dataExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(processExcel.get(0).get("Ruta Excel"), processExcel.get(0).get("Pestaña"), true, row);
		data = dataDriverExcel.leerExcel(excel);

	}

	@Cuando("^realizo el login$")
	public void realizoElLogin() {
		aplicarOfertaSteps.realizarLogin(data.get("Sitio de Ingreso"), data.get("Usuario"), data.get("Contraseña"));
	}

	@Y("^valido las ofertas$")
	public void validoLasOfertas() {
		aplicarOfertaSteps.seleccionarOfertaEmpleo(data.get("Area"));
	}

	@Entonces("^puedo aplicar a una de ellas$")
	public void puedoAplicarAUnaDeEllas() {
		aplicarOfertaSteps.buscarOferta(data.get("Oferta"));
		Assert.assertTrue("No se aplico a la aoferta correctamente", aplicarOfertaSteps.aplicacionDeOfertaExitosa());
	}
}
