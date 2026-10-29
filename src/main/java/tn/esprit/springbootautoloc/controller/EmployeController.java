package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Employe;
import tn.esprit.springbootautoloc.service.EmployeServiceImp;

import java.util.List;

@Tag(name="Gestion des employes", description = "CRUD EMPLOYE")
@RestController
@RequestMapping("/Employe")

public class EmployeController {

    private final EmployeServiceImp employeService;
    public EmployeController(EmployeServiceImp employeService) {
        this.employeService = employeService;
    }

    @Operation(summary = "AJOUTER EMPLOYE")
    @PostMapping("/ajouterEmploye")
    public Employe createEmploye(@RequestBody Employe employe){
        return employeService.saveEmploye(employe);
    }

    @Operation(summary = "SUPPRIMER EMPLOYE")
    @DeleteMapping("/deleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id){
        employeService.deleteEmploye(id);
    }

    @GetMapping("/getById/{id}")
    public Employe getEmployeById(@PathVariable Long id){
        return employeService.getEmployeById(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes(){
        return employeService.getAllEmployes();
    }
}

