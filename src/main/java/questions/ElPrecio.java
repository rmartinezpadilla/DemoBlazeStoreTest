package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.DemoBlazeStoreHome;

public class ElPrecio implements Question<Integer> {

     public static ElPrecio es() {
        return new ElPrecio();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return Integer.parseInt(Text.of(DemoBlazeStoreHome.PRECIO).viewedBy(actor).asString());
    }
}
