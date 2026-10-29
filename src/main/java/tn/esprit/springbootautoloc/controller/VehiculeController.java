package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Vehicule;
import tn.esprit.springbootautoloc.service.VehiculeServiceImp;

import java.util.List;

@Tag(name="Gestion des Vehicules", description = "CRUD des Vehicules")
@RestController
@RequestMapping("/Vehicule")
// @AllArgsConstructor we use this instead of manually writing line 14 & 15

public class VehiculeController {

    private final VehiculeServiceImp vehiculeService;
    public VehiculeController(VehiculeServiceImp vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @Operation(summary = "AJOUTER VEHICULE")
    @PostMapping("/ajouterVehicule")
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @Operation(summary = "SUPPRIMER VEHICULE")
    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicule(id);
    }


    @GetMapping("/getById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id) {
        return vehiculeService.getVehiculeById(id);
    }

    @GetMapping
    public List<Vehicule> getAllVehicule() {
        return vehiculeService.getAllVehicule();
    }

    @PutMapping("/affecterVehicule/{idVehicule}/{idAgence}")
    public void affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        vehiculeService.affecterVehiculeAAgence(idVehicule, idAgence);
    }
}
