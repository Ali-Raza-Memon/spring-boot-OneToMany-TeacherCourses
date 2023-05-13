package com.iba.teacherteachcourses.repository;

import com.iba.teacherteachcourses.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,String> {

}
