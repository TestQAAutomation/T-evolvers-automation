package co.com.tevolvers.prueba.interactions;


import co.com.tevolvers.prueba.models.builder.RequestUsuarioToken;
import co.com.tevolvers.prueba.models.builder.TokenBuilder;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static co.com.tevolvers.prueba.enums.Recursos.*;

public class Token implements Interaction {


    private RequestUsuarioToken requestUsuarioToken;
    private TokenBuilder tokenBuilder;


    public Token(RequestUsuarioToken requestUsuarioToken, TokenBuilder tokenBuilder){this.requestUsuarioToken = requestUsuarioToken; this.tokenBuilder = tokenBuilder;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(AUT.getRecurso())
                        .with(requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(requestUsuarioToken)
                                .relaxedHTTPSValidation())
        );

        tokenBuilder.setToken(SerenityRest.lastResponse().jsonPath().getJsonObject(TOKEN.getRecurso()).toString().trim());
    }
    public static Token deUsuario(RequestUsuarioToken requestUsuarioToken, TokenBuilder tokenBuilder){return new Token(requestUsuarioToken, tokenBuilder);}
}
