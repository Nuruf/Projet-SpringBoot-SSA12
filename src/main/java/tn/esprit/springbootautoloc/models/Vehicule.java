package tn.esprit.springbootautoloc.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.tools.javac.Main;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Table(name="vehiculla")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Vehicule {

    @ManyToOne
    @JsonIgnore
    private Agence agences;

    @ManyToMany
    private List<Equipement> equipements;

    @OneToMany(mappedBy = "vehicules")
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "vehicules")
    private List<Maintenance> maintenances;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idVehicule;

    @Column(name="imatricula", nullable=false)
    private  String immatriculation;
    private  String marque;
    private  String modele;

    @Enumerated(EnumType.STRING)
    private  CategorieVehicule categorie;
    private Long tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

}
