package tn.esprit.springbootautoloc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springbootautoloc.models.Employe;
import tn.esprit.springbootautoloc.repository.EmployeRepository;

import java.util.List;

@Service
public class EmployeServiceImp implements EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }

    @Override
    public Employe getEmployeById(Long idEmploye) {
        return employeRepository.getOne(idEmploye);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }
}
