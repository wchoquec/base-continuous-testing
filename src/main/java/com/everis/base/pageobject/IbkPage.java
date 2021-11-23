package com.everis.base.pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://interbank.pe/")
public class IbkPage extends PageObject {

    @FindBy(xpath = "/html/body/header/div/div[3]/a")
    public WebElementFacade btnAbreTuCuenta;

    @FindBy(id = "document")
    public WebElementFacade txtDni;

    @FindBy(id = "mail")
    public WebElementFacade txtEmail;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div/div[1]")
    public WebElementFacade cboOperador;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div/div[2]/ul/li[2]")
    public WebElementFacade itemClaro;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div/div[2]/ul/li[3]")
    public WebElementFacade itemEntel;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div/div[2]/ul/li[4]")
    public WebElementFacade itemMovistar;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div[1]/div/div/div[2]/div/form/div[3]/div[1]/div/div/div/div/div[2]/ul/li[5]")
    public WebElementFacade itemBitel;

    @FindBy(id = "mobile")
    public WebElementFacade txtCelular;

    @FindBy(id = "processButton")
    public WebElementFacade btnSiguiente;

    @FindBy(xpath = "//*[@id=\"portlet_pe_com_ibk_halcon_cuenta_portlet_SimpleAccountPortlet_INSTANCE_3NoRFaq3u8X8\"]/div/div[2]/div/div/div/div/div[2]/div/div/h4")
    public WebElementFacade lblMensajeSinOfertas;

    @FindBy(id = "error-mail")
    public WebElementFacade lblAlertaEmail;

}