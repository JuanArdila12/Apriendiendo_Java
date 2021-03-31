import java.util.Arrays;

public class ejemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = new String[6];
        int total = productos.length;

        productos[0] = "Kingston prendrive";
        productos[1] = "CPU";
        productos[2] = "RAM";
        productos[3] = "PANTALLA";
        productos[4] = "TECLADO";
        productos[5] = "Mouse";

        Arrays.sort(productos);
        System.out.println("==========Usando For=============");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("==========Usando For inverso=============");
        for(int i = 0; i < total; i++){
            System.out.println("para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

    }
}
