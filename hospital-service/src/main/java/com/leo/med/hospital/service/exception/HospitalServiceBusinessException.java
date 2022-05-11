package com.leo.med.hospital.service.exception;

public class HospitalServiceBusinessException extends RuntimeException {

    private String errorCode;
    private String errorMessage;

    public HospitalServiceBusinessException(){
        super();
    }

    public HospitalServiceBusinessException(String errorMessage) {
        super();
        this.errorMessage = errorMessage;
    }

    public HospitalServiceBusinessException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
