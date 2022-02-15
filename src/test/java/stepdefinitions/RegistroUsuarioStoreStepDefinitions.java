package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ElMensaje;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class RegistroUsuarioStoreStepDefinitions {

    @Managed(driver ="chrome")
    private WebDriver hisBrowser;
    private Actor ruben = Actor.named("ruben");

    @Before
    public void configuracionInicial(){
        ruben.can(BrowseTheWeb.with(hisBrowser));

    }
    @Dado("^que requiero ingresar a la pagina demoblaze$")
    public void queRequieroIngresarALaPaginaDemoblaze() {

        ruben.wasAbleTo(Abrir.LaPaginaDemoBlaze());

    }
    @Cuando("^se realiza el regristo en la pagina con usuario: (.*) y contrasena: (.*)$")
    public void seRealizaElRegristoEnLaPaginaConUsuarioYContrasena(String usuario, String contrasena) {
        ruben.attemptsTo(Registrar.enDemoBlazestore(usuario, contrasena));

    }
    @Entonces("^se valida la creacion del usuario$")
    public void seValidaLaCreacionDelUsuario() {
       ruben.should(seeThat(ElMensaje.es(), equalTo("Sign up successful.")));

    }



}
