package co.com.tevolvers.prueba.stepdefinitions;

import co.com.tevolvers.prueba.exceptions.HTTPNoEsperado;
import co.com.tevolvers.prueba.models.DataExcel;
import co.com.tevolvers.prueba.questions.CodigoRespuesta;
import co.com.tevolvers.prueba.tasks.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.tevolvers.prueba.enums.Path.URL_BASE;
import static co.com.tevolvers.prueba.enums.StatusResponse.EXITOSO;
import static co.com.tevolvers.prueba.exceptions.HTTPNoEsperado.HTTP_NO_ESPERADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class EbookStep {


    @Given("El usuario ingresa los parametros")
    public void elUsuarioIngresaLosParametros() {
        theActorInTheSpotlight().attemptsTo(Ingreso.exitoso());
        theActorInTheSpotlight().attemptsTo(SetData.user());
    }

    @When("digita los datos del request")
    public void digitaLosDatosDelRequest() {
        theActorInTheSpotlight().attemptsTo(Digita.usuario());
    }

    @Then("realiza la creacion exitosa del libro")
    public void realizaLaCreacionExitosaDelLibro() {
        theActorInTheSpotlight().should(seeThat(CodigoRespuesta.estadoCodigo(), equalTo(Integer.parseInt(EXITOSO.getStatus())))
                .orComplainWith(HTTPNoEsperado.class, HTTP_NO_ESPERADO));
    }

    @Given("El usuario ingresa a la url")
    public void elUsuarioIngresaALaUrl() {
        theActorCalled("usuario").whoCan(CallAnApi.at(URL_BASE.getPath()));
    }

    @When("El usuario consulta la informacion")
    public void elUsuarioConsultaLaInformacion() {
        theActorInTheSpotlight().attemptsTo(SetData.user());
        theActorInTheSpotlight().attemptsTo(Digita.usuario());
        theActorInTheSpotlight().attemptsTo(Obtiene.informacion());

    }

    @Then("la consulta se hace exitosa")
    public void laConsultaSeHaceExitosa() {
        theActorInTheSpotlight().should(seeThat(CodigoRespuesta.estadoCodigo(), equalTo(Integer.parseInt(EXITOSO.getStatus())))
                .orComplainWith(HTTPNoEsperado.class, HTTP_NO_ESPERADO));
    }


    @Given("El usuario consulta la url")
    public void elUsuarioConsultaLaUrl() {
        theActorCalled("usuario").whoCan(CallAnApi.at(URL_BASE.getPath()));
    }

    @When("El usuario actualiza su informacion")
    public void elUsuarioActualizaSuInformacion() {
        theActorInTheSpotlight().attemptsTo(Ingreso.exitoso());
        theActorInTheSpotlight().attemptsTo(SetData.user());
        theActorInTheSpotlight().attemptsTo(Digita.usuario());
        theActorInTheSpotlight().attemptsTo(Obtiene.informacion());
        theActorInTheSpotlight().attemptsTo(Genera.token());
        theActorInTheSpotlight().attemptsTo(Actualiza.suinformacion());
    }

    @Then("el servicio responde con el codigo http esperado")
    public void elServicioRespondeConElCodigoHttpEsperado() {
        theActorInTheSpotlight().should(seeThat(CodigoRespuesta.estadoCodigo(), equalTo(Integer.parseInt(EXITOSO.getStatus())))
                .orComplainWith(HTTPNoEsperado.class, HTTP_NO_ESPERADO));
    }
}
