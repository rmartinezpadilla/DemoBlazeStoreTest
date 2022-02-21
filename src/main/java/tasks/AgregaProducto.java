package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import variablesglobales.VariablesGlobales;

import static ui.DemoBlazeStoreHome.*;

public class AgregaProducto implements Task {
    private String producto;
    private String categoria;

    public AgregaProducto(String producto, String categoria) {
        super();
        this.producto = producto;
        this.categoria = categoria;
    }




    public static AgregaProducto aLaCompra(String producto, String categoria) {
        return Tasks.instrumented(AgregaProducto.class, producto, categoria);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CATEGORIA.of(categoria)),
                Click.on(CATEGORIA.of(categoria)),
                Scroll.to(A_SELECCIONAR_PRODUCTO.of(producto)),
                Click.on(A_SELECCIONAR_PRODUCTO.of(producto)),
                Click.on(BOTON_AGREGAR_AL_CARRITO)
        );

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(BOTON_CART)
        );

        VariablesGlobales.total = PRECIO.toString();
        System.out.println(VariablesGlobales.total);



    }
}
