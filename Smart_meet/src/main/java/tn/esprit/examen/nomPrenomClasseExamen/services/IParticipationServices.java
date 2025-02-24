package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Participation;

import java.util.List;

public interface IParticipationServices {
    Participation addParticipation(Participation participation);
    Participation retrieveParticipation(int id);
    List<Participation> retrieveAllParticipations();
    void deleteParticipation(int id);
    void updateParticipation(int id, Participation participation);
}
