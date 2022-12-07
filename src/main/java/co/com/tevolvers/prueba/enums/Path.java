package co.com.tevolvers.prueba.enums;

public enum Path {
    FILE("./src/test/resources/co/com/tevolvers/prueba/data/DataFile1.xlsx"),
    SELECT("select * from "),
    NAME("Tevolvers"),
    WHERE(" where ID_Prueba = 1"),
    URL_BASE("https://restful-booker.herokuapp.com"),
    ;

    private String getPath;
    Path(String path) {this.getPath = path;}
    public String getPath() {return getPath;}
}
