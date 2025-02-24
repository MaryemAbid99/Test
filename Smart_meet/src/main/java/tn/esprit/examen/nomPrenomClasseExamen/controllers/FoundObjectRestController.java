package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.FoundObject;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemJeljli.Document;
import tn.esprit.examen.nomPrenomClasseExamen.services.IFoundObjectServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("FoundObject")
@RestController
@Tag(name="hello")
public class FoundObjectRestController {
    private final IFoundObjectServices foundObjectServices;

    @PostMapping("/AddFoundObject")
    public FoundObject createFoundObject(FoundObject foundObject) {
        return foundObjectServices.createFoundObject(foundObject);
    }

    @GetMapping("/ReadFoundObjectByID/{id}")
    public FoundObject getFoundObjectById(Integer id) {
        return foundObjectServices.getFoundObjectById(id);
    }

    @GetMapping("/ReadAllFoundObjects")
    public List<FoundObject> getAllFoundObjects() {
        return foundObjectServices.getAllFoundObjects();
    }

    @DeleteMapping("/DeletFoundsByID/{id}")
    public void deleteFoundObject(@PathVariable Integer id){
        foundObjectServices.deleteFoundObject(id);
    }

    @PutMapping("/UpdateFoundObjectByID/{id}")
    public FoundObject updateFoundObject(@PathVariable Long id,@RequestBody FoundObject foundObject)  {
        return foundObjectServices.updateFoundObject(id,foundObject);
    }

}
