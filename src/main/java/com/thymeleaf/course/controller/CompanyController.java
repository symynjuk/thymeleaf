package com.thymeleaf.course.controller;

import com.thymeleaf.course.domain.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    @GetMapping
    public String getCompanies(Model model){
        model.addAttribute("companies", companyService.getAllCompanies());
        return "company";
    }
}
