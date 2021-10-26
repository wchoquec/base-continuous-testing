package com.everis.base.steps;

import com.everis.base.pageobject.LinioPage;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class LinioSteps {

    LinioPage page;
    private static final Logger logger = LoggerFactory.getLogger(LinioSteps.class);

    public void abrirPaginaLinio(){
        page.open();
        page.imgIcono.isDisplayed();
    }

    public void ingresarDato(String dato){
        page.txtBuscador.type(dato);
    }

    public void presionarBotonBuscar(){
        page.btnBuscar.click();
    }
    public void verificarResultadosDeBusqueda(){
        page.lblResultados.isDisplayed();
        String resultados = page.lblResultados.getText().substring(9,11).trim();
        int varNumero = Integer.parseInt(resultados);
        assertThat(varNumero,greaterThanOrEqualTo(0));
    }

}