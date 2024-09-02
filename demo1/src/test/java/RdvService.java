import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class RdvService {


        @Autowired
        private RdvRepository rdvRepository;

        public Rdv createRdv(Rdv rdv) {
            return RdvRepository.save(rdv);
        }

        public Rdv updateRdv(Long id, Rdv rdv) {
            if (RdvRepository.existsById(id)) {
                Rdv.setId(id);
                return RdvRepository.save(rdv);
            }
            return null;
}
    public void deleteRdv(Long id) {
        RdvRepository.deleteById(id);
    }

    public List<Rdv> getAppointmentsByDoctor(Medecin medecin) {
        return RdvRepository.findByDoctor(Medecin);
    }
    public List<Rdv> getAvailableAppointments(Medecin medecin, LocalDateTime start, LocalDateTime end) {
        return RdvRepository.findByDoctorAndDateTimeBetween(Medecin, start, end);
    }

    public List<Rdv> getAppointmentsByPatient(Patient patient) {
        return RdvRepository.findByPatient(patient);
    }
}