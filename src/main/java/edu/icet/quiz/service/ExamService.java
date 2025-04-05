package edu.icet.quiz.service;

import edu.icet.quiz.dto.Exam;

import java.util.List;

public interface ExamService {
    void createExam(Exam exam);

    Exam getExamByCourseId(Integer id);

    List<Exam> getAll();

    void updateExam(Exam exam);

    void deleteExamById(Integer id);

    void deleteExamByCourseId(Integer id);

}