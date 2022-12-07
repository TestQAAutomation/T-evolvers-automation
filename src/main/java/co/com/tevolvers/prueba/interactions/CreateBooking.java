package co.com.tevolvers.prueba.interactions;

import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.tevolvers.prueba.enums.Recursos.BOOKING_ID;
import static co.com.tevolvers.prueba.enums.Recursos.CREATE_BOOKING;

public class CreateBooking implements Interaction {

    private RequestUsuarioBuilder requestUsuarioBuilder;
    private TokenBuilder tokenBuilder;

    public CreateBooking(RequestUsuarioBuilder requestUsuarioBuilder, TokenBuilder tokenBuilder){
        this.requestUsuarioBuilder = requestUsuarioBuilder;
        this.tokenBuilder = tokenBuilder;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(CREATE_BOOKING.getRecurso())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(requestUsuarioBuilder)
                                .relaxedHTTPSValidation())
        );
        tokenBuilder.setBookingID(SerenityRest.lastResponse().jsonPath().getJsonObject(BOOKING_ID.getRecurso()));
    }
    public static CreateBooking booking(RequestUsuarioBuilder requestUsuarioBuilder, TokenBuilder tokenBuilder) {return new CreateBooking(requestUsuarioBuilder, tokenBuilder);
    }
}
