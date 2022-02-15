package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import variablesglobales.VariablesGlobales;

public class ElMensaje implements Question<String> {

    public static ElMensaje es() {

        return new ElMensaje();
    }

    @Override
    public String answeredBy(Actor actor) {

        return VariablesGlobales.mensaje;
    }
}
