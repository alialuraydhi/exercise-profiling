package com.advpro.profiling.tutorial.repository;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author muhammad.khadafi
 */
@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {
    List<StudentCourse> findByStudentId(Long studentId);

    /**
     * Find all student courses where the student ID is in the provided list
     * @param studentIds List of student IDs to search for
     * @return List of student courses that match the criteria
     */
    List<StudentCourse> findByStudentIdIn(List<Long> studentIds);
}