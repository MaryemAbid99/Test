package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemSalhi.MentalHealth;

import java.util.List;

public interface IMentalHealthServices {
    MentalHealth addMentalhealth(MentalHealth mentalhealth);
    MentalHealth updateMentalhealth(MentalHealth mentalhealth);
    void deleteMentalhealth(Integer id);
    MentalHealth getMentalhealthById(int id);
    List<MentalHealth> getAllMentalhealths();
}
