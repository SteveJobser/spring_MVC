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
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments =  new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR","Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Audi", "Audi");
        carBrands.put("MB", "Mercedes-Benz");
        carBrands.put("BMW", "BMW");

        languageList = new HashMap<>();
        languageList.put("EN", "English");
        languageList.put("DE", "Deutsch");
        languageList.put("FR", "French");
    }
}
