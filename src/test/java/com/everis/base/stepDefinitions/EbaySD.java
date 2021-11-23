package com.everis.base.stepDefinitions;

import com.everis.base.steps.EbaySteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EbaySD {


    @Steps
    EbaySteps steps;

    @Given("abro la pagina de EBAY")
    public void abroLaPaginaDeEBAY() {
        steps.abrirWebEbay();
    }

    @When("ingreso el producto para la busqueda {string}")
    public void ingresoElProductoParaLaBusqueda(String var) {
        steps.ingresarProducto(var);
    }

    @And("presiono el boton Buscar")
    public void presionoElBotonBuscar() {
        steps.presionarBotonBuscar();
    }

    @And("selecciono una tv menor a {int} pulgadas")
    public void seleccionoUnaTvMenorAPulgadas(int pulgadas) {
        steps.seleccionarTamañoPantalla(pulgadas);
    }

    @Then("verifico que existan resultados")
    public void verificoQueExistanResultados() {
        steps.verificarExistenciaProductos();
    }

    @And("selecciono el primer producto")
    public void seleccionarPrimerProducto(){
        steps.seleccionarPrimerProducto();
    }

    @And("presiono boton Agregar al carro de compras")
    public void presionarBotonAgregarAlCarro(){
        steps.presionarBotonAgregarAlCarro();
    }

}
