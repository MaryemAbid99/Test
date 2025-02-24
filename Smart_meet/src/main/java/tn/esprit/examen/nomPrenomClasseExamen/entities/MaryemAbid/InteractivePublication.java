package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class InteractivePublication implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IPublicationId;
    private String Title;
    private String Description;
    private TypeIPublicationStatus PublicationStatus;
    private TypeIPublicationVisibility PublicationVisibility;
    private TypeIPublicationModerationStatus PublicationModerationStatus;
    private LocalDateTime PublicationDate;
    private int InteractionCount;
    private LocalDateTime ScheduledPublishTime;
    private double RecommendationScore;

    @ManyToOne
    User user;

}
