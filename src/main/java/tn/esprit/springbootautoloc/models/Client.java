package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Table(name="client")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Client {

    @OneToMany(mappedBy = "clients")
    private List<Reservation> reservations;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String numPermis;
    private LocalDate dateInscription;
}
