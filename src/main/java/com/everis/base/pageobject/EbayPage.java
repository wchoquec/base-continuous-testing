package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.ebay.com/")
public class EbayPage extends PageObject {

    @FindBy(name = "_nkw")
    public WebElementFacade txtBuscador;

    @FindBy(id = "gh-btn")
    public WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"x-refine__group_1__0\"]/ul/li[2]/div/a/div/div/span[1]")
    public WebElementFacade checkBox20a29;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]")
    public WebElementFacade lblResultado;

    @FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[1]/div/a/div/img")
    public WebElementFacade imgPrimerProducto;

    @FindBy(id = "isCartBtn_btn")
    public WebElementFacade btnAgregarACarrito;

}
