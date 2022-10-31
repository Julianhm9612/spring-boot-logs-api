package com.example.springbootlogsapi.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootlogsapi.utils.GenericResponse;
import com.example.springbootlogsapi.utils.InfoLog;

@RestController
public class LogController {

    @GetMapping(path = "info")
    public ResponseEntity<Object> info() {
        new InfoLog("Usuari@", getClass().getCanonicalName(), "Consultar información");
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping(path = "error")
    public ResponseEntity<Object> error() {
        try {
            Integer result = 10 / 0;
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(
                GenericResponse.errorResponse("Usuari@", getClass().getCanonicalName(), e.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

    @GetMapping(path = "trace")
    public ResponseEntity<Object> trace() {
        UUID uuid = UUID.randomUUID();
        try {
            // Query
            new InfoLog(uuid, "Usuari@", getClass().getCanonicalName(), "Consultar información");
            // Save data
            new InfoLog(uuid, "Usuari@", getClass().getCanonicalName(), "Guardar información");
            Integer result = 10 / 0;
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(
                GenericResponse.errorResponse("Usuari@", getClass().getCanonicalName(), e.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }

}
