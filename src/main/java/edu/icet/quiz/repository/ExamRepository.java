package edu.icet.quiz.repository;


import edu.icet.quiz.entity.ExamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamEntity,Integer> {
    ExamEntity getByCourseId(Integer id);
}