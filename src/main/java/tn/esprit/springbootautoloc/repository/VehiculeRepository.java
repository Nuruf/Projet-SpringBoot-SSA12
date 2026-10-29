package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootautoloc.models.Vehicule;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
}
