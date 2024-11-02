package com.soa.skybluehotel.exception;

/**
 * @author Simpson Alfred
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
