package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        Application.class,
        H2TestProfileJPAConfig.class})
@ActiveProfiles("test")
public class SBTestProfile {

    @Test
    public void sample_test_case(){

        Object ds = new Object();
        assertNotNull(ds);

    }
}
