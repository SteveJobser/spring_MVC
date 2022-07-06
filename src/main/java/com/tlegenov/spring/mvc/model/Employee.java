package com.tlegenov.spring.mvc.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@ToString
public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departments;

    public Employee() {
        departments =  new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales", "Sales");
    }
}
