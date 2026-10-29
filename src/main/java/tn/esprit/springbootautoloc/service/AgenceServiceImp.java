package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Agence;
import tn.esprit.springbootautoloc.models.Vehicule;
import tn.esprit.springbootautoloc.repository.AgenceRepository;
import tn.esprit.springbootautoloc.repository.VehiculeRepository;

import java.util.List;

@Service
public class AgenceServiceImp implements AgenceService {

    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public Agence saveAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }

    @Override
    public Agence getAgenceById(Long idAgence) {
        return agenceRepository.findById(idAgence).get();
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

}
