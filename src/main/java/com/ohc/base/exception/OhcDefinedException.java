package com.ohc.base.exception;

/**
 * @author ohc
 * @version 1.0
 * @description TODO
 * @date 2022/10/10 9:14
 */
public class OhcDefinedException extends RuntimeException {

    private String errMessage;

    public OhcDefinedException() {
        super();
    }

    public OhcDefinedException(String message) {
        super(message);
        this.errMessage = message;
    }

    public String getErrMessage(){
        return errMessage;
    }

    public static void cast(String errMessage){
        throw new OhcDefinedException(errMessage);
    }
    public static void cast(CommonError commonError){
        throw new OhcDefinedException(commonError.getErrMessage());
    }
}
