import java.util.Scanner;

public class login {
    public static void main(String[] args) {

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "Juan";
        passwords[0] = "12345";

        usernames[1]= "Pablo";
        passwords[1] = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");;
        String user = scanner.next();

        System.out.println("Ingrese la contraseña");
        String pass = scanner.next();

        boolean isAuth = false;

        for(int i = 0; i < usernames.length; i++){
            if( usernames[i].equals(user) && passwords[i].equals(pass) ){
                isAuth = true;
                break;
            }
        }

        if( isAuth ){
            System.out.println("Bienvenido ".concat(user).concat("!"));
        }else {
            System.out.println("Lo siento, requieres una autenticacion");
            System.out.println("Usuario o contraseña incorrectos!");
        }

    }
}
