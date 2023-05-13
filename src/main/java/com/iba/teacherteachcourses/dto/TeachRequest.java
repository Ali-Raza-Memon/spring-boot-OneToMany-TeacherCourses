package com.iba.teacherteachcourses.dto;


import com.iba.teacherteachcourses.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeachRequest {

    private Teacher teacher;

}
