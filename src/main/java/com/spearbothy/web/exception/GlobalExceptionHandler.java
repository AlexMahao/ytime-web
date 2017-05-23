package com.spearbothy.web.exception;

import com.fasterxml.jackson.databind.deser.Deserializers;
import com.spearbothy.web.response.Result;
import com.spearbothy.web.response.ResultCode;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常
 * Created by Alex_MaHao on 2017/5/23.
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    /**
     * 传入参数错误异常处理
     */
    @ExceptionHandler(value = {ParamsException.class, MethodArgumentTypeMismatchException.class, MissingServletRequestParameterException.class})
    @ResponseBody
    public Result<String> defaultBaseErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Result<String> result = new Result<>();
        result.setResultCode(ResultCode.ERROR_REQUEST_PARAMS);
        e.printStackTrace();
        return result;
    }

    /**
     *  基类异常处理
     */
    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Result<String> defaultBaseErrorHandler(HttpServletRequest req, BaseException e) throws Exception {
        Result<String> result = new Result<>();
        result.setResultCode(ResultCode.ERROR_DEFAULT);
        e.printStackTrace();
        return result;
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<String> defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        Result<String> result = new Result<>();
        result.setResultCode(ResultCode.ERROR_DEFAULT);
        e.printStackTrace();
        return result;
    }

}
