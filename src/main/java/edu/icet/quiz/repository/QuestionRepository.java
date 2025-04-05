package edu.icet.quiz.repository;


import edu.icet.quiz.entity.PaperEntity;
import edu.icet.quiz.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity,Integer> {

}