package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.MentalHealth;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IMentalhealthRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MentalHealthServicesImpl implements IMentalHealthServices {
    private final IMentalhealthRepository mentalhealthRepository;


    @Override
    public MentalHealth addMentalhealth(MentalHealth mentalhealth) {
        return mentalhealthRepository.save(mentalhealth);
    }

    @Override
    public MentalHealth updateMentalhealth(MentalHealth mentalhealth) {
        return mentalhealthRepository.save(mentalhealth);
    }

    @Override
    public void deleteMentalhealth(Integer id) {
        mentalhealthRepository.deleteById(id);

    }



    @Override
    public MentalHealth getMentalhealthById(int id) {
        return mentalhealthRepository.findById(id).orElse(null);

    }

    @Override
    public List<MentalHealth> getAllMentalhealths() {
        return mentalhealthRepository.findAll();
    }
}
