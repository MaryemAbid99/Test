package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.MaryemAbid.ResourceReservation;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IResourceReservationRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service

public class ResourceReservationServicesImpl implements IResourceReservationServices {

    private final IResourceReservationRepository reservationRepository;

    @Override
    public ResourceReservation createResourceReservation(ResourceReservation resourceReservation) {
        return reservationRepository.save(resourceReservation);
    }

    @Override
    public Optional<ResourceReservation> getResourceReservationByID(int id) {
        return reservationRepository.findById((long) id);
    }

    @Override
    public List<ResourceReservation> getAllResourceReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public void deleteResourceReservation(int id) {
        reservationRepository.deleteById((long) id);

    }

    @Override
    public void updateResourceReservation(int id, ResourceReservation resourceReservation) {
        reservationRepository.save(resourceReservation);

    }
}
