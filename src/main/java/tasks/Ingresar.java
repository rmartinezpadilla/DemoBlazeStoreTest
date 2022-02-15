package tasks;

import static ui.DemoBlazeStoreHome.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Ingresar implements Task {

    private String usuario;
    private String contrasena;

    public Ingresar(String usuario, String contrasena) {
        super();
        this.usuario = usuario;
        this.contrasena = contrasena;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(BOTON_LOG_IN),
                Enter.theValue(usuario).into(INPUT_LOGIN_USER_NAME),
                Enter.theValue(contrasena).into(INPUT_LOGIN_PASSWORD),
                Click.on(BOTON_SIGN_IN_CONFIRMAR)
        );

    }

    public static Ingresar enDemoBlazestore(String usuario, String contrasena) {
        return Tasks.instrumented(Ingresar.class, usuario, contrasena);
    }
}
