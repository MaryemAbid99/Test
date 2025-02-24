package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.Resource;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.ResourceReservation;

import java.util.List;
import java.util.Optional;

public interface IResourceReservationServices {
    ResourceReservation createResourceReservation (ResourceReservation resourceReservation);
    Optional<ResourceReservation> getResourceReservationByID(int id);
    List<ResourceReservation> getAllResourceReservations();
    void deleteResourceReservation(int id);
    void updateResourceReservation(int id , ResourceReservation resourceReservation);

}
