package com.college.College.Controller;

import com.college.College.Model.Student;
import com.college.College.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("collegeApp/v1")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void createStudent(@RequestBody @Validated Student student)
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

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id)
    {
        studentService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id,@RequestBody Student student)
    {
        studentService.updateById(id,student);
    }
}
