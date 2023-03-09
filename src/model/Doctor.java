package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // Atributos
    private String speciality;

    // Constructor
    public Doctor(String name, String email) {
        super(name, email);
    }

    // Objeto que contendrá las citas del doctor
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    // Método que añadirá una nueva cita al doctor
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    // Getters y setters de la clase
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Getter para obtener las citas de un doctor
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    // Método obligatorio de implementar debido a herencia de clase abstracta
    @Override
    public void showDateUser() {
        System.out.println("Empleado del hospital: Cruz Roja");
        System.out.println("Departamento: Oncología");
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
