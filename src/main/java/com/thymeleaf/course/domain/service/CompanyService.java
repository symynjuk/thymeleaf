package com.thymeleaf.course.domain.service;

import com.thymeleaf.course.domain.model.dictionary.Gender;
import com.thymeleaf.course.domain.model.entity.Company;
import com.thymeleaf.course.domain.model.entity.Employee;
import com.thymeleaf.course.domain.model.entity.Skill;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanyService {

    private static final Integer EMPLOYEE_SIZE = 5;

    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        List<String> companiesName = Arrays.asList(
                "EPUM", "SOFT_SERVE", "LUXOFT", "INVENTOR_SOFT"
        );

        for (String aCompaniesName : companiesName) {
            Company company = createCompany(aCompaniesName);
            List<Employee> employees = new ArrayList<>();

            for (int j = 0; j < EMPLOYEE_SIZE; j++) {
                String employeeFirstName = RandomStringUtils.randomAlphabetic(j);
                String employeeLastName = RandomStringUtils.randomAlphabetic(j + 1);
                String employeeEmail = RandomStringUtils.randomAlphabetic(j + 2);
                Employee employee = createEmployee(employeeFirstName, employeeLastName, employeeEmail, company);
                employees.add(employee);
            }

            company.setEmployees(employees);
            companies.add(company);
        }
       return companies;
    }

    private Company createCompany(String companyName) {
         Company company = new Company();
         company.setName(companyName);
         return company;
    }

    private Employee createEmployee(String firstName, String lastName, String email, Company company) {
        Employee employee = new Employee();
        employee.setCompany(company);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setSkill(new Skill("Java"));
        employee.setGender(Gender.MALE);

        return employee;
    }
}
