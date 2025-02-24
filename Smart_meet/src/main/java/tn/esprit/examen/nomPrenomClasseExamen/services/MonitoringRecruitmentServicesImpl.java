package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.MonitoringRecruitment;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IMonitoringRecruitmentRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class MonitoringRecruitmentServicesImpl implements IMonitoringRecruitmentServices {

    private final IMonitoringRecruitmentRepository monitoringRecruitmentRepository;


    @Override
    public MonitoringRecruitment createMonitoringRecruitment(MonitoringRecruitment monitoringRecruitment) {
        return monitoringRecruitmentRepository.save(monitoringRecruitment);
    }

    @Override
    public MonitoringRecruitment updateMonitoringRecruitment(Long id, MonitoringRecruitment monitoringRecruitment) {
        return monitoringRecruitmentRepository.save(monitoringRecruitment);
    }

    @Override
    public void deleteMonitoringRecruitment(Integer id) {
        monitoringRecruitmentRepository.deleteById(id);

    }

    @Override
    public MonitoringRecruitment getMonitoringRecruitmentById(Integer id) {
        return monitoringRecruitmentRepository.findById(id).orElseThrow(() -> new RuntimeException("MonitoringRecruitment not found"));
    }

    @Override
    public List<MonitoringRecruitment> getAllMonitoringRecruitments() {
        return monitoringRecruitmentRepository.findAll();

    }
}
