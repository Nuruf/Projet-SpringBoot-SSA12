package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootautoloc.models.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
