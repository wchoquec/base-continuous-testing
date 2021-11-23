package com.everis.base.stepDefinitions;

import com.everis.base.steps.LinioSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LinioSD {

    @Steps
    LinioSteps steps;

    @Given("abro la pagina de Linio")
    public void abroLaPaginaDeLinio() {
        steps.abrirPaginaLinio();
    }

    @When("ingreso el dato para la busqueda {string}")
    public void ingresoElDatoParaLaBusqueda(String var) {
        steps.ingresarDato(var);
    }

    @And("presiono boton buscar")
    public void presionoBotonBuscar() {
        steps.presionarBotonBuscar();
    }

    @Then("verifico que se muestren resultados")
    public void verificoResultadosDeBusqueda(){
        steps.verificarResultadosDeBusqueda();
    }

    @And("selecciono primer elemento")
    public void seleccionoPrimerElemento(){
        steps.seleccionarPrimeroElemento();
    }
    @And("presiono boton Añadir al carrito")
    public void presionoBotonAgregarAlCarrito(){
        steps.presionarBotonAgregarCarrito();
    }
    @Then("verifico que se agregue {string} producto y el mensaje sea {string}")
    public void verificoProductoAgregado(String cantidad, String mensaje){
        steps.verificarProductoAgregado(cantidad, mensaje);
    }

    @And("presiono boton Ir al carrito")
    public void presionoBotonIrAlCarrito(){
        steps.presionarBotonIrAlCarrito();
    }
    @Then("verifico que el subtotal sea {string}")
    public void verificarSubTotal(String var){
        steps.verificarSubtotal(var);
    }


}