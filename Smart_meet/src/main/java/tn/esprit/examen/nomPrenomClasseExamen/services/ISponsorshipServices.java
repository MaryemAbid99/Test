package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.Sponsorship;
import tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati.Session;

import java.util.List;

public interface ISponsorshipServices {
    List<Sponsorship> getAllSponsorship();
    Sponsorship getSponsorshipById(int id);
    Sponsorship CreateSponsorship (Sponsorship sponsorship);
    void deleteSponsorship (int id);
    Sponsorship updateSponsorship(int id, Sponsorship sponsorship);

}
