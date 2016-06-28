package com.im4j.kakacache.rxjava.common.exception;

/**
 * 找不到目标的错误
 * @version 0.1 alafighting 2016-04
 */
public class NotFoundException extends Exception {

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public NotFoundException(Throwable throwable) {
        super(throwable);
    }

}
