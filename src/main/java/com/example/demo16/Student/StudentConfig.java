package com.example.demo16.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->
        {
            Student meriam = new Student(
                    "Meria",
            "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5));



            Student alex = new Student("alex",
                    "malex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5));


            repository.saveAll(List.of(meriam, alex));

        };
    }
}


