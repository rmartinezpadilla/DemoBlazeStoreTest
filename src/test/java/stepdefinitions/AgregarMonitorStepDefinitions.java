package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ElMensaje;
import tasks.AgregarMonitores;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarMonitorStepDefinitions {
    @Managed(driver ="chrome")
    private WebDriver hisBrowser;
    private Actor ruben = Actor.named("ruben");

    @Before
    public void configuracionInicial(){
        ruben.can(BrowseTheWeb.with(hisBrowser));

    }

    @Cuando("^agrego (.*) de la categoria monitores$")
    public void agregoDeLaCategoriaMonitores(String producto) {
        ruben.attemptsTo(AgregarMonitores.alCarrito(producto));
    }

    @Entonces("^puedo ver el mensaje de producto agregado correctamente$")
    public void puedoVerElMensajeDeProductoAgregadoCorrectamente() {
        ruben.should(seeThat(ElMensaje.es(), equalTo("Product added")));

    }
}
