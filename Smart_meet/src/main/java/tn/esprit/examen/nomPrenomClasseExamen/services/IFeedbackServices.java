package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.Feedback;

import java.util.List;

public interface IFeedbackServices {
    Feedback addFeedback(Feedback feedback);
    Feedback updateFeedback(Feedback feedback);
    void deleteFeedback(Integer id);
    Feedback getFeedbackById(Integer id);
    List<Feedback> getAllFeedbacks();
}
