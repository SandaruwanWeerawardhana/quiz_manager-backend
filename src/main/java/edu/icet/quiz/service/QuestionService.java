package edu.icet.quiz.service;

import edu.icet.quiz.dto.Question;

import java.util.List;

public interface QuestionService {
    void create(Question question);

    List<Question> getAll();

    void update(Question question);

    void deleteById(Integer id);


}