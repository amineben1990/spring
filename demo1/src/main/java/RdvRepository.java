import com.example.demo.Rdv;
import java.time.LocalDateTime;
import java.util.List;
public interface RdvRepository {


    public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
        List<Rdv> findByDoctorAndDateTimeBetween(Medecin medecin, LocalDateTime start, LocalDateTime end);
        List<Rdv> findByDoctor(Medecin medecin);
        List<Rdv> findByPatient(Patient patient);
    }
}
