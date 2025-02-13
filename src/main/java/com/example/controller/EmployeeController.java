package com.example.controller;

import com.example.util.DBUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployeeData() {
        // Call the utility class to get employee data from DB
        DBUtil.getEmployeeData();
        return "employee"; // Return to a view (you can display any message or data in the view)
    }
}
