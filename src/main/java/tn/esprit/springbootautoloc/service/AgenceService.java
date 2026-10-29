package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Agence;

import java.util.List;

public interface AgenceService {

    Agence saveAgence(Agence agence);

    void deleteAgence(Long idAgence);
    Agence getAgenceById(Long idAgence);

    List<Agence> getAllAgences();
}
