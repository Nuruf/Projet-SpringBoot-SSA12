package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Paiement;
import tn.esprit.springbootautoloc.service.PaiementServiceImp;

import java.util.List;

@Tag(name="Gestion Paiement" , description = "CRUD Paiement")
@RestController
@RequestMapping("/Paiement")

public class PaiementController {

    private final PaiementServiceImp paiementService;
    public PaiementController(PaiementServiceImp paiementService) {
        this .paiementService = paiementService;
    }

    @Operation(summary = "AJOUT PAIEMENT")
    @PostMapping("/ajouterPaiement")
    public Paiement createPaiement(@RequestBody Paiement paiement){
        return paiementService.savePaiement(paiement);
    }

    @Operation(summary = "SUPPRIMER PAIEMENT")
    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id){
        paiementService.deletePaiment(id);
    }

    @GetMapping("/getById/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return paiementService.getPaiementById(id);
    }

    @GetMapping
    public List<Paiement> getAllPaiements(){
        return paiementService.getAllPaiements();
    }


}
