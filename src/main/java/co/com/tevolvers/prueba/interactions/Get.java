package co.com.tevolvers.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class Get extends RestInteraction {

    private String recurso;
    public Get(String recurso){this.recurso = recurso;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().get(as(actor).resolve(this.recurso)).then().log().all();
    }
    public static Get resources(String recurso){
        return new Get(recurso);
    }
}
