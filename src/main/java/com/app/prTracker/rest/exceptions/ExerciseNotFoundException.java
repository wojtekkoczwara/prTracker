package com.app.prTracker.rest.exceptions;

public class ExerciseNotFoundException extends RuntimeException {
    public ExerciseNotFoundException() {
    }

    public ExerciseNotFoundException(String message) {
        super(message);
    }
    public ExerciseNotFoundException(Throwable cause) {
        super(cause);
    }

    public ExerciseNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


    public ExerciseNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
