package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name="maintenance")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Maintenance {

    @ManyToOne
    private Vehicule vehicules;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  Long idMaintenance;

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
}
