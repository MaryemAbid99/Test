package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.Resource;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.ResourceReservation;
import tn.esprit.examen.nomPrenomClasseExamen.services.IResourceReservationServices;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("ResourceReservation")
@RestController
@Tag(name="hello")
public class ResourceReservationRestController {
    private final IResourceReservationServices resourceReservationServices;

    @PostMapping("/create")
    public ResourceReservation createResourceReservation(@RequestBody ResourceReservation resourceReservation) {

        return resourceReservationServices.createResourceReservation(resourceReservation);
    }

    @GetMapping("/ReadByID/{id}")
    public Optional<ResourceReservation> getResourceReservationByID(@PathVariable int id){
        return resourceReservationServices.getResourceReservationByID(id);
    }


    @GetMapping("/ReadAllResourceReservations")
    public List<ResourceReservation> getAllResourceReservations() {
        return resourceReservationServices.getAllResourceReservations();
    }

    @DeleteMapping("/DeleteResourceReservationByID/{id}")
    public void deleteResourceReservation(@PathVariable int id){
        resourceReservationServices.deleteResourceReservation(id);
    }

    @PutMapping("/UpdateResourceReservationByID/id")
    public void updateResourceReservation(@PathVariable int id, @RequestBody ResourceReservation resourceReservation) {
        resourceReservationServices.updateResourceReservation(id,resourceReservation);
    }


}
