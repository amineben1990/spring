package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class RdvController {
    @GetMapping
    public List<Rdv> getDoctorAppointments(@PathVariable Long id) {
        Medecin medecin = MedecinRepository.findById(id).orElse(null);
        return medecin != null ? appointmentService.getAppointmentsByDoctor(medecin) : null;
    }

    @PutMapping
    public Rdv updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
        return RdvService.updateAppointment(id, appointment);
    }

    @DeleteMapping("/appointments/{id}")
    public void deleteAppointment(@PathVariable Long id) {
        RdvService.deleteAppointment(id);
    }

    @PostMapping("/appointments/{id}/accept")
    public Appointment acceptAppointment(@PathVariable Long id) {
    }

    Rdv appointment = appointmentService.updateAppointment(id, new Rdv());
        if(Rdv !=null)

    {
        rdv.setStatus(Rdv.RdvStatus.ACCEPTED);
        return RdvService.updateAppointment(id, rdv);
    }
        return null;
}

