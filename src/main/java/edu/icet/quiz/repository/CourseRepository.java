package edu.icet.quiz.repository;


import edu.icet.quiz.entity.AnswerEntity;
import edu.icet.quiz.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {

}