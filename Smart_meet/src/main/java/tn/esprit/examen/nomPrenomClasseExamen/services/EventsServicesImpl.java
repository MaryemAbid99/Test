package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IEventRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service


public class EventsServicesImpl implements IEventsServices {
    private final IEventRepository eventRepository;

    @Override
    public Events createEvent(Events event) {
        return eventRepository.save(event);
    }

    @Override
    public Events updateEvent(Long id, Events event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);

    }

    @Override
    public Events getEventById(Integer id) {
        return eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event not found"));
    }

    @Override
    public List<Events> getAllEvents() {
        return eventRepository.findAll();
    }
}
