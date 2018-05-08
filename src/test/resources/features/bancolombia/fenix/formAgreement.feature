#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Formulario Vinculacion Convenios
  Yo como Usuario de la Gerencia de Producto de TDC necesito tener una pantalla 
  para realizar la vinculación de los convenios.

  @EscenarioCreacionExitosa
  Scenario Outline: Diligenciar de forma exitosa el formulario para la creación de convenios
    Given Verificar ingreso opción Convenios
    When Ingresar los datos requeridos del formulario
    |<codconvenio>|<razonsocial>|<tipodoc>|<nrodoc>|<cupoconvenio>|<ciudad>|<comision>|<estado>|<tipocuenta>|<nrocuenta>|<tipotarjeta>|<tipoextracto>|<bin>|<logo>|<contacto>|<telcontacto>|<correocontacto>|<nombreejecutivo>|<codgerenciador>|
    Then Guardar registro

    Examples: 
|100	|Country			|Nit									|123456789	|10000000	|Medellín|0,5	|Activo			|Ahorros	|00100120801	|Física	|Físico	|852123	|700|
|100	|Country			|Nit									|123456789	|10000000	|Medellín|0,5	|Activo			|Ahorros	|00100120801	|Física	|Físico	|852123	|700|
|150	|Odebrecht		|Nit									|4443355		|0				|Medellín|0,5	|Activo			|Ahorros	|00100123217	|Física	|Físico	|852123	|700|
|2222	|Lina Granada	|Cédula de ciudadanía	|12344567898|34545456	|Calí	 	 |0		|Activo			|Ahorros	|00100123333	|Virtual|Virtual|852123	|700|
|200	|Versalles		|Cédula de ciudadanía	|9999999		|2000000	|Bogotá	 |0,5	|Activo			|Ahorros	|00100103018	|Virtual|Físico	|852123	|700|
|300	|Paisapan			|Cédula de extrajería	|888888			|300000000|Cali	 	 |1		|Activo			|Corriente|00100103018	|Virtual|Virtual|852123	|700|
|400	|JuanchoLlanta|Cédula de ciudadanía	|333333			|4000000	|Pereira |2		|Inactivo		|Corriente|00100120999	|Física	|Virtual|852123	|700|
|555	|MamaInes			|Nit									|55555			|20000000	|Armenia |0,8	|Suspendido	|Ahorros	|00100120888	|Virtual|Físico	|852123	|700|
|666	|Pepito				|Cédula de extrajería	|11111111		|-200000	|Cucuta	 |2		|Activo			|Corriente|001001030111	|Física	|Físico	|852123	|700|
|7777	|Flota Aerea	|Nit									|2222222		|467899		|Pasto	 |-3	|Activo			|Ahorros	|001001030000	|Virtual|Virtual|852123	|700|
|88888|Papas Arturo	|Cédula de extrajería	|33534654		|465447474|Bogotá	 |2		|Activo			|Ahorros	|001001030000	|Virtual|Virtual|852123	|700|
|200	|Country			|Nit									|123456789	|10000000	|Medellín|0,5	|Activo			|Ahorros	|00100120801	|Física	|Físico	|852123	|700|
|100	|Country			|Nit									|223456789	|10000000	|Medellín|0,5	|Activo			|Ahorros	|00100120801	|Física	|Físico	|852123	|700|
|100	|Country			|Nit									|123456789	|55555555	|Ibague	 |0,5	|Activo			|Ahorros	|00100120801	|Física	|Físico	|852123	|700|
|200	|Versalles		|Cédula de ciudadanía	|9999999		|2000000	|Bogotá	 |0,5	|Activo			|Corriente|00100103018	|Física	|Físico	|852123	|702|
|300	|Paisapan			|Cédula de extrajería	|888888			|300000000|Cali	 	 |1		|Inactivo		|Corriente|00100103018	|Virtual|Virtual|852123	|702|
|400	|JuanchoLlanta|Cédula de ciudadanía	|333333			|0				|Pereira |2		|Activo			|Corriente|00100120999	|Física	|Virtual|852123	|700|
|100	|Country			|Nit									|123456789	|55555555	|Ibague	 |0,5	|Suspendido	|Ahorros	|00100120801	|Virtual|Físico	|852123	|700|
|100	|Country			|Nit									|123456789	|55555555	|Ibague	 |0,5	|Suspendido	|Ahorros	|00100120801	|Virtual|Físico	|852123	|700|
