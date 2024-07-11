package com.example.project.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {

    String responseCode;
    String responseValue;

    public static ApiResponse createApiResponse(String code, String value) {
        return new ApiResponse(code, value);
    }

}
