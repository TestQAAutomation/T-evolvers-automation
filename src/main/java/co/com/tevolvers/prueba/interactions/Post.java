package co.com.tevolvers.prueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

public class Post extends RestInteraction {

    private String recurso;

    public Post(String recurso) {this.recurso = recurso;}

    @Override
    public <T extends Actor> void performAs(T actor){
        rest().log().all().post(as(actor).resolve(this.recurso)).then().log().all();
    }

    public static Post to(String recurso) {return new Post(recurso);}
}
