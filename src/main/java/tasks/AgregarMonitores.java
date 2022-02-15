package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import variablesglobales.VariablesGlobales;

import static ui.DemoBlazeStoreHome.*;

public class AgregarMonitores implements Task {
    private String producto;

    public AgregarMonitores(String producto) {
        super();
        this.producto = producto;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LINK_MONITORES),
                Click.on(LINK_MONITORES),
                Scroll.to(A_SELECCIONAR_PRODUCTO.of(producto)),
                Click.on(A_SELECCIONAR_PRODUCTO.of(producto)),
                Click.on(BOTON_AGREGAR_AL_CARRITO)
                );
        VariablesGlobales.mensaje = BrowseTheWeb.as(actor).getDriver().switchTo().alert().getText();
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(BOTON_CART)
        );
    }

    public static AgregarMonitores alCarrito(String producto) {
        return Tasks.instrumented(AgregarMonitores.class, producto);
    }
}
