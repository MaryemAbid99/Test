package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.InteractivePublication;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IInteractivePublicationRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class InteractivePublicationServicesImpl implements IInteractivePublicationServices {
    private final IInteractivePublicationRepository interactivePublicationRepository;

    @Override
    public InteractivePublication createIPublication(InteractivePublication publication) {
        return interactivePublicationRepository.save(publication);
    }

    @Override
    public Optional<InteractivePublication> getIPublicationByID(int id) {
        return interactivePublicationRepository.findById(id);
    }

    @Override
    public List<InteractivePublication> getAllIPublications() {
        return interactivePublicationRepository.findAll();
    }

    @Override
    public void deleteIPublication(int id) {
        interactivePublicationRepository.deleteById(id);

    }

    @Override
    public void updateIPublication(int id, InteractivePublication publication) {
        interactivePublicationRepository.save(publication);

    }
}
