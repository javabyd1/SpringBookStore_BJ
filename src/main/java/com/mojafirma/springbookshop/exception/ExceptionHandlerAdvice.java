package com.mojafirma.springbookshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handleException(BookNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "Nie znaleziono rekordu", "Błąd"));
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity handleException(AuthorNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "Nie znaleziono rekordu", "Błąd"));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity handleException(CategoryNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "Nie znaleziono rekordu", "Błąd"));
    }

    @ExceptionHandler(PublisherNotFoundException.class)
    public ResponseEntity handleException(PublisherNotFoundException e) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "Nie znaleziono rekordu", "Błąd"));
    }
}
