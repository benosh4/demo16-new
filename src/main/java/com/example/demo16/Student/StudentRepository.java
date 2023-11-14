package com.example.demo16.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    @Query("SELECT s FROM Student s where s.email = ?1 ")
   Optional<Student> findStudentByEmail(String email);

    @Query("SELECT s FROM Student s where s.id =?1 ")
    Optional<Student> findStudentById(Long id);

    @Query("SELECT s FROM Student s where s.id  > ?1 ")
    Optional<List<Student>> findStudentById4(Long id);

    @Modifying
    @Query ("UPDATE Student s set s.email = ?2 where s.id =?1")
    void updateStudent(Long id, String s);
}

