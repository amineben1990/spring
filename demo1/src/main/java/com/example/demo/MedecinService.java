package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedecinService {
	    @Autowired	    private MedecinRepository medecinRepository;
	    private MedecinService medecinservice;

	public MedecinService() {
	}

	    public List<Medecin> getAllMedecin() {
	        return medecinRepository.findAll();
	    }


	    

}
	


