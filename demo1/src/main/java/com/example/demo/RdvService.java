package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RdvService {
    @Autowired
    private RdvRepository rdvRepository;

    public Rdv createAppointment(Rdv appointment) {
        return RdvRepository.save(rdv);
    }

    public Rdv updateAppointment(Long id, Rdv appointment) {
        if (RdvRepository.existsById(id)) {
            appointment.setId(id);
            return appointmentRepository.save(appointment);
        }
        return null;
    }
}
public void deleteAppointment(Long id) {
    RdvRepository.deleteById(id);
}

public List<Rdv> getAppointmentsByDoctor(Medecin medecin) {
    return RdvRepository.findByDoctor(medecin);
}

public List<Rdv> getAvailableAppointments(Medecin medecin, LocalDateTime start, LocalDateTime end) {
    return RdvRepository.findByDoctorAndDateTimeBetween(medecin, start, end);
}

public List<Rdv> getAppointmentsByPatient(Patient patient) {
    return RdvRepository.findByPatient(patient);
}
