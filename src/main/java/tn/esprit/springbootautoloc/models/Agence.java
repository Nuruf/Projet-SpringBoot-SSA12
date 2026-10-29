package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="agence")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Agence {

    @OneToMany(mappedBy = "agences" , cascade = CascadeType.ALL ,fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Vehicule> vehicules;

    @OneToMany(mappedBy = "agences")
    private List<Employe> employees;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
}
