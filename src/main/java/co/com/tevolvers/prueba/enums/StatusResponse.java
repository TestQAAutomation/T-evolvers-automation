package co.com.tevolvers.prueba.enums;

public enum StatusResponse {

    EXITOSO("200");

    private String status;
    StatusResponse(String status) {this.status = status;}
    public String getStatus() {return status;}
}
