package com.example.project.service;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Course;
import com.example.project.data.entity.Instructor;
import com.example.project.data.repository.CourseRepository;
import com.example.project.data.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;

    public ApiResponse createNewCourse(Course course) {

        if (!isValidRequest(course)) {
            return ApiResponse.createApiResponse("000", "Invalid course details!");
        }

        Optional<Instructor> instructor = instructorRepository.findById(course.getInstructorId());
        if (instructor.isEmpty()) {
            return ApiResponse.createApiResponse("001", "Given instructor ID doesn't exist!");
        }

        courseRepository.save(course);

        return ApiResponse.createApiResponse("100", "New course created successfully!");
    }

    private boolean isValidRequest(Course course) {
        return !ObjectUtils.isEmpty(course)
                && !ObjectUtils.isEmpty(course.getTitle())
                && !ObjectUtils.isEmpty(course.getCreditHour())
                && !ObjectUtils.isEmpty(course.getInstructorId());
    }

}
