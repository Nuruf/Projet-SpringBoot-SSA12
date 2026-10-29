package tn.esprit.springbootautoloc.service;

import tn.esprit.springbootautoloc.models.Employe;

import java.util.List;

public interface EmployeService {

    Employe saveEmploye(Employe employe);

    void deleteEmploye(Long idEmploye);
    Employe getEmployeById(Long idEmploye);

    List<Employe> getAllEmployes();

}
