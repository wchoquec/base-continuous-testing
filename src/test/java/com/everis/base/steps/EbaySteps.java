package com.everis.base.steps;

import com.everis.base.pageobject.EbayPage;
import net.serenitybdd.core.Serenity;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class EbaySteps {

    private static final Logger logger = LoggerFactory.getLogger(EbaySteps.class);

    EbayPage page;

    public void abrirWebEbay(){
        page.open();
    }

    public void ingresarProducto(String var){
        page.txtBuscador.isDisplayed();
        Serenity.takeScreenshot();
        page.txtBuscador.type(var);
    }

    public void presionarBotonBuscar(){
        Serenity.takeScreenshot();
        page.btnBuscar.click();
    }

    public void seleccionarTamañoPantalla(int var){
        page.checkBox20a29.isDisplayed();
        logger.info(page.checkBox20a29.getText());
        if(page.checkBox20a29.getText().contains(String.valueOf(var))){
            page.checkBox20a29.click();
        }else{
            Assert.fail();
        }
        Serenity.takeScreenshot();
    }

    public void verificarExistenciaProductos(){
        page.lblResultado.isDisplayed();
    }

    public void seleccionarPrimerProducto(){
        page.imgPrimerProducto.isDisplayed();
        page.imgPrimerProducto.click();
    }
    public void presionarBotonAgregarAlCarro(){

        String var = getDriver().getWindowHandle();
        //getDriver().switchTo().window(var);
        page.getDriver().switchTo().window(var);

        page.btnAgregarACarrito.isDisplayed();
        page.btnAgregarACarrito.click();
    }


}
