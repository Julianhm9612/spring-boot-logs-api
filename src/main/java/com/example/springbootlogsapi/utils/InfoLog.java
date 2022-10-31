package com.example.springbootlogsapi.utils;

import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class InfoLog {
    
    private UUID uuid;
    private String user;
    private String className;
    private String message;
    private static final Log LOG = LogFactory.getLog("custom-logs");

    public InfoLog(String className, String message) {
        this.uuid = UUID.randomUUID();
        this.className = className;
        this.message = message;
        LOG.info("UUID: " + getUuid() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public InfoLog(UUID uuid, String className, String message) {
        this.uuid = uuid;
        this.className = className;
        this.message = message;
        LOG.info("UUID: " + getUuid() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public InfoLog(String user, String className, String message) {
        this.uuid = UUID.randomUUID();
        this.className = className;
        this.message = message;
        this.user = user;
        LOG.info("UUID: " + getUuid() + " User: " + getUser() + " Class: " + getClassName() + " Message: " + getMessage());
    }

    public InfoLog(UUID uuid, String user, String className, String message) {
        this.uuid = uuid;
        this.className = className;
        this.message = message;
        this.user = user;
        LOG.info("UUID: " + getUuid() + " User: " + getUser() + " Class: " + getClassName() + " Message: " + getMessage());
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
