package tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity

public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private int id;
    private int Amount;
    private LocalDate PaymentDate;
    @Enumerated(EnumType.STRING)
    private TypePaymentMethod PaymentMethod;
    private TypePaymentStatus PaymentStatus;


    @ManyToOne
    Participation participation;
}
