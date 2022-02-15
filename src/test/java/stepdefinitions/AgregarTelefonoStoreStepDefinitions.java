package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ElMensaje;
import tasks.AgregarTelefonos;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class AgregarTelefonoStoreStepDefinitions {
    @Managed(driver ="chrome")
    private WebDriver hisBrowser;
    private Actor ruben = Actor.named("ruben");

    @Before
    public void configuracionInicial(){
        ruben.can(BrowseTheWeb.with(hisBrowser));

    }

    @Cuando("^agrego (.*) de la categoria telefonos$")
    public void agregoDeLaCategoriaTelefonos(String producto) {
        ruben.attemptsTo(AgregarTelefonos.alCarrito(producto));
    }

    @Entonces("^puedo ver el mensaje de agregado correctamente$")
    public void puedoVerElMensajeDeAgregadoCorrectamente() {
        ruben.should(seeThat(ElMensaje.es(), equalTo("Product added")));

    }
}
