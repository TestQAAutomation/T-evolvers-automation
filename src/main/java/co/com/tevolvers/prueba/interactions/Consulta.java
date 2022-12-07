package co.com.tevolvers.prueba.interactions;

import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.tevolvers.prueba.enums.Recursos.CREATE_BOOKING;

public class Consulta implements Interaction {

    private RequestUsuarioBuilder body;
    private TokenBuilder tokenBuilder;

    public Consulta(RequestUsuarioBuilder body, TokenBuilder tokenBuilder){
        this.body = body;
        this.tokenBuilder = tokenBuilder;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resources(CREATE_BOOKING.getRecurso() + tokenBuilder.getBookingID())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .relaxedHTTPSValidation())
        );
    }
    public static Consulta usuario(RequestUsuarioBuilder body, TokenBuilder tokenBuilder){return new Consulta(body, tokenBuilder);}
}
