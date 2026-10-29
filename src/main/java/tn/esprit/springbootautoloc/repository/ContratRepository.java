package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootautoloc.models.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
