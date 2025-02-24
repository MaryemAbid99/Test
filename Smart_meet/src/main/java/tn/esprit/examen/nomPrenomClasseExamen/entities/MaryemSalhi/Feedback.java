package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class Feedback implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idFeedback;
    String content;
    LocalDateTime dateOfSubmission;
    double  assessment;
    String suggestion;
    @Enumerated(EnumType.STRING)
    TypeFeeling Feeling;

    @ManyToOne
    Events events;
}
