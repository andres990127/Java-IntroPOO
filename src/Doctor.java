public class Doctor {
    //Atributes
    static int id;
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Se ha creado un nuevo Doctor");
        id++;
    }

    //Métodos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Id Doctor: " + id);
    }
}
