package tn.esprit.springbootautoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springbootautoloc.models.Paiement;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
