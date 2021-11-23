package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.linio.com.pe/")
public class LinioPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[2]/div[1]/a")
    public WebElementFacade imgIcono;

    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[2]/div[4]/form/div/div/input")
    public WebElementFacade txtBuscador;

    @FindBy(xpath = "//*[@id=\"navbar\"]/div/div[2]/div[4]/form/div/div/div/button/span")
    public WebElementFacade btnBuscar;

    @FindBy(xpath = "/html/body/div[3]/main/div[1]/div[3]/p[1]")
    public WebElementFacade lblResultados;

    @FindBy(xpath = "//*[@id=\"catalogue-product-container\"]/div[1]/a[1]/div[1]/figure/picture/img")
    public WebElementFacade imgPrimerElemento;

    @FindBy(id = "buy-now")
    public WebElementFacade btnAgregarCarrito;

    @FindBy(id = "added-product-quantity")
    public WebElementFacade lblCantidad;

    @FindBy(xpath = "//*[@id=\"alert-add-to-cart\"]/div/div/div[1]/div/h2[1]")
    public WebElementFacade lblMensajeProductoAgregado;

    @FindBy(xpath = "//*[@id=\"alert-add-to-cart\"]/div/div/div[4]/a")
    public WebElementFacade btnIrAlCarrito;

    @FindBy(xpath = "/html/body/div[4]/main/div[1]/div/div[2]/div/ul/li[1]/p")
    public WebElementFacade lblSubtotal;


}