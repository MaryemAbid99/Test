package tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.FoundObject;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.Resource;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Participation;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.Feedback;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;
import tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati.Session;

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

public class Events implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeEvent type;

    @Enumerated(EnumType.STRING)
    private TypeEventTheme EventTheme;

    private String title;
    private String description;
    private String location;

    @Enumerated(EnumType.STRING)
    private TypeWeather weather;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    private int maxParticipants;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="events")
    private Set<Session> Sessions;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="events")
    private Set<Feedback> Feedbacks;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="events")
    private Set<Participation> Participations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="events")
    private Set<Resource> Resources;

    @ManyToOne
    Events events;
}
