Feature: Apertura de cuenta en Interbank.pe

  @AperturaCuenta1
  Scenario: Cliente sin ofertas para apertura de cuenta - Scenario
    Given estoy en la web de Interbank
    When selecciono el boton Abre tu Cuenta
    And ingreso el numero de DNI "12345678"
    And ingreso el email "prueba@auto.com"
    And selecciono el operador "ENTEL"
    And ingreso el celular "999888777"
    And presiono el boton Siguiente
    Then verifico que se muestre ninguna oferta


  @AperturaCuenta2
  Scenario Outline: Cliente sin ofertas para apertura de cuenta - Scenario Outline
    Given estoy en la web de Interbank
    When selecciono el boton Abre tu Cuenta
    And ingreso el numero de DNI "<DNI>"
    And ingreso el email "<EMAIL>"
    And selecciono el operador "<OPERADOR>"
    And ingreso el celular "<CELULAR>"
    And presiono el boton Siguiente
    Then verifico que se muestre el mensaje "<MENSAJE>"
    Examples:
      | DNI      | EMAIL            | OPERADOR | CELULAR   | MENSAJE               |
      | 12345678 | prueba@auto.com  | CLARO    | 999888777 | No podemos atenderte  |


  @ValidarCampoEmail
  Scenario: Validar que campo Email sea obligatorio
    Given estoy en la web de Interbank
    When selecciono el boton Abre tu Cuenta
    And ingreso el numero de DNI "12345678"
    And ingreso el email ""
    And selecciono el operador "ENTEL"
    And ingreso el celular "999888777"
    And presiono el boton Siguiente
    Then verifico que se muestre el mensaje de alerta "INGRESE SU EMAIL"
