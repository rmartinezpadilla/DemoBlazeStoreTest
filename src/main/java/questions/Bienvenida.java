package questions;

import net.serenitybdd.screenplay.Actor;
import static ui.DemoBlazeStoreHome.A_BIENVENIDA_USUARIO;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Bienvenida implements Question<String> {

    public static Bienvenida es() {
        return new Bienvenida();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(A_BIENVENIDA_USUARIO).viewedBy(actor).asString();
    }
}
