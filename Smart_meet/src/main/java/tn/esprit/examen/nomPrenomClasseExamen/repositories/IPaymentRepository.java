package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Payment;

public interface IPaymentRepository extends JpaRepository<Payment, Integer> {
}
