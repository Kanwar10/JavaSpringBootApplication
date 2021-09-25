package com.college.College.Services;

import com.college.College.Model.Subject;
import com.college.College.Repositaries.SubjectRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepositery subjectRepositery;

    public void createSubject(Subject subject) {
        System.out.println(subject);
        subjectRepositery.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepositery.findAll();
    }
}
