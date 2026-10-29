package tn.esprit.springbootautoloc.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name="paiement")
@Entity
@Getter
@Setter
@NoArgsConstructor //constructeur non parametré
@AllArgsConstructor // le5er

public class Paiement {

    @ManyToOne
    private Contrat contrat;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPaiement;

    private BigDecimal montant;
    private LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;
}
