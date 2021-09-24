package com.college.College.Services;

import com.college.College.Model.Student;
import com.college.College.Repositaries.StudentRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepositery studentRepositery;

    public void createStudent(Student student)
    {
        studentRepositery.save(student);
    }

    public List<Student> findAll() {
        return studentRepositery.findAll();
    }

    public void deleteById(Long id) {
        studentRepositery.deleteById(id);
    }

    public void updateById(Long id, Student student) {
        studentRepositery.updateNameById(id,student.getName());
        studentRepositery.updateCourseById(id,student.getCourse());
        studentRepositery.updateCgpaById(id,student.getCgpa());
    }
}
