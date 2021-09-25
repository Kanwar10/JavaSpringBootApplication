package com.college.College.Services;

import com.college.College.Model.Course;
import com.college.College.Repositaries.CourseRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepositery courseRepositery;

    public void createCourse(Course course) {
        courseRepositery.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepositery.findAll();
    }
}
