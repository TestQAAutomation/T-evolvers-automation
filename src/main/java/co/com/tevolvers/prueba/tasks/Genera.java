package co.com.tevolvers.prueba.tasks;

import co.com.tevolvers.prueba.interactions.Token;
import co.com.tevolvers.prueba.models.DataExcel;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioToken;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import co.com.tevolvers.prueba.utils.Conversion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class Genera implements Task {
    @Shared
    DataExcel dataExcel;
    @Shared
    RequestUsuarioToken requestUsuarioToken;
    @Shared
    TokenBuilder tokenBuilder;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Token.deUsuario(Conversion.usuarioToken(requestUsuarioToken,dataExcel), tokenBuilder));

    }
    public static Genera token(){return Tasks.instrumented(Genera.class);}
}

