package tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class Sponsorship implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int SponsorshipId;
    private TypeSponsorship typeSponsorship;
    private float SponsorshipAmount;
    private TypeSponsorshipMaterial typeSponsorshipMaterial;
    private LocalDateTime SponsorshipDate;


    @ManyToOne
    User user;
}
