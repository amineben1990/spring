package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


	@Service
	public class PatientService {
	    @Autowired
	    private PatientRepository patientRepository;

	    public List<Patient> getAllPatients() {
	        return patientRepository.findAll();
	    }

	    public List<Patient> getPatientById(Long id) {
	        return patientRepository.findbyID(id);
	    }
	    public Patient savePatient(Patient patient) {
	        return patientRepository.save(patient);
	    }


	    public void deletePatient(Long id) {
	        patientRepository.deleteById(id);
	    }
	
	}
}
