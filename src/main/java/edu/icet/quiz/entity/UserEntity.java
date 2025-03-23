package edu.icet.quiz.entity;

import edu.icet.quiz.util.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private UserRole role;
    private String address;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
