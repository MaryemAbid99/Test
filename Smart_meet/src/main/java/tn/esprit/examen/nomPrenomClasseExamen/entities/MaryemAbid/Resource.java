package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Resource implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idResource;
    private String name;
    @Enumerated(EnumType.STRING)
    private TypeResource typeResource;
    @Enumerated(EnumType.STRING)
    private TypeResourceStatus typeResourceStatus;

    @ManyToOne
    ResourceReservation resourcereservation;

    @ManyToOne
    Events events;





}
