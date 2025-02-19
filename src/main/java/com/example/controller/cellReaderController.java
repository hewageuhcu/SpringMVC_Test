package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.service.cellReaderService;



@Controller
public class cellReaderController {

    @Autowired
    private cellReaderService cellReaderService;

    @GetMapping("/cell")

    public String readData(Model model) {
      cellReaderService.readCellValue();

        return "cell";
    }

}

