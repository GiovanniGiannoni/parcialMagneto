package com.example.parcialMagneto_Giannoni.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}