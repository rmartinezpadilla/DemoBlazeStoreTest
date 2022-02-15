package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import variablesglobales.VariablesGlobales;

import static ui.DemoBlazeStoreHome.*;

public class AgregarTelefonos implements Task {

    private String producto;

    public AgregarTelefonos(String producto) {
        super();
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_TELEFONOS),
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

    public static AgregarTelefonos alCarrito(String producto) {
        return Tasks.instrumented(AgregarTelefonos.class, producto);
    }
}
