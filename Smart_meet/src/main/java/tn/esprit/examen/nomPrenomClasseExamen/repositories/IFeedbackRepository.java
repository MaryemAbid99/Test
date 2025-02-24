package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.Feedback;

public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {
}
