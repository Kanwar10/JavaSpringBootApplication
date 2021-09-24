package com.college.College.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.internal.engine.groups.Sequence;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Student {
    @SequenceGenerator(
            name = "studentId",
            sequenceName = "studentId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "studentId"
    )
    @Id
    Long id;
    @NonNull
    String name;
    Integer cgpa;
    @NonNull
    String course;

}
