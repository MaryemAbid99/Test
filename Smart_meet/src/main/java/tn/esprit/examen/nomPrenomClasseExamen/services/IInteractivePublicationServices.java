package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.InteractivePublication;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.Resource;

import java.util.List;
import java.util.Optional;

public interface IInteractivePublicationServices {
    InteractivePublication createIPublication(InteractivePublication publication);
    Optional<InteractivePublication> getIPublicationByID(int id);
    List<InteractivePublication> getAllIPublications();
    void deleteIPublication(int id);
    void updateIPublication(int id , InteractivePublication publication);
}
