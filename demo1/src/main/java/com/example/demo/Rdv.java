package com.example.demo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
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

public class Rdv {
	 @Id
	 @Generated(strategy = GenerationType.IDENTITY)
	    private Long ID;
	    private Patient patient1;
	    private Medecin medecin1;
	    private LocalDate date ;
	   
	    public Rdv () {

		}
		public Rdv(Patient patient1, Medecin medecin1, LocalDate dateTime, LocalDate date) {
	        this.patient1 = patient1;
	        this.medecin1 = medecin1;
	        this.date = date;
	    }


		public Patient getPatient1() {
			return patient1;
		}

		public void setPatient1(Patient patient1) {
			this.patient1 = patient1;
		}

		public Medecin getMedecin1() {
			return medecin1;
		}

		public void setMedecin1(Medecin medecin1) {
			this.medecin1 = medecin1;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}
}

