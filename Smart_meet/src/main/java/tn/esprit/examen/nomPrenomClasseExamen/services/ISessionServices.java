package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.YousraFourati.Session;

import java.util.List;

public interface ISessionServices {
    List<Session> getAllSessions();
    Session getSessionById(int id);
    Session CreateSession(Session session);
    void deleteSession(int id);
    Session updateSession(int id, Session session);
}
