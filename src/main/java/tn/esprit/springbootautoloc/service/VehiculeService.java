package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Vehicule;

import java.util.List;

public interface VehiculeService {

    Vehicule saveVehicule(Vehicule vehicule);

    void deleteVehicule(Long idVehicule);
    Vehicule getVehiculeById(Long idVehicule);

    List<Vehicule> getAllVehicule();
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence);

}
