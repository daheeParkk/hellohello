package org.example.controller;

import org.example.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.inter.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping()
    public String createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
        return "create User";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student studentInfo(@PathVariable("id") Long id) {
        return studentService.getStudentInfo(id);
    }
}