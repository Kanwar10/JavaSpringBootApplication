package com.college.College;

import com.college.College.Model.Student;
import com.college.College.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("collegeApp/v1")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public void createStudent(@RequestBody Student student)
    {
        System.out.println("here");
        studentService.createStudent(student);
    }
    @GetMapping
    public List<Student> findAll()
    {
        System.out.println("finding");
        return studentService.findAll();
    }
}
