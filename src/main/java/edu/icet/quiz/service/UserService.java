package edu.icet.quiz.service;

import edu.icet.quiz.dto.User;

import java.util.List;

public interface UserService {
    void create(User user);

    List<User> getAll();

    void update(User user);

    void deleteById(Integer id);


}