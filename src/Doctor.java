public class Doctor {
    //Atributes
    static int id;
    String name;
    String email;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Se ha creado un nuevo Doctor");
        id++;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    //Métodos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Doctor: " + id);
    }
}
