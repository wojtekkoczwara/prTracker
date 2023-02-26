package com.app.prTracker.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExerciseRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ExerciseErrorResponse> handleException(ExerciseNotFoundException exception){

        ExerciseErrorResponse errorResponse = new ExerciseErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                System.currentTimeMillis());

        return  new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ExerciseErrorResponse> handleException(Exception exception){

        ExerciseErrorResponse errorResponse = new ExerciseErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                System.currentTimeMillis());

        return  new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

}
