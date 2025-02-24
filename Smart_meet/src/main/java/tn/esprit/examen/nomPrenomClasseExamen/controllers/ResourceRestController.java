package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.Resource;
import tn.esprit.examen.nomPrenomClasseExamen.services.IResourceServices;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("Resource")
@RestController
@Tag(name="hello")

public class ResourceRestController {

    private final IResourceServices resourceServices;


    @PostMapping("/create")
    public Resource createResource(@RequestBody Resource resource) {

        return resourceServices.createResource(resource);
    }

    @GetMapping("/ReadByID/{id}")
    public Optional<Resource> getResourceByID(@PathVariable int id) {
        return resourceServices.getResourceByID(id);
    }


    @GetMapping("/ReadAllResources")
    public List<Resource> getAllResources () {
        return resourceServices.getAllResources();
    }

    @DeleteMapping("/DeleteResourceByID/{id}")
    public void deleteResource(@PathVariable int id){
        resourceServices. deleteResource(id);
    }

    @PutMapping("/UpdateResourceByID/{id}")
    public void updateResource(@PathVariable int id, @RequestBody Resource resource){
        resourceServices.updateResource(id,resource);
    }
}
