package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Maintenance;
import tn.esprit.springbootautoloc.service.MaintenanceService;
import tn.esprit.springbootautoloc.service.MaintenanceServiceImp;

import java.util.List;

@Tag(name="Gestion des Maintenances", description = "CRUD des Maintenances")
@RestController
@RequestMapping("/Maintenance")

public class MaintenanceController {

    private final MaintenanceServiceImp maintenanceService;
    public MaintenanceController(MaintenanceServiceImp maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    @Operation(summary = "AJOUTER MAINTENANCE")
    @PostMapping("/ajouterMaintenance")
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.saveMaintenance(maintenance);
    }

    @Operation(summary = "SUPPRIMER MAINTENANCE")
    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id){
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/getById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id){
        return maintenanceService.getMaintenanceById(id);
    }

    @GetMapping
    public List<Maintenance> getAllMaintenances(){
        return maintenanceService.getAllMaintenances();
    }
}