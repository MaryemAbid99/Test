package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.Events;
import tn.esprit.examen.nomPrenomClasseExamen.services.IEventsServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("Events")
@RestController
@Tag(name="hello")



public class EventsRestController {

    private IEventsServices eventsServices;

    @PostMapping("/Create")
    public Events createEvent(@RequestBody Events event) {
        return eventsServices.createEvent(event);
    }

    @PutMapping("/UpdateByID/{id}")
    public Events updateEvent(@PathVariable Long id, @RequestBody Events event) {
        return eventsServices.updateEvent(id, event);
    }

    @DeleteMapping("DeleteByID/{id}")
    public void deleteEvent(@PathVariable int id) {
        eventsServices.deleteEvent(id);
    }

    @GetMapping("/ReadByID/{id}")
    public Events getEventById(@PathVariable int id) {
        return eventsServices.getEventById(id);
    }

    @GetMapping("/ReadAllEvents")
    public List<Events> getAllEvents() {
        return eventsServices.getAllEvents();
    }


}
