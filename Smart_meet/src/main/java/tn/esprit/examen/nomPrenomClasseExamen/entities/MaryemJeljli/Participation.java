package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;
import tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati.SmartMeeting;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

public class Participation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String qrCodeUrl;
    private LocalDateTime registrationDate;
    @Enumerated(EnumType.STRING)
    private TypeParticipationStatus ParticipationStatus;


    @ManyToOne
    Events events;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="participation")
    private Set<Payment> Payments;


    @ManyToMany(mappedBy="participations", cascade = CascadeType.ALL)
    private Set<SmartMeeting> smartmeetings;
}
