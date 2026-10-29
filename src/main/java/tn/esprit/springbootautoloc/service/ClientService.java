package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Client;

import java.util.List;

public interface ClientService {

    Client saveClient(Client client);

    void deleteClient(Long idClient);
    Client getClientById(Long idClient);

    List<Client> getAllClients();
}
