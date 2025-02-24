package tn.esprit.examen.nomPrenomClasseExamen.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.nomPrenomClasseExamen.entities.User.User;
import tn.esprit.examen.nomPrenomClasseExamen.services.IUserServices;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("User")
@RestController
@Tag(name="hello")


public class UserRestController {

    private final IUserServices userServices;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userServices.createUser(user);
    }

    @GetMapping("/ReadByID/{id}")
    public User findById(@PathVariable Integer id) {
        return userServices.findById(id);
    }

    @GetMapping("/ReadAllUsers")
    public List<User> getAllUsers() {
        return userServices.findAll();
    }


    @PutMapping("UpdateUser/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userServices.update(id, user);
    }


    @DeleteMapping("/DeleteUser/{id}")
    public void deleteUser(@PathVariable Integer id,@RequestBody User user) {
        userServices.delete(id);
    }

}
