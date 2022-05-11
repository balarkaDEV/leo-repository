package com.leo.med.hospital.service.advice;

import com.leo.med.hospital.service.exception.HospitalServiceBusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HospitalServiceAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(HospitalServiceAdvice.class);

    @ExceptionHandler(HospitalServiceBusinessException.class)
    public ResponseEntity<String> handleBusinessException(HospitalServiceBusinessException exception){
        if(exception.getErrorMessage() != null)
            return new ResponseEntity<String>(exception.getErrorMessage(), HttpStatus.NOT_FOUND);
        else
            return new ResponseEntity<String>("Record not found", HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception exception){
        LOGGER.error("Exception occurred:" + exception.getMessage());
        exception.printStackTrace();
        return new ResponseEntity<String>("A generic exception occurred", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
