# language: es
# encoding: iso-8859-1
Característica: Aplicar a Ofertas
  yo como usuario de elempleo - ferias
  deseo aplicar a una oferta
  para poder visualizar las opciones

  @aplicarOferta
  Esquema del escenario: Aplicar a Ofertas
    Dado que deseo aplicar a una oferta <Fila>
      | Ruta Excel                         | Pestaña       |
      | src/test/resources/data/Datos.xlsx | aplicarOferta |
    Cuando realizo el login
    Y valido las ofertas
    Entonces puedo aplicar a una de ellas

    Ejemplos: 
      | Fila |
      |    1 |
      |    2 |
      |    3 |
      |    4 |                             
                