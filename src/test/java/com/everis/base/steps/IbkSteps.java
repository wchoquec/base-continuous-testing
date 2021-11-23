package com.everis.base.steps;

import com.everis.base.pageobject.IbkPage;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IbkSteps {

    private static final Logger logger = LoggerFactory.getLogger(IbkSteps.class);

    IbkPage ibkPage;

    public void abrirWebInterbank(){
        ibkPage.open();
    }
    public void seleccionarBotonAbreTuCuenta(){
        ibkPage.btnAbreTuCuenta.isDisplayed();
        Serenity.takeScreenshot();
        ibkPage.btnAbreTuCuenta.click();
    }
    public void ingresarNumeroDNI(String dni){
        ibkPage.txtDni.isDisplayed();
        ibkPage.txtDni.type(dni);
    }
    public void ingresarEmail(String email){
        ibkPage.txtEmail.type(email);
    }
    public void seleccionarOperador(String operador){
        ibkPage.cboOperador.click();

       switch (operador){

           case "CLARO":
               ibkPage.itemClaro.click();
               break;
           case "ENTEL":
               ibkPage.itemEntel.click();
               break;
           case "MOVISTAR":
               ibkPage.itemMovistar.click();
               break;
           case "BITEL":
               ibkPage.itemBitel.click();
               break;
           default:
               logger.error("OPERADOR NO ENCONTRADO");
               Assert.fail();
       }

      /*  if(operador.equalsIgnoreCase("CLARO")){
            ibkPage.itemClaro.click();
        }else if(operador.equalsIgnoreCase("ENTEL")){
            ibkPage.itemEntel.click();
        }else if(operador.equalsIgnoreCase("MOVISTAR")){
            ibkPage.itemMovistar.click();
        }else if(operador.equalsIgnoreCase("BITEL")){
            ibkPage.itemBitel.click();
        }else{
            logger.error("OPERADOR NO ENCONTRADO");
            Assert.fail();
        }*/

    }
    public void ingresarCelular(String celular){
        ibkPage.txtCelular.type(celular);
    }
    public void presionarBotonSiguiente(){
        ibkPage.btnSiguiente.click();
    }
    public void verificarOfertasNoEncontradas(){
        ibkPage.lblMensajeSinOfertas.isDisplayed();
        logger.info(ibkPage.lblMensajeSinOfertas.getText().trim());
        Serenity.takeScreenshot();
        Assert.assertEquals("No podemos atenderte",ibkPage.lblMensajeSinOfertas.getText().trim());
    }
    public void verificarMensaje(String mensaje){
        ibkPage.lblMensajeSinOfertas.isDisplayed();
        logger.info(ibkPage.lblMensajeSinOfertas.getText().trim());
        //String var = ibkPage.lblMensajeSinOfertas.getText().toUpperCase();
        Assert.assertEquals(mensaje,ibkPage.lblMensajeSinOfertas.getText().trim());
    }

    public void verificarAlertaEmail(String var){
        ibkPage.lblAlertaEmail.isDisplayed();
        logger.info(ibkPage.lblAlertaEmail.getText());
        Serenity.takeScreenshot();
        Assert.assertEquals(var, ibkPage.lblAlertaEmail.getText().trim());
    }

}