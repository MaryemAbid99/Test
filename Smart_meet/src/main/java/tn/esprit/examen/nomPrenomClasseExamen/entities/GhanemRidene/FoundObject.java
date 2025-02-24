package tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

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

public class FoundObject implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int FoundObjectId;
    private String Photo;
    private String Location;
    private String Description;
    private LocalDateTime Date;
    private TypeFoundObjectStatus TypeFoundObjectStatus;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="events")
    private Set<FoundObject> FoundObjects;
}
