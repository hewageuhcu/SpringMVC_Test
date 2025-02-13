package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    // Display the form
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("api", "Employee Information");
        return "form";  // This corresponds to form.jsp
    }

    // Handle the form submission
    @PostMapping("/submit")
    public String submitForm(@RequestParam("emp_id") String empId,
                             @RequestParam("first_name") String firstName,
                             @RequestParam("last_name") String lastName,
                             @RequestParam("email") String email,
                             @RequestParam("salary") Double salary,
                             Model model) {

        // You can handle the form data here, for example, save it to a database

        // Add the received data to the model to show it to the user
        model.addAttribute("empId", empId);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("salary", salary);

        // Show a confirmation or success message
        return "formSuccess";  // You will create this JSP file to display the confirmation
    }
}
