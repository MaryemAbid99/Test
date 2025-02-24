package tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class Tags implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TagID;
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Session> sessions;
}
