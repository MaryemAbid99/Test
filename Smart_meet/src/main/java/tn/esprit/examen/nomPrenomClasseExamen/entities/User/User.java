package tn.esprit.examen.nomPrenomClasseExamen.entities.User;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.Sponsorship;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.InteractivePublication;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Document;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.MentalHealth;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.MonitoringRecruitment;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long UserID;
    private String Name;
    private String Email;
    private String Password;
    private String PhoneNumber;
    private String Address;
    @Enumerated(EnumType.STRING)
    private TypeUserRole UserRole;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set<InteractivePublication> InteractivePublications;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set<MentalHealth> MentalHealths;

    @ManyToMany(mappedBy="users", cascade = CascadeType.ALL)
    private Set<Events> events;

    @ManyToMany(mappedBy="users", cascade = CascadeType.ALL)
    private Set<MonitoringRecruitment> monitoringrecruitments;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set<Sponsorship > Sponsorships;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set<Document> Documents;


}
