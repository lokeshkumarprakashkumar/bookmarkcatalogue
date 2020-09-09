package com.library.bookmark.catalogue.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler
{

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request)
    {
        return buildResponseEntity(new ResponseError(ex.getBindingResult().getAllErrors().get(0).getDefaultMessage()), status);
    }

    private ResponseEntity<Object> buildResponseEntity(ResponseError apiError, HttpStatus status)
    {
        return new ResponseEntity<>(apiError, status);
    }
    
    @ExceptionHandler(value = {TransactionNotFoundException.class})
    protected ResponseEntity<Object> handleTransactionNotFoundException(RuntimeException ex, WebRequest request)
    {
        return buildResponseEntity(new ResponseError(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
