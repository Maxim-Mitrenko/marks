package com.example.marks.repository;

import com.example.marks.model.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<Mark, String> {

    List<Mark> findByStudentId(int studentId);
}
