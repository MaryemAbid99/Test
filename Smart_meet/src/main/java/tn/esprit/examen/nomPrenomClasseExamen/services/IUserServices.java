package tn.esprit.examen.nomPrenomClasseExamen.services;

import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;

import java.util.List;

public interface IUserServices {
    User createUser(User user);
    List<User> findAll();
    User findById(Integer id);
    User update(Long id, User user);
    void delete(Integer id);
}
