package edu.icet.quiz.service;

import edu.icet.quiz.dto.Course;

import java.util.List;

public interface CourseService {
    void create(Course course);

    List<Course> getAll();

    void update(Course course);

    void deleteById(Integer id);


}