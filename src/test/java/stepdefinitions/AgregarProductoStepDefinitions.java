package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AgregaProducto;

public class AgregarProductoStepDefinitions {
    @Managed(driver ="chrome")
    private WebDriver hisBrowser;
    private Actor ruben = Actor.named("ruben");

    @Before
    public void configuracionInicial(){
        ruben.can(BrowseTheWeb.with(hisBrowser));

    }

    @Cuando("^agrego (.*) de la categoria (.*)$")
    public void agregoAppleMonitorDeLaCategoriaMonitors(String producto, String categoria) {
        ruben.attemptsTo(AgregaProducto.aLaCompra(producto, categoria));


    }
    @Entonces("puedo ver el total a pagar en el carrito de compra")
    public void puedoVerElTotalAPagarEnElCarritoDeCompra() {

    }

}
