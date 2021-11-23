@Ebay
Feature: Productos en EBAY

  @Ebay1
  Scenario: Busqueda de producto en la web de ebay
    Given abro la pagina de EBAY
    When ingreso el producto para la busqueda "televisor"
    And presiono el boton Buscar
    And selecciono una tv menor a 29 pulgadas
    Then verifico que existan resultados

  @Ebay2
  Scenario: Busqueda de producto en la web de ebay - Tamaño de TV no encontrada
    Given abro la pagina de EBAY
    When ingreso el producto para la busqueda "televisor"
    And presiono el boton Buscar
    And selecciono una tv menor a 29 pulgadas
    Then verifico que existan resultados