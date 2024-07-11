package com.example.project.service;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Instructor;
import com.example.project.data.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public ApiResponse createNewInstructor(Instructor student) {

        if (!isValidRequest(student)) {
            return ApiResponse.createApiResponse("000", "Invalid instructor details!");
        }
        instructorRepository.save(student);

        return ApiResponse.createApiResponse("100", "Instructor saved successfully!");
    }

    public List<Instructor> getAllInstructor() {
        return instructorRepository.findAll();
    }

    private boolean isValidRequest(Instructor instructor) {
        return !ObjectUtils.isEmpty(instructor)
                && !ObjectUtils.isEmpty(instructor.getInstructorName());
    }

}
