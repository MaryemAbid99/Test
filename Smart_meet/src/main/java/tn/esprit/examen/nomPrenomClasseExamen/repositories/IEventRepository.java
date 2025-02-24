package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

public interface IEventRepository extends JpaRepository<Events, Integer> {
}
