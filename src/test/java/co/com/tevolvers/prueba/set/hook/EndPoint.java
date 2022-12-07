package co.com.tevolvers.prueba.set.hook;


import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class EndPoint {
    @Before
    public void inicializacion(){
       setTheStage(new OnlineCast());
       theActorCalled("usuario").whoCan(CallAnApi.at("https://restful-booker.herokuapp.com"));
    }

    @After
    public void finalizar(){drawTheCurtain();}
}
