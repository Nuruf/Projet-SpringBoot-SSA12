package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Paiement;

import java.util.List;

public interface PaiementService {

    Paiement savePaiement(Paiement paiement);

    void deletePaiment(Long idPaiement);
    Paiement getPaiementById(Long idPaiement);

    List<Paiement> getAllPaiements();
}
