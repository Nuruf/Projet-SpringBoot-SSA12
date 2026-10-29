package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Contrat;
import tn.esprit.springbootautoloc.repository.ContratRepository;

import java.util.List;

@Service
public class ContratServiceImp implements ContartService{

    @Autowired
    private ContratRepository contratRepository;

    @Override
    public Contrat saveContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    public Contrat getContratById(Long idContrat) {
        return contratRepository.findById(idContrat).get();
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
