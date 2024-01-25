package com.example.marks.controller;

import com.example.marks.model.Mark;
import com.example.marks.service.MarkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    private MarkService service;

    public Controller(MarkService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Mark> getMarks(@RequestParam int id) {
        return service.get(id);
    }

    @PostMapping("/marks")
    public String post(@RequestBody Mark mark) {
        service.add(mark);
        return "Успешно!";
    }
}
