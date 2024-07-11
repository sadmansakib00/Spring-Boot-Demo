package com.example.project.controller;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Student;
import com.example.project.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public ApiResponse createStudent(@RequestBody Student student) {
        return studentService.createNewStudent(student);
    }

}
