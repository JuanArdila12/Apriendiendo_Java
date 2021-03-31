import java.util.Arrays;

public class ejemploArreglosFor {
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
        for (int i = 0; i < total; i++){
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("==========Usando Foreach=============");

        for(String prod: productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("==========Usando while=============");
        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("==========Usando Dowhile=============");
        int j = 0;
        do{
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
        }while (j < total);


        System.out.println("==========Iterando en numeros=============");
        int[] numeros = new int[10];

        int totalNum = numeros.length;
        for(int k = 0; k < totalNum; k++){
            numeros[k] = k*3;
        }

        for(int k = 0; k < totalNum; k++){
            System.out.println("numeros = " + numeros[k]);
        }

    }
}
