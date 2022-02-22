package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;
import questions.ElPrecio;
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
    @Entonces("^puedo ver el (.*) a pagar en el carrito de compra$")
    public void puedoVerElTotalAPagarEnElCarritoDeCompra(int precio) {
        ruben.should(seeThat(ElPrecio.es(), equalTo(precio)));


    }

}
