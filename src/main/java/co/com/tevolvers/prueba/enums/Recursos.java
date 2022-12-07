package co.com.tevolvers.prueba.enums;

public enum Recursos {

    CONTENT_TYPE_VALUE("Content-Type"),
    CREATE_BOOKING("/booking/"),
    AUT("/auth"),
    BOOKING_ID("bookingid"),
    TOKEN("token"),
    AUTORIZACION("token=")
    ;

    private String recurso;
    Recursos(String recurso){ this.recurso = recurso;}
    public String getRecurso(){ return recurso;}
}