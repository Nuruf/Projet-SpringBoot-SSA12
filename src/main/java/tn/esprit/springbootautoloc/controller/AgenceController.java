package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Agence;
import tn.esprit.springbootautoloc.service.AgenceServiceImp;

import java.util.List;

@Tag(name="Gestion des Agences" , description="CRUD des Agences")
@RestController
@RequestMapping("/Agence")

public class AgenceController {

    private final AgenceServiceImp agenceService;
    public AgenceController(AgenceServiceImp agenceService) {
        this.agenceService = agenceService;
    }

    @Operation(summary = "AJOUT AGENCE")
    @PostMapping("/ajouterAgence")
    public Agence createAgence(@RequestBody Agence agence) {
        return agenceService.saveAgence(agence);
    }

    @Operation(summary = "SUPPRIMER AGENCE")
    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

}