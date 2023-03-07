import java.util.Date;

import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor();
        myDoctor.addAvailableAppointment(new Date(), "4pm" );
        myDoctor.addAvailableAppointment(new Date(), "10am" );
        myDoctor.addAvailableAppointment(new Date(), "3pm" );

        for(Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
    }
}