package org.example.service.impl;

import org.example.domain.Student;
import org.example.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.repository.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getStudentInfo(long id) {
        return studentMapper.getStudentById(id);
    }

    public void createStudent(Student student) {
        studentMapper.create(student);
    }
}

