package br.com.my.church.mychurch.infrastructure.controllers;

public class BaseResponse <T> {
    private T object;
    private Boolean success;
    private String message;
    private Integer enumError;

    public BaseResponse(Boolean success, String message, Integer enumError) {
        this.success = success;
        this.message = message;
        this.enumError = enumError;
    }

    public BaseResponse(T object, String message, Integer enumError) {
        this.object = object;
        this.success = true;
        this.message = message;
        this.enumError = enumError;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getEnumError() {
        return enumError;
    }

    public void setEnumError(Integer enumError) {
        this.enumError = enumError;
    }
}
