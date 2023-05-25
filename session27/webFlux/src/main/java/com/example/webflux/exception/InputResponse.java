package com.example.webflux.exception;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class InputResponse {
    private int errorCode;
    private int input;
    private String message;
}
