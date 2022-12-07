package co.com.tevolvers.prueba.tasks;

import co.com.tevolvers.prueba.interactions.Actualizar;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class Actualiza implements Task {
    @Shared
    RequestUsuarioBuilder requestUsuarioBuilder;
    @Shared
    TokenBuilder tokenBuilder;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Actualizar.informacion(requestUsuarioBuilder, tokenBuilder));
    }
    public static Actualiza suinformacion(){return Tasks.instrumented(Actualiza.class);

    }
}
