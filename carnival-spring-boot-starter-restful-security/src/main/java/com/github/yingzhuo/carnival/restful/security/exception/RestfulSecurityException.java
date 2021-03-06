/*
 *  ____    _    ____  _   _ _____     ___    _
 * / ___|  / \  |  _ \| \ | |_ _\ \   / / \  | |
 * | |    / _ \ | |_) |  \| || | \ \ / / _ \ | |
 * | |___/ ___ \|  _ <| |\  || |  \ V / ___ \| |___
 * \____/_/   \_\_| \_\_| \_|___|  \_/_/   \_\_____|
 *
 * https://github.com/yingzhuo/carnival
 */
package com.github.yingzhuo.carnival.restful.security.exception;

/**
 * @author 应卓
 */
public class RestfulSecurityException extends RuntimeException {

    private static final long serialVersionUID = -3491211983113582542L;

    public RestfulSecurityException() {
        super();
    }

    public RestfulSecurityException(String message) {
        super(message);
    }

    public RestfulSecurityException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestfulSecurityException(Throwable cause) {
        super(cause);
    }

    public RestfulSecurityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
