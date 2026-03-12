package com.example.zaplink.dto;

import com.example.zaplink.dto.enums.DddEnum;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequestDTO(DddEnum ddd,

                            @Max(9)
                            @Min(8)
                            @NotNull
                            @NotBlank
                                String phoneNumber,

                            @Max(255)
                                String message) {
}
