package co.com.tevolvers.prueba.tasks;

import co.com.tevolvers.prueba.interactions.Credencial;
import co.com.tevolvers.prueba.models.Credenciales;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class Ingreso implements Task {
    @Shared
    Credenciales credenciales;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Credencial.prueba(credenciales));
    }
    public static Ingreso exitoso(){
        return Tasks.instrumented(Ingreso.class);
    }
}
