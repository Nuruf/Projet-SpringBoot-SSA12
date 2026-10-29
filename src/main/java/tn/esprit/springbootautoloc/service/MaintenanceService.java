package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Maintenance;

import java.util.List;

public interface MaintenanceService {

    Maintenance saveMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long idMaintenance);
    Maintenance getMaintenanceById(Long idMaintenance);

    List<Maintenance> getAllMaintenances();
}
