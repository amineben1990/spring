package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


	public interface PatientRepository extends JpaRepository<Patient, Long> {
		List<Patient>findID(Long ID);

	}

