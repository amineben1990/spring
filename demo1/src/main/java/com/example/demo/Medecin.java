package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Medecin {

    @Id
    private Long id;

    private String nom;

public Medecin() {
}

    @OneToMany(mappedBy = "medecin")
    private List<Rdv> rdv = new ArrayList<>();

}