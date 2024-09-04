package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Medecin")
public class MedecinController {

    @Autowired
    private MedecinService medecinService;
    @Autowired
    private RdvService rdvService;

    @PostMapping
    public ResponseEntity<Medecin> createMedecin(@RequestBody Medecin medecin) {
        Medecin savedMedecin = medecinService.saveMedecin(medecin);
        return ResponseEntity.ok(savedMedecin);
    }
    @GetMapping ("/{id}")
    public ResponseEntity<Medecin> getMedecin(@PathVariable Long id) {
        Medecin medecin = medecinService.getMedecinById(id);
        if (medecin != null) {
            return ResponseEntity.ok(medecin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteMedecin(@PathVariable Long id) {
        medecinService.deleteMedecin(id);
        return ResponseEntity.noContent().build();
    }
}
