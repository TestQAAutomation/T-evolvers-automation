package co.com.tevolvers.prueba.models.builder;
import com.fasterxml.jackson.annotation.*;

public class RequestBooking {
    private String checkin;
    private String checkout;


    @JsonProperty("checkin")
    public String getCheckin() { return checkin; }
    @JsonProperty("checkin")
    public void setCheckin(String value) { this.checkin = value; }

    @JsonProperty("checkout")
    public String getCheckout() { return checkout; }
    @JsonProperty("checkout")
    public void setCheckout(String value) { this.checkout = value; }




}
