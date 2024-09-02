package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.aot.generate.Generated;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Patient {
	@Id
	@Generated(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String nom;
	private String pren;



	private List <Rdv>rdv = new ArrayList<>();

	public Patient () {

	}

	public Patient(String nom, String pren) {
	    this.nom = nom;
	    this.prenom = prenom;
	}
