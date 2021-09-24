package com.college.College.Repositaries;
import com.college.College.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepositery  extends  JpaRepository<Student,Long> {

}
