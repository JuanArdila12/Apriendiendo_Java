public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id doctor: " + id);
    }
}