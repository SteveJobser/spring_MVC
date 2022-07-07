package com.tlegenov.spring.mvc.controllers;

import com.tlegenov.spring.mvc.model.Employee;
import com.tlegenov.spring.mvc.model.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/askApi")
    public Object askApi() {
        Response response = new Response();
        Employee employee = new Employee();
        employee.setCarBrand("BMW");
        employee.setName("Tim");
        if (employee.getName().contains("Tim")) {
            response.setSuccess(true);
            response.setReason("GREAT");
            return response;
        }
        return employee;
    }
}
