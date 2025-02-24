package tn.esprit.examen.nomPrenomClasseExamen.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;
import tn.esprit.examen.nomPrenomClasseExamen.repositories.IUserRepository;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service

public class UserServicesImpl implements IUserServices {

    private final IUserRepository userRepository;



    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }


    @Override
    public User update(Long id, User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);

    }
}
