package com.college.College.Controller;

import com.college.College.Model.Subject;
import com.college.College.Services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("collegeApp/v1/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public void createSubject(@RequestBody @Validated Subject subject)
    {
        subjectService.createSubject(subject);
    }

    @GetMapping
    public List<Subject> getAllSubject()
    {
        return subjectService.getAllSubjects();
    }
}
