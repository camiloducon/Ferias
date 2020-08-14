package com.ferias.steps;

import com.ferias.pages.CompletarCreacionDeCuentaPage;
import com.ferias.pages.CrearTuCuentaPage;
import com.ferias.pages.FeriasPage;
import com.ferias.pages.MiHojaDeVidaPage;
import com.ferias.pages.NivelDeEstudiosPage;

import net.thucydides.core.annotations.Step;

public class CrearHojaDeVidaSteps {

	FeriasPage feriasPage;
	CrearTuCuentaPage crearTuCuentaPage;
	CompletarCreacionDeCuentaPage completarCreacionDeCuentaPage;
	NivelDeEstudiosPage nivelDeEstudiosPage;
	MiHojaDeVidaPage miHojaDeVidaPage;

	@Step
	public void ingresoFerias() {
		feriasPage.open();
		feriasPage.ingresarRegistroHojaDeVida();
	}

	@Step
	public void crearTuCuenta(String tipoIdentificacion, String numeroIdentificacion, String correoElectronico) {
		crearTuCuentaPage.crearTuCuentaEnElempleo(tipoIdentificacion, numeroIdentificacion, correoElectronico);
	}

	@Step
	public void nivelEstudios(String nivelEstudios, String experienciaLaboral) {
		nivelDeEstudiosPage.nivelEstudios(nivelEstudios, experienciaLaboral);
	}

	@Step
	public void CompletarCreacionHojaDeVida(String contrasena, String nombres, String primerApellido,
			String segundoApellido, String fechaNacimiento, String tipoEstudios, String profesionOcupacion,
			String ultimoCargo, String dondeTrabajas, String dondeTePuedenLlamar) {
		completarCreacionDeCuentaPage.completarCreaciónHojaDeVida(contrasena, nombres, primerApellido, segundoApellido,
				fechaNacimiento, tipoEstudios, profesionOcupacion, ultimoCargo, dondeTrabajas, dondeTePuedenLlamar);
	}
	
	@Step
	public boolean confirmarCreaciónPerfil() {
		return miHojaDeVidaPage.confirmarCreacionPerfil();
	}

	@Step
	public void completarSecciones(String completarInformacionPersonal, String ciudad, String direccion,
			String ciudadNacimiento, String telefonoSecundario, String describeTuPerfilLaboral, String describeTuPerfil,
			String aniosExperiencia, String aspiracionSalarial, String movilidadLaboral, String tuExperienciaLaboral,
			String sectorEmpresa, String subSectorEmpresa, String fechaMesInicio, String fechaAñoInicio,
			String trabajoActualmenteEnEstaEmpresa, String fechaMesFinalizacion, String fechaAñoFinalizacion,
			String cargoEquivalente, String nivelCargo, String area, String logrosResposabilidades,
			String telefonoEmpresa, String ciudadEmpresa, String tuFormacionAcademica, String areaEstudios, String estado, String fechaMesInicioEstudio,
			String fechaAñoInicioEstudio, String fechaMesFinalizacionEstudio, String fechaAñoFinalizacionEstudio,
			String tituloOtorgado, String institucion, String otraInstitucion, String ciudadInstitucion) {
		miHojaDeVidaPage.completarSecciones(completarInformacionPersonal, ciudadEmpresa, direccion, ciudadNacimiento,
				telefonoSecundario, describeTuPerfilLaboral, describeTuPerfil, aniosExperiencia, aspiracionSalarial,
				movilidadLaboral, tuExperienciaLaboral, sectorEmpresa, subSectorEmpresa, fechaMesInicio, fechaAñoInicio,
				trabajoActualmenteEnEstaEmpresa, fechaMesFinalizacion, fechaAñoFinalizacion, cargoEquivalente,
				nivelCargo, area, logrosResposabilidades, telefonoEmpresa, ciudadEmpresa, tuFormacionAcademica,
				areaEstudios, estado, fechaMesInicioEstudio, fechaAñoInicioEstudio, fechaMesFinalizacionEstudio,
				fechaAñoFinalizacionEstudio, tituloOtorgado, institucion, otraInstitucion, ciudadInstitucion);
	}

}
