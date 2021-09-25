package com.college.College.Repositaries;

import com.college.College.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepositery extends JpaRepository<Subject,Long> {
}
