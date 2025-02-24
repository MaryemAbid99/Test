package tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane;

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

public class MonitoringRecruitment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private TypeFollowUpStatus status;

    private int quizId;
    private String quizResultsLink;
    private String alGeneratedReportLink;
    private String calendarLink;
    private String meetingLink;
    private boolean result;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<User> users;
}


