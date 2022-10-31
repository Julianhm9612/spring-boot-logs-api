package com.example.springbootlogsapi.utils;

import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ErrorLog {

    private UUID uuid;
    private String user;
    private String className;
    private String message;
    private static final Log LOG = LogFactory.getLog("custom-logs");

    public ErrorLog(String className, String message) {
        this.uuid = UUID.randomUUID();
        this.className = className;
        this.message = message;
        LOG.error("UUID: " + getUuid() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public ErrorLog(UUID uuid, String className, String message) {
        this.uuid = uuid;
        this.className = className;
        this.message = message;
        LOG.error("UUID: " + getUuid() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public ErrorLog(String user, String className, String message) {
        this.uuid = UUID.randomUUID();
        this.className = className;
        this.message = message;
        this.user = user;
        LOG.error("UUID: " + getUuid() + " User: " + getUser() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public ErrorLog(UUID uuid, String user, String className, String message) {
        this.uuid = uuid;
        this.className = className;
        this.message = message;
        this.user = user;
        LOG.error("UUID: " + getUuid() + " User: " + getUser() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
