package com.college.College.Controller;

import com.college.College.Model.Course;
import com.college.College.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("collegeApp/v1/course")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public void createCourse(@RequestBody Course course)
    {
        courseService.createCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses()
    {
        return courseService.getAllCourses();
    }

}
