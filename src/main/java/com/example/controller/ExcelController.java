package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.service.ExcelService;



@Controller
public class ExcelController {

    @Autowired
    private ExcelService ExcelService;

    @GetMapping("/read")

    public String readData(Model model) {
        ExcelService.readExcelFile();

        return "excel";
    }

}

