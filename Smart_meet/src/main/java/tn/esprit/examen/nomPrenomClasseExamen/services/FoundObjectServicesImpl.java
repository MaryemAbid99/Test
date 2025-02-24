package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.GhanemRidene.FoundObject;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IFoundObjectRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FoundObjectServicesImpl implements IFoundObjectServices {
    private final IFoundObjectRepository foundObjectRepository;

    @Override
    public FoundObject createFoundObject(FoundObject foundObject) {
        return foundObjectRepository.save(foundObject);
    }

    @Override
    public FoundObject updateFoundObject(Long id, FoundObject foundObject) {
        return foundObjectRepository.save(foundObject);
    }

    @Override
    public void deleteFoundObject(Integer id) {
        foundObjectRepository.deleteById(id);

    }

    @Override
    public FoundObject getFoundObjectById(Integer id) {
        return foundObjectRepository.findById(id).orElse(null);
    }

    @Override
    public List<FoundObject> getAllFoundObjects() {
        return foundObjectRepository.findAll();
    }
}
