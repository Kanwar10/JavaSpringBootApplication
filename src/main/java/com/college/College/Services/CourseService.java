package com.college.College.Services;

import com.college.College.Model.Course;
import com.college.College.Repositaries.CourseRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public void updateCourse(Long id, Course course) {
        Course tempCourse=courseRepositery.findById(id).get();
        tempCourse.setCourseName(course.getCourseName());
        courseRepositery.save(tempCourse);
    }
}
