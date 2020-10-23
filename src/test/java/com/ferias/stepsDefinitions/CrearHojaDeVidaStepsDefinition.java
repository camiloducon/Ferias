package com.ferias.stepsDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ferias.steps.CrearHojaDeVidaSteps;
import com.ferias.utils.DataDrivenExcel;
import com.ferias.utils.Excel;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class CrearHojaDeVidaStepsDefinition {

	DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
	List<Map<String, String>> processExcel;
	Map<String, String> data = new HashMap<>();

	@Steps
	CrearHojaDeVidaSteps crearHojaDeVidaSteps;

	@Dado("^que deseo crear una hoja de vida (.*)$")
	public void queDeseoCrearUnaHojaDeVida(int row, DataTable dataExcel) {
		processExcel = dataExcel.asMaps(String.class, String.class);
		Excel excel = new Excel(processExcel.get(0).get("Ruta Excel"), processExcel.get(0).get("Pestaña"), true, row);
		data = dataDriverExcel.leerExcel(excel);

	}

	@Cuando("^ingreso a los diferentes portales de ferias$")
	public void ingresoALosDiferentesPortalesDeFerias() {
		crearHojaDeVidaSteps.ingresoFerias();
	}

	@Y("^realizo en ingreso a crear la hoja de vida$")
	public void realizoEnIngresoACrearLaHojaDeVida() {
		crearHojaDeVidaSteps.crearTuCuenta(data.get("Tipo De Identificacion"), data.get("Número De Identificacion"),
				data.get("Correo Electrónico"));
		crearHojaDeVidaSteps.nivelEstudios(data.get("Nivel De Estudios"), data.get("¿Tiene Experiencia Laboral?"));
	}

	@Entonces("^puedo finalizar con creacion de la Hoja de vida$")
	public void puedoFinalizarConCreacionDeLaHojaDeVida() {
		crearHojaDeVidaSteps.completarCreacionHojaDeVida(data.get("Contraseña"), data.get("Nombres"),
				data.get("Primer Apellido"), data.get("Segundo Apellido"), data.get("Fecha Nacimiento"),
				data.get("Tipo Estudio"), data.get("Profesión u Ocupación"), data.get("Ultimo Cargo Laboral"),
				data.get("¿Dónde Trabajas o Trabajaste?"), data.get("¿A qué número te pueden llamar?"));
		// assertTrue("No fue posible completar la creación del Perfil",
		// crearHojaDeVidaSteps.confirmarCreacionPerfil());
		crearHojaDeVidaSteps.completarSecciones(data.get("¿Completar Informacion Personal?"), data.get("Ciudad"),
				data.get("Dirección"), data.get("Ciudad Nacimiento"), data.get("Telefono Secundario"),
				data.get("¿Completar Perfil Laboral?"), data.get("Describe tu perfil"),
				data.get("¿Cuantos Años De Experiencia Tiene?"), data.get("¿Cuál es tu aspiración salarial?"),
				data.get("Movilidad laboral"), data.get("¿Completar Tu experiencia laboral?"),
				data.get("Sector Empresa"), data.get("Subsector Empresa"), data.get("Fecha Mes Inicio"),
				data.get("Fecha Año Inicio"), data.get("¿Trabajo Actualmente En Esta Empresa?"),
				data.get("Fecha Mes Finalizacion"), data.get("Fecha Año Finalizacion"), data.get("Cargo Equivalente"),
				data.get("Nivel Cargo"), data.get("Area"), data.get("Logros Resposabilidades"),
				data.get("Telefono Empresa"), data.get("Ciudad Empresa"),
				data.get("¿Completar  Tu formación académica?"), data.get("Nivel Estudio"),
				data.get("Area Estudios"), data.get("Estado Estudios"),
				data.get("Fecha Mes Inicio Estudios"), data.get("Fecha Año Inicio Estudios"),
				data.get("Fecha Mes Finalizacion Estudios"), data.get("Fecha Año Finalizacion Estudios"),
				data.get("Titulo Otorgado"), data.get("Institucion En La Que Estudiaste"), data.get("Otra Institucion"),
				data.get("Ciudad Estudios"));
	}

}
