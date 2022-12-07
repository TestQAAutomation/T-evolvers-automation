package co.com.tevolvers.prueba.interactions;

import co.com.tevolvers.prueba.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.tevolvers.prueba.enums.Recursos.*;

public class Credencial implements Interaction {
    private Credenciales credenciales;
    public Credencial(Credenciales credenciales){this.credenciales = credenciales;}
    @Override
    public <T extends Actor> void performAs(T actor) {
        credenciales.setContentType(CONTENT_TYPE_VALUE.getRecurso());
    }

    public static Credencial prueba(Credenciales credenciales){return new Credencial(credenciales);}
}
