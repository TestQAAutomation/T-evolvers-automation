package co.com.tevolvers.prueba.exceptions;

public class AmbienteNoEncontrado extends AssertionError{

    public static final String AMBIENTE_NO_ENCONTRADO = "El ambiente no fue encontrado";
    public AmbienteNoEncontrado(){
        super(AMBIENTE_NO_ENCONTRADO);
    }
}
