package co.com.tevolvers.prueba.utils;

import java.util.List;
import java.util.Map;

import static co.com.tevolvers.prueba.enums.Path.*;

public class SetDataTest {

    public SetDataTest() {}

    public static List<Map<String, String>> dePrueba() {
        List<Map<String, String>> datos;
        String ruta = FILE.getPath();
        datos = GetData.deExcel(ruta, SELECT.getPath() + NAME.getPath() + WHERE.getPath());
        return datos;
    }
}
