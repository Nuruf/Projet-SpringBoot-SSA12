package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="equipement")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Equipement {

    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicule;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;
}
