package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Client;
import tn.esprit.springbootautoloc.repository.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public Client getClientById(Long idClient) {
        return clientRepository.findById(idClient).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
