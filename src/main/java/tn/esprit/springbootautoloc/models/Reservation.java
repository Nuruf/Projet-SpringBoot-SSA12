package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Table(name="reservation")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Reservation {

    @ManyToOne
    private Vehicule vehicules;

    @OneToOne
    private Contrat contrat;

    @ManyToOne
    private Client clients;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservatio;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
}
