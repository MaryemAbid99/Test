package tn.esprit.examen.nomPrenomClasseExamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.ResourceReservation;

public interface IResourceReservationRepository extends JpaRepository<ResourceReservation, Long> {
}
