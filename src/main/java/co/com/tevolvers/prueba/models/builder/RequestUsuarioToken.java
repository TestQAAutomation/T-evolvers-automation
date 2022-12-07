package co.com.tevolvers.prueba.models.builder;
import com.fasterxml.jackson.annotation.*;

public class RequestUsuarioToken {
    private String username;
    private String password;


    @JsonProperty("username")
    public String getUsername() { return username; }
    @JsonProperty("username")
    public void setUsername(String value) { this.username = value; }

    @JsonProperty("password")
    public String getPassword() { return password; }
    @JsonProperty("password")
    public void setPassword(String value) { this.password = value; }
}