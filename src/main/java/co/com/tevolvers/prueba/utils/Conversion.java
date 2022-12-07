package co.com.tevolvers.prueba.utils;

import co.com.tevolvers.prueba.models.DataExcel;
import co.com.tevolvers.prueba.models.builder.RequestBooking;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioBuilder;
import co.com.tevolvers.prueba.models.builder.RequestUsuarioToken;

public class Conversion {

    private Conversion(){}

    public static RequestUsuarioBuilder usuarioRequest(RequestUsuarioBuilder data, DataExcel dataExcel){
        RequestBooking requestBooking = new RequestBooking();
        requestBooking.setCheckin(dataExcel.getSetDeDatos().get(0).get("CheckIn"));
        requestBooking.setCheckout(dataExcel.getSetDeDatos().get(0).get("CheckOut"));

        data.setFirstname(dataExcel.getSetDeDatos().get(0).get("FirstName"));
        data.setLastname(dataExcel.getSetDeDatos().get(0).get("LastName"));
        data.setTotalprice(Integer.parseInt(dataExcel.getSetDeDatos().get(0).get("TotalPrice")));
        data.setDepositpaid(dataExcel.getSetDeDatos().get(0).get("DepositPaId"));
        data.setBookingdates(requestBooking);
        data.setAdditionalneeds(dataExcel.getSetDeDatos().get(0).get("AdditionalNeeds"));
        return data;
    }

    public static RequestUsuarioToken usuarioToken(RequestUsuarioToken datos, DataExcel dataExcel){
        datos.setUsername(dataExcel.getSetDeDatos().get(0).get("username"));
        datos.setPassword(dataExcel.getSetDeDatos().get(0).get("password"));

        return datos;
    }

}
