package tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati;

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

public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SessionID;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    @Enumerated(EnumType.STRING)
    private TypeSessionStatus SessionStatus;

    @ManyToOne
    Events events;


    @ManyToMany(mappedBy="sessions", cascade = CascadeType.ALL)
    private Set<Tags> tags;
}
