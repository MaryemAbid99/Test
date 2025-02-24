package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.MentalHealth;
import tn.esprit.examen.nomPrenomClasseExamen.services.MentalHealthServicesImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("MentalHealth")
@RestController
@Tag(name="hello")

public class MentalHealthRestController {
    private final MentalHealthServicesImpl servicesMentalhealth;

    @PostMapping("/add-mentalhealth")
    public MentalHealth addMentalhealth(@RequestBody MentalHealth mentalhealth) {
        return servicesMentalhealth.addMentalhealth(mentalhealth);
    }

    @PutMapping("/update-mentalhealth")
    public MentalHealth updateMentalhealth(@RequestBody MentalHealth mentalhealth) {
        return servicesMentalhealth.updateMentalhealth(mentalhealth);
    }

    @DeleteMapping("/delete-mentalhealth/{id}")
    public void deleteMentalhealth(@PathVariable int id) {
        servicesMentalhealth.deleteMentalhealth(id);
    }

    @GetMapping("/get-mentalhealth/{id}")
    public MentalHealth getMentalhealthById(@PathVariable int id) {
        return servicesMentalhealth.getMentalhealthById(id);
    }

    @GetMapping("/get-all-mentalhealths")
    public List<MentalHealth> getAllMentalhealths() {
        return servicesMentalhealth.getAllMentalhealths();
    }
}
