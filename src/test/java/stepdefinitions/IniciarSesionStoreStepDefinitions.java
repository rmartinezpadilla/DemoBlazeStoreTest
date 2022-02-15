package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.Bienvenida;
import tasks.Ingresar;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class IniciarSesionStoreStepDefinitions {
    @Managed(driver ="chrome")
    private WebDriver hisBrowser;
    private Actor ruben = Actor.named("ruben");

    @Before
    public void configuracionInicial(){
        ruben.can(BrowseTheWeb.with(hisBrowser));

    }

    @Cuando("^se ingresa el usuario: (.*) y contrasena: (.*)$")
    public void seIngresaElUsuarioXxxxYContrasenaXxxx(String usuario, String contrasena) {
        ruben.attemptsTo(Ingresar.enDemoBlazestore(usuario, contrasena));
    }
    @Entonces("^se valida la bienvenida al usuario: (.*)$")
    public void seValidaLaBienvenidaAlUsuarioXxxx(String usuario) {
        ruben.should(seeThat(Bienvenida.es(), equalTo("Welcome " + usuario)));

    }
}
