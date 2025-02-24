package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.FoundObject;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

import java.util.List;

public interface IFoundObjectServices {
    FoundObject createFoundObject(FoundObject foundObject);
    FoundObject updateFoundObject(Long id, FoundObject foundObject);
    void deleteFoundObject(Integer id);
    FoundObject getFoundObjectById(Integer id);
    List<FoundObject> getAllFoundObjects();
}
