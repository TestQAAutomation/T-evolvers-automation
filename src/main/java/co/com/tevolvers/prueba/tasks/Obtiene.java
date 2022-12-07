package co.com.tevolvers.prueba.tasks;

import co.com.tevolvers.prueba.interactions.Consulta;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;


public class Obtiene implements Task {
    @Shared
    RequestUsuarioBuilder requestUsuarioBuilder;
    @Shared
    TokenBuilder tokenBuilder;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Consulta.usuario(requestUsuarioBuilder,tokenBuilder ));
    }
    public static Obtiene informacion(){return Tasks.instrumented(Obtiene.class);
    }
}
