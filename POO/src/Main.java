import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Patient patient = new Patient("juan", "juan@hotmail.com");
        System.out.println(patient);

        User user = new Doctor("juanito", "alimaña@alimaña.com");
        user.showDataUser();

        User user1 = new User("Juanita", "Juanita@limaña.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz azul");
                System.out.println("Departamento: Pediatria");
            }
        };
        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

    }
}
