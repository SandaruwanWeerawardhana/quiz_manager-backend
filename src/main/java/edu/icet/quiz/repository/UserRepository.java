package edu.icet.quiz.repository;


import edu.icet.quiz.entity.AnswerEntity;
import edu.icet.quiz.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {

}