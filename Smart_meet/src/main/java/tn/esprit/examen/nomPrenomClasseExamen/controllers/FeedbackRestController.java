package tn.esprit.examen.nomPrenomClasseExamen.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.Feedback;
import tn.esprit.examen.nomPrenomClasseExamen.services.IFeedbackServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("FeedBack")
@RestController
@Tag(name="hello")

public class FeedbackRestController {
    private final IFeedbackServices servicesFeedback;
    @PostMapping("/Add-feedbacks")
    public Feedback addFeedback(@RequestBody Feedback feedback) {
        return servicesFeedback.addFeedback(feedback);
    }

    @PutMapping("/Update-feedbacks")
    public Feedback updateFeedback(@RequestBody Feedback feedback) {
        return servicesFeedback.updateFeedback(feedback);
    }

    @DeleteMapping("Delete-feedbacks/{id}")
    public void deleteFeedback(@PathVariable int id) {
        servicesFeedback.deleteFeedback(id);
    }

    @GetMapping("Get-feedbacks/{id}")
    public Feedback getFeedbackById(@PathVariable int id) {
        return servicesFeedback.getFeedbackById(id);
    }

    @GetMapping("Get-all-feedbacks")
    public List<Feedback> getAllFeedbacks() {
        return servicesFeedback.getAllFeedbacks();
    }
}
