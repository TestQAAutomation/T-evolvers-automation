package co.com.tevolvers.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class Put extends RestInteraction {

    private String recurso;
    public Put(String recurso){this.recurso = recurso;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().put(as(actor).resolve(this.recurso)).then().log().all();
    }
    public static Put resources(String recurso){
        return new Put(recurso);
    }
}
