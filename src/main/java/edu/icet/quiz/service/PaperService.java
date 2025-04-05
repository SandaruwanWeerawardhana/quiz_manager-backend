package edu.icet.quiz.service;

import edu.icet.quiz.dto.Paper;

import java.util.List;

public interface PaperService {
    void create(Paper paper);

    List<Paper> getAll();

    void update(Paper paper);

    void deleteById(Integer id);


}