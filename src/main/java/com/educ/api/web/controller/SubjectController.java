package com.educ.api.web.controller;

import com.educ.api.domain.Subject;
import com.educ.api.domain.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/all")
    public List<Subject> getAll(){
        return subjectService.getAll();
    }
}
