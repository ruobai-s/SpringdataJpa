package com.ruobai.repostitory;

import com.ruobai.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    public Student getById(Long id);
}
