package com.example.marks.service;

import com.example.marks.model.Mark;
import com.example.marks.repository.MarkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {

    private MarkRepository repository;

    public MarkService(MarkRepository repository) {
        this.repository = repository;
    }

    public void add(Mark mark) {
        repository.save(mark);
    }

    public List<Mark> get(int id) {
        return repository.findByStudentId(id);
    }
}
