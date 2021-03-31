import java.lang.reflect.Array;
import java.util.Arrays;

public class arregloString {
    public static void main(String[] args) {
        String[] productos = new String[6];
        productos[0] = "Kingston prendrive";
        productos[1] = "CPU";
        productos[2] = "RAM";
        productos[3] = "PANTALLA";
        productos[4] = "TECLADO";
        productos[5] = "Mouse";

        Arrays.sort(productos);

        System.out.println("productos = " + productos[0]);
        System.out.println("productos = " + productos[1]);
        System.out.println("productos = " + productos[2]);
        System.out.println("productos = " + productos[3]);
        System.out.println("productos = " + productos[4]);
        System.out.println("productos = " + productos[5]);

    }
}
