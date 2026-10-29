package tn.esprit.springbootautoloc.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springbootautoloc.models.Client;
import tn.esprit.springbootautoloc.service.ClientServiceImp;

import java.util.List;

@Tag(name="Gestion des Clients" , description = "CRUD des Clients")
@RestController
@RequestMapping("/Client")

public class ClientController {

    private final ClientServiceImp clientService;
    public ClientController(ClientServiceImp clientService) {
        this.clientService = clientService;
    }

    @Operation(summary = "AJOUTER CLIENT")
    @PostMapping("/ajouterClient")
    public Client createClient(@RequestBody Client client) {
        return clientService.saveClient( client);
    }

    @Operation(summary = "SUPPRIMER CLIENT")
    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
