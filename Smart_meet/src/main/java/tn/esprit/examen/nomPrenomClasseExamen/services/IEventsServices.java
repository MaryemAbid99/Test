package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;

import java.util.List;

public interface IEventsServices {
    Events createEvent(Events event);
    Events updateEvent(Long id, Events event);
    void deleteEvent(Integer id);
    Events getEventById(Integer id);
    List<Events> getAllEvents();
}
