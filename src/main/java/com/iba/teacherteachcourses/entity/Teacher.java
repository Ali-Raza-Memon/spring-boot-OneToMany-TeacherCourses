package com.iba.teacherteachcourses.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Teacher {
    @Id

    private String Teacher_Id;
    private String Teacher_Name;
    private String Teacher_Gender;
    private String Teacher_Email;

    @OneToMany (targetEntity = Courses.class , cascade = CascadeType.ALL)
    @JoinColumn(name="T_Id", referencedColumnName = "Teacher_Id")
    private List<Courses> courses;

}
