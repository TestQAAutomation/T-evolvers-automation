package co.com.tevolvers.prueba.interactions;

import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.tevolvers.prueba.enums.Recursos.*;

public class Actualizar implements Interaction {

    private RequestUsuarioBuilder body;
    private TokenBuilder tokenBuilder;

    public Actualizar(RequestUsuarioBuilder body,TokenBuilder tokenBuilder){
        this.body = body;
        this.tokenBuilder = tokenBuilder;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.resources(CREATE_BOOKING.getRecurso() + tokenBuilder.getBookingID())
                        .with(requestSpecification -> requestSpecification
                                .header("Content-Type",ContentType.JSON)
                                .header("Cookie",AUTORIZACION.getRecurso()+tokenBuilder.getToken())
                                //.cookie(AUTORIZACION.getRecurso()+tokenBuilder.getToken())
                                .body(body)
                                .relaxedHTTPSValidation())
        );

       SerenityRest.lastResponse().jsonPath();
    }
    public static Actualizar informacion(RequestUsuarioBuilder body,TokenBuilder tokenBuilder){return new Actualizar(body,tokenBuilder);}
}
