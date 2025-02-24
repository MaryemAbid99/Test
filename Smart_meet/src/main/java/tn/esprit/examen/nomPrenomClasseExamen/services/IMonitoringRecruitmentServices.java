package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.SalmaBenRomdhane.MonitoringRecruitment;

import java.util.List;

public interface IMonitoringRecruitmentServices {
    MonitoringRecruitment createMonitoringRecruitment(MonitoringRecruitment monitoringRecruitment);
    MonitoringRecruitment updateMonitoringRecruitment(Long id, MonitoringRecruitment monitoringRecruitment);
    void deleteMonitoringRecruitment(Integer id);
    MonitoringRecruitment getMonitoringRecruitmentById(Integer id);
    List<MonitoringRecruitment> getAllMonitoringRecruitments();
}
