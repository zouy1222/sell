package com.imooc.exeception;

import com.imooc.enums.ResultEnum;

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

    public SellException(Integer code, String message){
        //TODO
        super(message);
        this.code=code;
    }
}
