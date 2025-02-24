package tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Participation;

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

public class SmartMeeting implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SmartmeetingID;
    private double matchScore;
    private String transcriptionText;
    private String transcriptionStatus;
    private String summary;
    private boolean archived;
    private String searchKeywords;
    private LocalDateTime transcriptionDate;
    private LocalDateTime followUpDate;
    private String actionItems;
    private String keywordsExtracted;
    private String meetingLink;
    private String videoConferenceTool;
    private boolean audioToTextEnabled;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Participation> participations;
}
