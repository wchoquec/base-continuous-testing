package com.everis.base.steps;

import com.everis.base.pageobject.LinioPage;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class LinioSteps {

    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    LinioPage page;

    public void abrirPaginaLinio(){
        page.open();
        page.imgIcono.isDisplayed();
    }

    public void ingresarDato(String var){
        page.txtBuscador.type(var);
    }

    public void presionarBotonBuscar(){
        page.btnBuscar.click();
    }

    public void verificarResultadosDeBusqueda(){
        page.lblResultados.isDisplayed();

        String resultados = page.lblResultados.getText().substring(9,11).trim();
        logger.info(resultados);
        int varNumero = Integer.parseInt(resultados);
        logger.info(String.valueOf(varNumero));

        assertThat(varNumero,greaterThanOrEqualTo(0));
    }

    public void seleccionarPrimeroElemento(){
        page.imgPrimerElemento.waitUntilVisible();
        page.imgPrimerElemento.click();
    }

    public void presionarBotonAgregarCarrito(){
        page.btnAgregarCarrito.waitUntilVisible();
        page.btnAgregarCarrito.click();
    }

    public void verificarProductoAgregado(String cantidad, String mensaje){

        page.lblMensajeProductoAgregado.waitUntilVisible();


        Assert.assertEquals(Integer.parseInt(cantidad),Integer.parseInt(page.lblCantidad.getText().trim()));

        Assert.assertEquals(mensaje,page.lblMensajeProductoAgregado.getText().trim());

        logger.info("Mensaje: "+page.lblMensajeProductoAgregado.getText().trim());
        logger.info("Cantidad: "+cantidad);

    }

    public void presionarBotonIrAlCarrito(){
        page.btnIrAlCarrito.click();
    }

    public void verificarSubtotal(String var){
        page.lblSubtotal.isDisplayed();

        Assert.assertTrue(page.lblSubtotal.containsText(var));

    }
}