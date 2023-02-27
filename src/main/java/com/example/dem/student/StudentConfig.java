package com.example.dem.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student emre = new Student(

                    "Emre",
                    "emre@hotmail.com",
                    LocalDate.of(1992, Month.JUNE, 23)
            );
            Student yigit = new Student(

                    "yigit",
                    "yigit@hotmail.com",
                    LocalDate.of(2018, Month.APRIL, 20)
            );
            Student ayse = new Student(

                    "Ayşe",
                    "ayse@hotmail.com",
                    LocalDate.of(1993, Month.JUNE, 27)
            );
            repository.saveAll(
                    List.of(emre, yigit, ayse)
            );
        };
    }
}
