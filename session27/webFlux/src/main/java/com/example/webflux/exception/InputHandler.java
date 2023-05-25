package com.example.webflux.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InputHandler {

    @ExceptionHandler(InputException.class)
    public ResponseEntity<InputResponse> handleException(InputException ex)
    {
        InputResponse response=new InputResponse();
        response.setMessage(ex.getMessage());
        response.setInput(ex.getInput());
        response.setErrorCode(ex.getErrorCode());

        return  ResponseEntity.badRequest().body(response);

    }
}
