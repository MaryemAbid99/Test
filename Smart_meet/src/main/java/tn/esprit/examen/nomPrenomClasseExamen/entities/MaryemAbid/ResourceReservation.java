package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class ResourceReservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ReservationId;
    private LocalDate StartTime;
    private LocalDate EndTime;
    private LocalDateTime CreatedAt;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="resourcereservation")
    private Set<Resource> Resources;
}
