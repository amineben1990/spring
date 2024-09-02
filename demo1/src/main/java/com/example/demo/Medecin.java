package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Medecin {

	@Id
private Long ID;

private String Nom;

private List<Rdv> rdv = new ArrayList<>();

	public Medecin() {
	}

	public Medecin(String Nom, Long ID) {
    this.Nom = Nom;
    this.ID = ID;
}

public String getNom() {
    return nom;
}

public int getID() {
    return id;
}

public void setMedecin(List<Rdv> medecin) {
	
	this.rdv = medecin;

}

public List<Rdv> getRendezvous() {
	return rdv;
}

public void setRendezvous(List<Rdv> rdv) {
	this.rdv = rdv;
}

public void setNom(String nom) {
	this.Nom = nom;
}

public void setID(Long id) {
	this.ID = id;
}
}

