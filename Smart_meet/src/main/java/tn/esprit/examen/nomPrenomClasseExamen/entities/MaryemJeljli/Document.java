package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class Document {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDate CreatedAI;
    @Enumerated(EnumType.STRING)
    private TypeDocument DocumentType  ;
    private TypeDocumentVisibility DocumentVisibility;
    private TypeAccessLevelDocument DocumentAccessLevel;
    private TypeDocumentTheme DocumentTheme;


    @ManyToOne
    User user;




}
