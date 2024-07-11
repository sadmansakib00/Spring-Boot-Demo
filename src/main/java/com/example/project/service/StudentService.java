package com.example.project.service;

import com.example.project.common.response.ApiResponse;
import com.example.project.data.entity.Student;
import com.example.project.data.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public ApiResponse createNewStudent(Student student) {

        if (!isValidRequest(student)) {
            return ApiResponse.createApiResponse("000", "Invalid student details!");
        }

        Optional<Student> existingStudent = studentRepository.findByUsername(student.getUsername());
        if (existingStudent.isPresent()) {
            return ApiResponse.createApiResponse("001", "Student already exists!");
        }
        studentRepository.save(student);
        return ApiResponse.createApiResponse("100", "Student saved successfully!");
    }

    private boolean isValidRequest(Student student) {
        return !ObjectUtils.isEmpty(student)
                && !ObjectUtils.isEmpty(student.getUsername());

    }
}
