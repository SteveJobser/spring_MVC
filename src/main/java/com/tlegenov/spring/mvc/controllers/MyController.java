package com.tlegenov.spring.mvc.controllers;

import com.tlegenov.spring.mvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
//@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee) {

        return "show-emp-details-view";
    }
}
