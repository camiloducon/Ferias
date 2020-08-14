# language: es
# encoding: iso-8859-1
Característica: Crear Hoja de Vida
  yo como usuario de elempleo - ferias
  deseo crear una hoja de vida
  para validar su correcto funcionamiento

  @crearEmpleo
  Esquema del escenario: Crear oferta de empleo
    Dado que deseo crear una hoja de vida <Fila>
      | Ruta Excel                         | Pestaña       |
      | src/test/resources/data/Datos.xlsx | CrearHojaVida |
    Cuando ingreso a los diferentes portales de ferias
    Y realizo en ingreso a crear la hoja de vida
    Entonces puedo finalizar con creacion de la Hoja de vida

    Ejemplos: 
      | Fila |   
      |    1 | 
      |    2 |
      |    5 |
      |    6 |         