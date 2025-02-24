package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.Feedback;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IFeedbackRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service

public class FeedbackServicesImpl implements IFeedbackServices {

    private final IFeedbackRepository feedbackRepository;

    @Override
    public Feedback addFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public Feedback updateFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }



    @Override
    public void deleteFeedback(Integer id) {
        feedbackRepository.deleteById(id);


    }

    @Override
    public Feedback getFeedbackById(Integer id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    @Override
    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }
}
