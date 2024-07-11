package com.example.project.controller;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Instructor;
import com.example.project.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructor")
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorService instructorService;

    @PostMapping("/create")
    public ApiResponse createStudent(@RequestBody Instructor instructor) {
        return instructorService.createNewInstructor(instructor);
    }

    @GetMapping("/all")
    public List<Instructor> getAllInstructor() {
        return instructorService.getAllInstructor();
    }

}
