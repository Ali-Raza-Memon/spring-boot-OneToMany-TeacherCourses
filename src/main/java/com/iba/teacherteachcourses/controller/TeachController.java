package com.iba.teacherteachcourses.controller;

import com.iba.teacherteachcourses.dto.TeachRequest;
import com.iba.teacherteachcourses.entity.Teacher;
import com.iba.teacherteachcourses.repository.CoursesRepository;
import com.iba.teacherteachcourses.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@RestController
public class TeachController {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CoursesRepository coursesRepository;

    @PostMapping("/placeTeach")
    public Teacher placeTeach(@RequestBody TeachRequest request){
        return teacherRepository.save(request.getTeacher());
    }

    @GetMapping("/findAllTeachs")
    public List<Teacher> findAllTeachs(){
        return teacherRepository.findAll();
    }

}
