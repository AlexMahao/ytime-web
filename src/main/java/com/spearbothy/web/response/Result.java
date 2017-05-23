package com.spearbothy.web.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Alex_MaHao on 2017/5/23.
 */
@Accessors(chain = true)
@NoArgsConstructor
@Setter
@Getter
public class Result<T> {
    private int code;

    private String message;

    private T data;


    public void setResultCode(ResultCode code){
        this.code = code.code();
        this.message = code.msg();
    }


}
