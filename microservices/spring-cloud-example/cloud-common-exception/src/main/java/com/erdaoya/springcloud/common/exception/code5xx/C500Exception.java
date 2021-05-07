package com.erdaoya.springcloud.common.exception.code5xx;


import com.erdaoya.springcloud.common.exception.RESTfull5xxBaseException;
import com.erdaoya.springcloud.common.exception.util.ErrorUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class C500Exception extends RESTfull5xxBaseException implements Serializable {

    private static final long serialVersionUID = 3292618827942305707L;

    public C500Exception(String message) {
        super(message);
    }
    public C500Exception(String message,Error error){
        super(ErrorUtil.appendError(message,error));
    }
}
