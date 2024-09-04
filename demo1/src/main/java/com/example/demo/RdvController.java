package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rdv")
public class RdvController {

    @Autowired
    private MedecinRepository medecinRepository;

    @Autowired
    private RdvService rdvService;



    @GetMapping("/{id}")
    public ResponseEntity<List<Rdv>> getDoctorAppointments(@PathVariable Long id) {
        Medecin medecin = medecinRepository.findById(id).orElse(null);
        if (medecin != null) {
            List<Rdv> appointments = RdvService.getAppointmentsByDoctor(medecin);
            return ResponseEntity.ok(appointments);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateAppointment(@PathVariable Long id, @RequestBody Rdv rdv) {
        Rdv updatedAppointment = rdvService.updateAppointment(id, rdv);
        if (updatedAppointment != null) {
            return ResponseEntity.ok(updatedAppointment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/appointments/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
        boolean isDeleted = rdvService.deleteAppointment(id);
        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/appointments/{id}/accept")
    public ResponseEntity<Object> acceptAppointment(@PathVariable Long id) {
        Rdv appointment = appointmentService.updateAppointment(id, new Rdv());
        if (appointment != null) {
            appointment.setStatus(Rdv.RdvStatus.ACCEPTED);
            Rdv updatedAppointment = rdvService.updateAppointment(id, appointment);
            return ResponseEntity.ok(updatedAppointment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}