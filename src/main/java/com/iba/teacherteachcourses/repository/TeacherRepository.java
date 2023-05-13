package com.iba.teacherteachcourses.repository;

import com.iba.teacherteachcourses.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {

}
