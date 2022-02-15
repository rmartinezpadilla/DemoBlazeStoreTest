package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import variablesglobales.VariablesGlobales;

import static ui.DemoBlazeStoreHome.*;

public class Registrar implements Task {

    private String usuario;
    private String contrasena;

public Registrar(String usuario, String contrasena){
    super();
    this.usuario=usuario;
    this.contrasena=contrasena;
}


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_REGISTRO_SIGN_UP),
                Enter.theValue(usuario).into(INPUT_REGISTRO_USER_NAME),
                Enter.theValue(contrasena).into(INPUT_REGISTRO_PASSWORD),
                Click.on(BOTON_REGISTRO_SIGN_UP_CONFIRMAR)
                );
        VariablesGlobales.mensaje = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

    }

    public static Registrar enDemoBlazestore(String usuario, String contrasena) {
        return Tasks.instrumented(Registrar.class, usuario, contrasena);
    }

}
