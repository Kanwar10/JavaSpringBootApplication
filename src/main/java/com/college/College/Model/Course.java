package com.college.College.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {

    @SequenceGenerator(
            name = "courseId",
            sequenceName = "courseId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "courseId"
    )
    @Id
    private Long courseId;

    @NotNull
    private String courseName;

}
