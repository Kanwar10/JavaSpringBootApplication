package com.college.College.Repositaries;
import com.college.College.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface StudentRepositery  extends  JpaRepository<Student,Long> {

    @Modifying
    @Transactional
    @Query(
            value = "update student set name=:name where id=:studentid",
            nativeQuery = true
    )
    void updateNameById(@Param("studentid") Long id, @Param("name") String name);


    @Modifying
    @Transactional
    @Query(
            value = "update student set cgpa=:cgpa where id=:studentid",
            nativeQuery = true
    )
    void updateCgpaById(@Param("studentid") Long id, @Param("cgpa") Integer cgpa);


    @Modifying
    @Transactional
    @Query(
            value = "update student set course=:course where id=:studentid",
            nativeQuery = true
    )
    void updateCourseById(@Param("studentid") Long id, @Param("course") String course);

}
