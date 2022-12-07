package co.com.tevolvers.prueba.tasks;

import co.com.tevolvers.prueba.interactions.CreateBooking;
import co.com.tevolvers.prueba.models.DataExcel;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import co.com.tevolvers.prueba.utils.Conversion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class Digita implements Task {
    @Shared
    DataExcel dataExcel;
    @Shared
    RequestUsuarioBuilder requestUsuarioBuilder;
    @Shared
    TokenBuilder tokenBuilder;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreateBooking.booking(Conversion.usuarioRequest(requestUsuarioBuilder, dataExcel), tokenBuilder));
    }

    public static Digita usuario(){return Tasks.instrumented(Digita.class);
    }
}
