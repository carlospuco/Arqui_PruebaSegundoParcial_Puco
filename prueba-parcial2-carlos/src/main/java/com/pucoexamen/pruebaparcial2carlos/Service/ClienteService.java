package com.pucoexamen.pruebaparcial2carlos.Service;

import org.springframework.stereotype.Service;

import com.pucoexamen.pruebaparcial2carlos.Model.User;
import com.pucoexamen.pruebaparcial2carlos.Repository.UserRepository;



@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}