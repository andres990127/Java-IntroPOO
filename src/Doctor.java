import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Atributos
    static int id;
    private String name;
    private String email;
    private String speciality;

    //Constructor
    Doctor(){
        System.out.println("Se ha creado un nuevo Doctor");
        id++;
    }

    // Sobrecarga del constructor
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

    // Objeto que contendrá las citas del doctor
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Método que añadirá una nueva cita al doctor
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    // Getter para obtener las citas de un doctor
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Clase anidada para citas [Debido a que 1 doctor puede tener varias citas]
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
