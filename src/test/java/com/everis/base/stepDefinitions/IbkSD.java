package com.everis.base.stepDefinitions;

import com.everis.base.steps.IbkSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class IbkSD {

    @Steps
    IbkSteps ibkSteps;

    @Given("estoy en la web de Interbank")
    public void abrirWebInterbank(){
        ibkSteps.abrirWebInterbank();
    }

    @When("selecciono el boton Abre tu Cuenta")
    public void seleccionoElBotonAbreTuCuenta() {
        ibkSteps.seleccionarBotonAbreTuCuenta();
    }

    @And("ingreso el numero de DNI {string}")
    public void ingresoElNumeroDeDNI(String dni) {
        ibkSteps.ingresarNumeroDNI(dni);
    }

    @And("ingreso el email {string}")
    public void ingresoElEmail(String mail) {
        ibkSteps.ingresarEmail(mail);
    }

    @And("selecciono el operador {string}")
    public void seleccionoElOperador(String operador) {
        ibkSteps.seleccionarOperador(operador);
    }

    @And("ingreso el celular {string}")
    public void ingresoElCelular(String celular) {
        ibkSteps.ingresarCelular(celular);
    }

    @And("presiono el boton Siguiente")
    public void presionoElBotonSiguiente() {
        ibkSteps.presionarBotonSiguiente();
    }

    @Then("verifico que se muestre ninguna oferta")
    public void verificoQueSeMuestreNingunaOferta() {
        ibkSteps.verificarOfertasNoEncontradas();
    }


    @Then("verifico que se muestre el mensaje {string}")
    public void verificoQueSeMuestreElMensaje(String mensaje) {
        ibkSteps.verificarMensaje(mensaje);
    }

    @Then("verifico que se muestre el mensaje de alerta {string}")
    public void verificarMensajeAlertaEmail(String var){
        ibkSteps.verificarAlertaEmail(var);
    }

}