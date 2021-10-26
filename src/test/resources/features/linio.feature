Feature: Feature de la pagina Linio

  @Linio1
  Scenario: Busqueda de producto en la pagina de Linio
    Given abro la pagina de Linio
    When ingreso el dato para la busqueda "televisor"
    And presiono boton buscar
    Then verifico que se muestren resultados

