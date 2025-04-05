package edu.icet.quiz.service;

import edu.icet.quiz.dto.Answer;

import java.util.List;

public interface AnswerService {
    void create(Answer answer);

    List<Answer> getAll();

    void update(Answer answer);

    void deleteById(Integer id);


}