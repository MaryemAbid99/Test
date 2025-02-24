package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.Sponsorship;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.ISponsorshipRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service


public class SponsorshipServicesImpl implements ISponsorshipServices {
    private final ISponsorshipRepository sponsorshipRepository;

    @Override
    public List<Sponsorship> getAllSponsorship() {
        return sponsorshipRepository.findAll();
    }

    @Override
    public Sponsorship getSponsorshipById(int id) {
        return sponsorshipRepository.findById(id).get();
    }

    @Override
    public Sponsorship CreateSponsorship(Sponsorship sponsorship) {
        return sponsorshipRepository.save(sponsorship);
    }

    @Override
    public void deleteSponsorship(int id) {
        sponsorshipRepository.deleteById(id);

    }

    @Override
    public Sponsorship updateSponsorship(int id, Sponsorship sponsorship) {
        return sponsorshipRepository.findById(id).get();
    }
}
