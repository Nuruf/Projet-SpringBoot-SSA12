package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Paiement;
import tn.esprit.springbootautoloc.repository.PaiementRepository;

import java.util.List;

@Service
public class PaiementServiceImp implements PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    @Override
    public Paiement savePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiment(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);
    }

    @Override
    public Paiement getPaiementById(Long idPaiement) {
        return paiementRepository.findById(idPaiement).get();
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }
}
