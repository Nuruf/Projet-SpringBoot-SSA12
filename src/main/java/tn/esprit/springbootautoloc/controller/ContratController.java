package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Contrat;
import tn.esprit.springbootautoloc.service.ContratServiceImp;

import java.util.List;

@Tag(name="Gestion des contrats" , description = "CRUD des Contrats")
@RestController
@RequestMapping("/Contrat")

public class ContratController {

    private final ContratServiceImp contratService;
    public ContratController(ContratServiceImp contratService) {
        this.contratService = contratService;
    }

    @Operation(summary = "AJOUT CONTRACT")
    @PostMapping("/ajouterContrat")
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratService.saveContrat(contrat);
    }

    @Operation(summary = "SUPPRIMER CONTRAT")
    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }

    @GetMapping("/getById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @GetMapping
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }
}