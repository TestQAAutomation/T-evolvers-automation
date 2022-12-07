package co.com.tevolvers.prueba.exceptions;

public class HTTPNoEsperado extends AssertionError{
    public static final String HTTP_NO_ESPERADO = "El codigo http no es el esperado";
    public HTTPNoEsperado(String message, Throwable cause) {super(message, cause);}
}
