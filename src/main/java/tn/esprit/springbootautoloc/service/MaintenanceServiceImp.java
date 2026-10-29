package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Maintenance;
import tn.esprit.springbootautoloc.repository.MaintenanceRepository;

import java.util.List;

@Service
public class MaintenanceServiceImp implements MaintenanceService{

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance saveMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }

    @Override
    public Maintenance getMaintenanceById(Long idMaintenance) {
        return  maintenanceRepository.findById(idMaintenance).get();
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
