package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Equipement;
import tn.esprit.springbootautoloc.service.EquipementService;
import tn.esprit.springbootautoloc.service.EquipementServiceImp;

import java.util.List;

@Tag(name="Gestion des equipements" , description = "CRUD des Equipements")
@RestController
@RequestMapping("/Equipement")

public class EquipementController {

    private final EquipementServiceImp equipementService;
    public EquipementController(EquipementServiceImp equipementService){
        this.equipementService = equipementService;
    }

    @Operation(summary = "AJOUT EQUIPEMENT")
    @PostMapping("/ajouterEquipement")
    public Equipement createEquipement(@RequestBody Equipement equipement){
        return equipementService.saveEquipement(equipement);
    }

    @Operation(summary = "SUPPRIMER EQUIPEMENT")
    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id){
        equipementService.deleteEquipement(id);
    }

    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable Long id){
        return equipementService.getEquipementById(id);
    }

    @GetMapping
    public List<Equipement> getAllEquipements(){
        return equipementService.getAllEquipements();
    }

}
