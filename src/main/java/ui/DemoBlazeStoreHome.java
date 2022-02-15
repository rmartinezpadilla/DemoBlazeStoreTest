package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/")
public class DemoBlazeStoreHome extends PageObject {

    public static final Target BOTON_REGISTRO_SIGN_UP = Target.the("Boton de registro")
            .locatedBy("//a[contains(@id, 'signin2')]");

    public static final Target INPUT_REGISTRO_USER_NAME = Target.the("input nombre usuario")
            .locatedBy("//input[contains(@id, 'sign-username')]");

    public static final Target INPUT_REGISTRO_PASSWORD = Target.the("input password")
            .locatedBy("//input[contains(@id, 'sign-password')]");

    public static final Target BOTON_REGISTRO_SIGN_UP_CONFIRMAR = Target.the("Boton de registro confirmar")
            .locatedBy("//div//button[contains(text(),'Sign up')]");

    public static final Target BOTON_LOG_IN= Target.the("Boton de registro")
                .locatedBy("//a[contains(@id, 'login2')]");

    public static final Target INPUT_LOGIN_USER_NAME= Target.the("input login nombre usuario")
            .locatedBy("//input[contains(@id, 'loginusername')]");

    public static final Target INPUT_LOGIN_PASSWORD= Target.the("input login password")
            .locatedBy("//input[contains(@id, 'loginpassword')]");

    public static final Target BOTON_SIGN_IN_CONFIRMAR= Target.the("Boton de registro confirmar")
            .locatedBy("//div//button[contains(text(),'Log in')]");

    public static final Target A_BIENVENIDA_USUARIO = Target.the("Bienvenida Usuario")
            .locatedBy("//a[contains(@id, 'nameofuser')]");

    public static final Target  A_SELECCIONAR_PRODUCTO= Target.the("link producto")
                .locatedBy("//a[contains(text(),'{0}')]");

    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito")
            .locatedBy("//div//a[contains(text(),'Add to cart')]");

    public static final Target TITULO_FOOTER = Target.the("Titulo footer")
            .locatedBy("//div[@class='caption']//h4[contains(text(), ' PRODUCT STORE')]");

    public static final Target BOTON_CART = Target.the("Boton de Carrito")
            .locatedBy("//div//a[contains(text(),'Cart')]");

    public static final Target LINK_MONITORES = Target.the("link monitores")
            .locatedBy("//div//a[contains(text(),'Monitors')]");

    public static final Target PRODUCTO_EN_CARRITO = Target.the("Producto en carrito")
            .locatedBy("//table[@class='table table-bordered table-hover table-striped']//td[contains(text(),'{0}')]");

    public static final Target LINK_TELEFONOS = Target.the("link telefonos")
            .locatedBy("//div//a[contains(text(),'Phones')]");





}
