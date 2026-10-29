package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Contrat;

import java.util.List;

public interface ContartService {

    Contrat saveContrat(Contrat contrat);

    void deleteContrat(Long idContrat);
    Contrat getContratById(Long idContrat);

    List<Contrat> getAllContrats();

}
