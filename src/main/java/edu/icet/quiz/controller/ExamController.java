package edu.icet.quiz.controller;

import edu.icet.quiz.dto.Exam;
import edu.icet.quiz.service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exam")
@RequiredArgsConstructor
public class ExamController {

    final ExamService service;

    @PostMapping("/create-exam")
    public void createExam(@RequestBody Exam exam){
        service.createExam(exam);
    }
    @GetMapping("/get-exam-by-course-id/{id}")
    public Exam getExamByCourseId(@PathVariable Integer id){
        return service.getExamByCourseId(id);
    }
}
