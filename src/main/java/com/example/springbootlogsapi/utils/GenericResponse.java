package com.example.springbootlogsapi.utils;

import java.util.UUID;

public class GenericResponse {

    private static ErrorLog errorLog;

    public static GenericError errorResponse(String user, String className, String message) {
        errorLog = new ErrorLog(user, className, message);
        return new GenericError(500, ConstantProperties.MESSAGE_INTERNAL_SERVER_ERROR + errorLog.getUuid());
    }

    public static GenericError errorResponse(UUID uuid, String user, String className, String message) {
        errorLog = new ErrorLog(uuid, user, className, message);
        return new GenericError(500, ConstantProperties.MESSAGE_INTERNAL_SERVER_ERROR + errorLog.getUuid());
    }

}
