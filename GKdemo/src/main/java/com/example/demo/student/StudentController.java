package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
        //this.studentService = new StudentService();
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }


    @GetMapping(path = "/hello")
    public String secret(@RequestParam(value = "name", defaultValue = "Person", required = false) String name,
                         @RequestParam(value = "region", defaultValue = "ha", required = false) String region) {

        String message;

        if (region.equals("de")) { message = String.format("Moin %s!", name);
        }
        else if (region.equals("en")) { message = String.format("Howdy %s!", name);
        }
        else if (region.equals("ha")) { message = String.format("Aloha %s!", name);
        }
        else { message = String.format("Dear %s, you can have a personal greeting by choosing a region code like en, de or ha", name);
        }

        return message;
    }



    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }


    @DeleteMapping(path ="{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }


    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {

        studentService.updateStudent(studentId, name, email);
    }


} // End of Class
