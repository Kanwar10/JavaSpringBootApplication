package com.college.College.Services;

import com.college.College.Model.Student;
import com.college.College.Repositaries.StudentRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepositery studentRepositery;

    public void createStudent(Student student)
    {
        studentRepositery.save(student);
    }

    public List<Student> findAll() {
        return studentRepositery.findAll();
    }

}
