package com.library.bookmark.catalogue.exception;

import lombok.Getter;

@Getter
class ResponseError
{

    private String  message;

    private Integer errorCode;

    public ResponseError(String message)
    {
        this.message = message;
    }

    public ResponseError(Integer errorCode, String message)
    {
        this.errorCode = errorCode;
        this.message = message;
    }

}