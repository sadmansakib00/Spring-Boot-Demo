package com.example.project.controller;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Course;
import com.example.project.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/create")
    public ApiResponse createCourse(@RequestBody Course course) {
        return courseService.createNewCourse(course);
    }

}
