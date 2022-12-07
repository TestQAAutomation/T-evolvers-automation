package co.com.tevolvers.prueba.models.builder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TokenBuilder {
    private String token;
    private int bookingID;

    @JsonProperty("token")
    public String getToken() { return token; }
    @JsonProperty("token")
    public void setToken(String value) { this.token = value; }

    @JsonProperty("bookingId")
    public int getBookingID() { return bookingID; }
    @JsonProperty("bookingId")
    public void setBookingID(int value) { this.bookingID = value; }
}
