package com.ferias.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ferias.utils.Helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MiHojaDeVidaPage extends PageObject{

	Helpers helpers = new Helpers();

	@FindBy(xpath = "//a[@class='btn btn-sm info-actions js-anchor-personalinformation btn-ghost-reverse']")
	WebElementFacade btnCompletarInformacionPersonal;

	@FindBy(xpath = "//a[@class='btn btn-sm info-actions js-anchor-jobs btn-ghost-reverse']")
	WebElementFacade btnCompletarDescribeTuInformacionLaboral;

	@FindBy(xpath = "//a[@class='btn btn-sm info-actions js-anchor-laboral-experience btn-ghost-reverse']")
	WebElementFacade btnCompletarTuExperienciaLaboral;

	@FindBy(xpath = "//button[@class='btn btn-secondary btn-add-experience js-laboral-experience-btn-add js-btn-add']")
	WebElementFacade btnAgregarExperiencia;

	@FindBy(name = "CompanyIndustries.SelectedId")
	WebElementFacade cmbSectorEmpresa;

	@FindBy(name = "CompanySectors.SelectedId")
	WebElementFacade cmbSubSectorEmpresa;

	@FindBy(xpath = "//select[contains(@name,'StartDate.date')]")
	WebElementFacade cmbFechaMesInicio;

	@FindBy(xpath = "//input[contains(@name,'StartDate.date')]")
	WebElementFacade txtFechaAñoInicio;

	@FindBy(name = "IsCurrentlyWorking")
	WebElementFacade chkTrabajoActualmenteEnEstaEmpresa;

	@FindBy(xpath = "//select[contains(@name,'EndDate.date')]")
	WebElementFacade cmbFechaMesFinalizacion;

	@FindBy(xpath = "//input[contains(@name,'EndDate.date')]")
	WebElementFacade txtFechaAñoFinalizacion;

	@FindBy(name = "EquivalentPosition.SelectedIds")
	WebElementFacade cmbCargoEquivalente;

	@FindBy(name = "PositionLevel.SelectedIds")
	WebElementFacade cmbNivelCargo;

	@FindBy(name = "WorkArea.SelectedIds")
	WebElementFacade cmbArea;

	@FindBy(name = "Achievements")
	WebElementFacade txtLogrosResponsabilidades;

	@FindBy(name = "CompanyPhone")
	WebElementFacade txtTelefonoEmpresa;

	@FindBy(name = "City.typehead")
	WebElementFacade txtCiudadEmpresa;

	//@FindBy(xpath = "//form[@action=\"/co/Persons/LaboralExperience/Save\"]//button[@class='btn btn-primary btn-save']")
	@FindBy(xpath = "//*[contains(@class, 'save-laboral-experience')]")
	WebElementFacade btnGuardarExperiencia;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-complete js-btn-complete']")
	WebElementFacade btnCompletarTusEstudios;

	@FindBy(xpath = "//a[@class='btn btn-sm info-actions js-anchor-studies btn-ghost-reverse']")
	WebElementFacade btnCompletarTuFormacionAcademica;

	@FindBy(xpath = "/html/body/div[4]/div/h3")
	WebElementFacade lblTuPerfilHaSidoCreado;

	@FindBy(name = "AddressCity.typehead")
	WebElementFacade txtCiudad;

	@FindBy(name = "Address")
	WebElementFacade txtDireccion;

	@FindBy(name = "BirthdayCity.typehead")
	WebElementFacade txtCiudadNacimiento;

	@FindBy(name = "SecondPhone")
	WebElementFacade txtTelefonoSecundario;

	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-8 col-sm-pull-4 module-flex-child']//button[@class='btn btn-primary btn-save'][1]")
	WebElementFacade btnGuardarInformacion;

	@FindBy(name = "Profile")
	WebElementFacade txtDescribeTuPerfil;

	@FindBy(name = "ExperienceYears.SelectedIds")
	WebElementFacade cmbAniosExperiencia;

	@FindBy(name = "//div[@class='btn-group can-move-wrapper ee-mod']//span[1]")
	List<WebElementFacade> lstMovilidadLaboral;

	@FindBy(name = "//div[@class='btn-group can-move-wrapper ee-mod']//input[1]")
	WebElementFacade lstBtnMovilidadLaboral;

	@FindBy(name = "Salaries.SelectedIds")
	WebElementFacade cmbAspiracionSalarial;

	//@FindBy(xpath = "//div[@class='form-group countries-wrapper js-countries-wrapper']//following::button[@class='btn btn-primary btn-save'][1]")
	@FindBy(xpath = "//*[contains(@class, 'save-professional-profile')]")
	WebElementFacade btnGuardarPerfilLaboral;

	@FindBy(name = "BasicKnowledgeCores.SelectedId")
	WebElementFacade cmbAreaEstudio;

	@FindBy(name = "EducationStatus.SelectedIds")
	WebElementFacade cmbEstado;

	@FindBy(xpath = "//form[@class='js-form-formal-education']//select[contains(@name,'StartDate.date')]")
	WebElementFacade cmbFechaMesInicioEstudio;

	@FindBy(xpath = "//form[@class='js-form-formal-education']//input[contains(@name,'StartDate.date')]")
	WebElementFacade txtFechaAñoInicioEstudio;

	@FindBy(xpath = "//form[@class='js-form-formal-education']//select[contains(@name,'EndDate.date')]")
	WebElementFacade cmbFechaMesFinalizacionEstudio;

	@FindBy(xpath = "//form[@class='js-form-formal-education']//input[contains(@name,'EndDate.date')]")
	WebElementFacade txtFechaAñoFinalizacionEstudio;

	@FindBy(name = "Degree")
	WebElementFacade txtTituloOtorgado;

	@FindBy(name = "InstituteId.typehead")
	WebElementFacade txtInstitucion;

	@FindBy(name = "OtherInstitute")
	WebElementFacade txtOtraInstitucion;

	@FindBy(xpath = "//div[@class='module-collapsible collapse in']//input[@name = 'City.typehead']")
	WebElementFacade txtCiudadInstitucion;

	//@FindBy(xpath = "//div[@class='form-group countries-wrapper js-countries-wrapper']//following::button[@class='btn btn-primary btn-save'][3]")
	@FindBy(xpath = "//*[contains(@class, 'formal-education')]/button[contains(@class, 'save')]")
	WebElementFacade btnGuardarEstudios;

	public void completarSecciones(String completarInformacionPersonal, String ciudad, String direccion,
			String ciudadNacimiento, String telefonoSecundario, String describeTuPerfilLaboral, String describeTuPerfil,
			String aniosExperiencia, String aspiracionSalarial, String movilidadLaboral, String tuExperienciaLaboral,
			String sectorEmpresa, String subSectorEmpresa, String fechaMesInicio, String fechaAñoInicio,
			String trabajoActualmenteEnEstaEmpresa, String fechaMesFinalizacion, String fechaAñoFinalizacion,
			String cargoEquivalente, String nivelCargo, String area, String logrosResposabilidades,
			String telefonoEmpresa, String ciudadEmpresa, String tuFormacionAcademica, String areaEstudios,
			String estado, String fechaMesInicioEstudio, String fechaAñoInicioEstudio,
			String fechaMesFinalizacionEstudio, String fechaAñoFinalizacionEstudio, String tituloOtorgado,
			String institucion, String otraInstitucion, String ciudadInstitucion) {

		if (completarInformacionPersonal.equals("Si")) {
			completarTuInfomacionPersonal(ciudad, direccion, ciudadNacimiento, telefonoSecundario);
		}
		if (describeTuPerfilLaboral.equals("Si")) {
			describeTuPerfilLaboral(describeTuPerfil, aniosExperiencia, aspiracionSalarial, movilidadLaboral);
		}
		if (tuExperienciaLaboral.equals("Si")) {
			adicionarExperiencia(sectorEmpresa, subSectorEmpresa, fechaMesInicio, fechaAñoInicio,
					trabajoActualmenteEnEstaEmpresa, fechaMesFinalizacion, fechaAñoFinalizacion, cargoEquivalente,
					nivelCargo, area, logrosResposabilidades, telefonoEmpresa, ciudadEmpresa);
		}
		if (tuFormacionAcademica.equals("Si")) {
			tuFormacionAcademica(areaEstudios, estado, fechaMesInicioEstudio, fechaAñoInicioEstudio,
					fechaMesFinalizacionEstudio, fechaAñoFinalizacionEstudio, tituloOtorgado, institucion,
					otraInstitucion, ciudadInstitucion);
		}

	}

	public boolean confirmarCreacionPerfil() {
		return lblTuPerfilHaSidoCreado.isCurrentlyVisible();
	}

	public void seleccionarMovilidadLaboral(String movilidadLaboral) {
		for (int i = 0; i < lstMovilidadLaboral.size(); i++) {
			System.out.println(lstMovilidadLaboral.get(i).getText());
			if (lstMovilidadLaboral.get(i).getText().equals(movilidadLaboral)) {

			}
		}
	}

	public void completarTuInfomacionPersonal(String ciudad, String direccion, String ciudadNacimiento,
			String telefonoSecundario) {
		waitFor(ExpectedConditions.visibilityOf(btnCompletarInformacionPersonal));
		withAction().moveToElement(btnCompletarInformacionPersonal).perform();
		waitFor(ExpectedConditions.elementToBeClickable(btnCompletarInformacionPersonal));
		btnCompletarInformacionPersonal.click();
		txtCiudad.sendKeys(ciudad);
		WebElement selCiudad = find(
				By.xpath("//input[@name ='AddressCity.typehead']//following::div/div/div/strong[1]"));
		selCiudad.click();
		txtDireccion.clear();
		txtDireccion.sendKeys(direccion);
		txtCiudadNacimiento.sendKeys(ciudadNacimiento);
		WebElement selCiudadNac = find(
				By.xpath("//input[@name ='BirthdayCity.typehead']//following::div/div/div/strong[1]"));
		selCiudadNac.click();
		txtTelefonoSecundario.sendKeys(telefonoSecundario);
		if (btnGuardarInformacion.isCurrentlyVisible()) {
			btnGuardarInformacion.click();
			helpers.esperaSelenium(5);
		}

	}

	public void describeTuPerfilLaboral(String describeTuPerfil, String aniosExperiencia, String aspiracionSalarial,
			String movilidadLaboral) {
		btnCompletarDescribeTuInformacionLaboral.click();
		txtDescribeTuPerfil.sendKeys(describeTuPerfil);
		cmbAniosExperiencia.selectByVisibleText(aniosExperiencia);
		cmbAspiracionSalarial.selectByVisibleText(aspiracionSalarial);
		// withAction().moveToElement(lstBtnMovilidadLaboral).click().build().perform();
		// seleccionarMovilidadLaboral(movilidadLaboral);
		withAction().moveToElement(btnGuardarPerfilLaboral).perform();
		btnGuardarPerfilLaboral.click();
		helpers.esperaSelenium(10);
	}

	public void adicionarExperiencia(String sectorEmpresa, String subSectorEmpresa, String fechaMesInicio,
			String fechaAñoInicio, String trabajoActualmenteEnEstaEmpresa, String fechaMesFinalizacion,
			String fechaAñoFinalizacion, String cargoEquivalente, String nivelCargo, String area,
			String logrosResposabilidades, String telefonoEmpresa, String ciudadEmpresa) {
		btnCompletarTuExperienciaLaboral.click();
		btnAgregarExperiencia.click();
		cmbSectorEmpresa.selectByVisibleText(sectorEmpresa);
		cmbSubSectorEmpresa.selectByVisibleText(subSectorEmpresa);
		cmbFechaMesInicio.selectByVisibleText(fechaMesInicio);
		txtFechaAñoInicio.sendKeys(fechaAñoInicio);
		if (trabajoActualmenteEnEstaEmpresa.equals("No")) {
			cmbFechaMesFinalizacion.selectByVisibleText(fechaMesFinalizacion);
			txtFechaAñoFinalizacion.sendKeys(fechaAñoFinalizacion);
		}
		cmbCargoEquivalente.selectByVisibleText(cargoEquivalente);
		cmbNivelCargo.selectByVisibleText(nivelCargo);
		cmbArea.selectByVisibleText(area);
		txtLogrosResponsabilidades.sendKeys(logrosResposabilidades);
		txtTelefonoEmpresa.sendKeys(telefonoEmpresa);
		txtCiudadEmpresa.sendKeys(ciudadEmpresa);
		WebElement selCiudadEmpresa = find(
				By.xpath("//input[@name ='City.typehead']//following::div/div/div/strong[1]"));
		selCiudadEmpresa.click();
		if (btnGuardarExperiencia.isCurrentlyVisible()) {
			btnGuardarExperiencia.click();
			helpers.esperaSelenium(5);
		}


	}

	@SuppressWarnings("unlikely-arg-type")
	public void tuFormacionAcademica(String areaEstudios, String estado, String fechaMesInicioEstudio,
			String fechaAñoInicioEstudio, String fechaMesFinalizacionEstudio, String fechaAñoFinalizacionEstudio,
			String tituloOtorgado, String institucion, String otraInstitucion, String ciudadInstitucion) {
		btnCompletarTuFormacionAcademica.click();
		btnCompletarTusEstudios.click();
		cmbAreaEstudio.selectByVisibleText(areaEstudios);
		cmbEstado.selectByVisibleText(estado);
		cmbFechaMesInicioEstudio.selectByVisibleText(fechaMesInicioEstudio);
		txtFechaAñoInicioEstudio.sendKeys(fechaAñoInicioEstudio);
		if (cmbFechaMesFinalizacionEstudio.isCurrentlyEnabled()) {
			cmbFechaMesFinalizacionEstudio.selectByVisibleText(fechaMesFinalizacionEstudio);
			txtFechaAñoFinalizacionEstudio.sendKeys(fechaAñoFinalizacionEstudio);
		}
		txtTituloOtorgado.sendKeys(tituloOtorgado);
		txtInstitucion.sendKeys(institucion);
		WebElement selInstitucion = find(
				By.xpath("//input[@name ='InstituteId.typehead']//following::div/div/div/strong[1]"));
		selInstitucion.click();
		waitFor(ExpectedConditions.visibilityOfAllElements(txtOtraInstitucion));
		if (institucion.equals("Otra institución")) {
			txtOtraInstitucion.sendKeys(otraInstitucion);
		}
		txtCiudadInstitucion.sendKeys(ciudadInstitucion);
		WebElement selCiudadInstitucion = find(By.xpath(
				"//div[@class='module-collapsible collapse in']//input[@name = 'City.typehead']//following::div/div/div/strong[1]"));
		selCiudadInstitucion.click();
		btnGuardarEstudios.click();
		helpers.esperaSelenium(15);

	}
}
