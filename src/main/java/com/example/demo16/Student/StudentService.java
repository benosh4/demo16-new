package com.example.demo16.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();

    }


    public void addStudent(Student s) {
        Optional<Student> st = studentRepository.findStudentByEmail(s.getEmail());
        if (st.isPresent()) {
            throw new IllegalStateException("exist email");
        }
        studentRepository.save(s);
    }

    public void deleteStudent(Long so) {
        Optional<Student> stToDelete = studentRepository.findStudentById(so);
        if (!stToDelete.isPresent()) {
            throw new IllegalStateException("mail not exist");
        }
        studentRepository.deleteById(so);
    }
//    public List<Student> getSpecificStudentso(Long idd) {
//        List<Student> results =  studentRepository.findAll();
//        List<Student> news = new ArrayList<>();
//        for (Student se : results)
//              {
//                if(se.getId() > idd) {
//                    news.add(se);
//
//                }
//        }return news;}

    public List<Student> getSpecificStudents(Long idd) {
        Optional<List<Student>> studentse = studentRepository.findStudentById4(idd);
        if (studentse.isEmpty()) {
            throw new IllegalStateException("list not exist - no ids like this");
        }
        return studentse.get();
    }

    public void updateStudent(Student s) {
        Optional<Student> stToUpdate = studentRepository.findStudentById(s.getId());
        if (!stToUpdate.isPresent()) {
            throw new IllegalStateException("student not exist - no user to update");
        }
        //studentRepository.updateStudent(s.getId() , s.getEmail());
        studentRepository.save(s);

    }
}




