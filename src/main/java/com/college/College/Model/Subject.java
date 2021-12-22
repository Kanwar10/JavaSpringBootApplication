package com.college.College.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Subject {

    @Id
    @SequenceGenerator(
            name = "subject_id",
            allocationSize = 1,
            sequenceName = "subject_id"
    )
    @GeneratedValue(
            generator = "subject_id",
            strategy = GenerationType.SEQUENCE
    )
    private Long subjectId;

    @NotNull
    private String name;

    @NotNull
    private Integit ger credits;

    @OneToOne
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"
    )
    private Course course;

}
