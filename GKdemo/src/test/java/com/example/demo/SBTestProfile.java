package com.example.demo;

import com.example.demo.student.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        DemoApplication.class,
        H2TestProfileJPAConfig.class})
@ActiveProfiles("test")
public class SBTestProfile {

    @Test
    public void sample_test_case(){

        Student testStudent = new Student();
        assertNotNull(testStudent);

    }
}
