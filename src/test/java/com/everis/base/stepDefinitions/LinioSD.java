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

}