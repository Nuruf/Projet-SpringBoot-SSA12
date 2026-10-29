package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Equipement;
import tn.esprit.springbootautoloc.repository.EquipementRepository;

import java.util.List;

@Service
public class EquipementServiceImp  implements EquipementService {

    @Autowired
    private EquipementRepository equipementRepository;

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return  equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }

    @Override
    public Equipement getEquipementById(Long idEquipement) {
        return  equipementRepository.getOne(idEquipement);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
