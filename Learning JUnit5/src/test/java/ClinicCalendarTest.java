import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarTest {
    @Test
    public void allowEntryOfAnAppointment(){
        ClinicCalendar calendar = new ClinicCalendar();
        calendar.addAppointment("Mykola",
                "Maksymov", "avery",
                "9/1/2023 2:00 pm");
        List<PatientAppointment> appointments = calendar.getAppointments();
        assertNotNull(appointments);
        assertEquals(1,appointments.size());
        PatientAppointment enteredAppointment = appointments.get(0);
        assertEquals("Mykola", enteredAppointment.getPatientFirstName());
        assertEquals("Maksymov", enteredAppointment.getPatientLastName());
        assertEquals(Doctor.avery, enteredAppointment.getDoctor());
        assertEquals("9/1/2023 2:00 pm",
                enteredAppointment.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a")));
    }

}