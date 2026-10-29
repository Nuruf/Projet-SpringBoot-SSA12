package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Agence;
import tn.esprit.springbootautoloc.models.Vehicule;
import tn.esprit.springbootautoloc.repository.AgenceRepository;
import tn.esprit.springbootautoloc.repository.VehiculeRepository;

import java.util.List;

@Service
public class VehiculeServiceImp implements VehiculeService {

    @Autowired
    private VehiculeRepository vehiculeRepository; //injection de dépendence

    @Autowired
    private AgenceRepository agenceRepository; //injection de dépendence

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).get();
    }

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehiculeRepository.findAll();
    }

    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule= vehiculeRepository.findById(idVehicule).get();
        Agence agence= agenceRepository.findById(idAgence).get();

        vehicule.setAgences(agence);
        vehiculeRepository.save(vehicule);
    }
}
