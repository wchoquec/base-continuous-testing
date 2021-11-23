Feature: Escenarios Outline en Linio


  @Carrito
  Scenario Outline: Busqueda de productos por escenario outline
    Given abro la pagina de Linio
    When ingreso el dato para la busqueda "<producto>"
    And presiono boton buscar
    And selecciono primer elemento
    And presiono boton Añadir al carrito
    Then verifico que se agregue "<cantidad>" producto y el mensaje sea "<mensaje>"
    And presiono boton Ir al carrito
    Then verifico que el subtotal sea "<cantidad>"
    Examples:
      | producto | cantidad | mensaje |
      | laptop   | 1        | Tu producto se agregó al carrito |