package com.tlegenov.spring.mvc.model;

import lombok.Data;

@Data
public class Response {
    private boolean success;
    private String reason;
}
