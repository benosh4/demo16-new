package com.example.demo16;

import com.example.demo16.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ttl.larku.domain.Track;
import ttl.larku.service.TrackService;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication

public class Demo16Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo16Application.class, args);
    }
}

@Component
class ClassRun implements CommandLineRunner{

    @Autowired
    private TrackService ts;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello111");

        List<Track> tracks = ts.getAllTracks();
        tracks.forEach(System.out::println);
    }

}




