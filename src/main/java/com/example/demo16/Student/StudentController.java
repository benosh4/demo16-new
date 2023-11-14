package com.example.demo16.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/Student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService student) {
        this.studentService = student;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudent();
    }

    @GetMapping("/specific")
    public List<Student> getStudentsSpecificId(@RequestParam("id") Long id){
        return studentService.getSpecificStudents(id);
    }

    @PostMapping
    public void saveStudent(@RequestBody Student s) {
        studentService.addStudent(s);
    }

    @DeleteMapping(path = "{id}")
    public void DeleteStudent(@PathVariable("id") Long id){
       studentService.deleteStudent(id);
    }

    @PutMapping(path = "/updatesStudent")
    public void updateExist(@RequestBody Student s) {
        studentService.updateStudent(s);

    }


}
