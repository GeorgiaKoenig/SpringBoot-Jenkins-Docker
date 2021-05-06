package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student georgia = new Student(
                    1L, "Georgia", "Georgia.Koenig@example.com",
                    LocalDate.of(1994, APRIL, 24)
            );

            Student constantin = new Student("Constantin", "MrPinguin@example.com",
                    LocalDate.of(2000, JUNE, 7)
            );

            Student dominik = new Student("Dominik", "DoPaMin@example.com",
                    LocalDate.of(2000, OCTOBER, 22)
            );

            repository.saveAll(List.of(georgia, constantin, dominik));
        };
    }
}
