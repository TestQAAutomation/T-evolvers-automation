package co.com.tevolvers.prueba.models.builder;
import com.fasterxml.jackson.annotation.*;

public class RequestUsuarioBuilder {
    private String firstname;
    private String lastname;
    private int totalprice;
    private String depositpaid;
    private RequestBooking requestBooking;
    private String additionalneeds;



    @JsonProperty("firstname")
    public String getFirstname() { return firstname; }
    @JsonProperty("firstname")
    public void setFirstname(String value) { this.firstname = value; }

    @JsonProperty("lastname")
    public String getLastname() { return lastname; }
    @JsonProperty("lastname")
    public void setLastname(String value) { this.lastname = value; }

    @JsonProperty("totalprice")
    public int getTotalprice() { return totalprice; }
    @JsonProperty("totalprice")
    public void setTotalprice(int value) { this.totalprice = value; }

    @JsonProperty("depositpaid")
    public String getDepositpaid() { return depositpaid; }
    @JsonProperty("depositpaid")
    public void setDepositpaid(String value) { this.depositpaid = value; }

    @JsonProperty("bookingdates")
    public RequestBooking getBookingdates() { return requestBooking; }
    @JsonProperty("bookingdates")
    public void setBookingdates(RequestBooking value) { this.requestBooking = value; }

    @JsonProperty("additionalneeds")
    public String getAdditionalneeds() { return additionalneeds; }
    @JsonProperty("additionalneeds")
    public void setAdditionalneeds(String value) { this.additionalneeds = value; }
}
