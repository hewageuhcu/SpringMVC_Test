package com.example.service;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class cellReaderService {

    public void readCellValue() {
        try {
            // Load the Excel file from resources
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("CW005380-HTOU.xlsx");

            if (inputStream == null) {
                System.out.println("File not found!");
                return;
            }

            // Open workbook
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0); // First sheet (Index 0)
            System.out.println("workbook opened");
            // Read column B (index 1) and row 3 (index 2)
            Row row = sheet.getRow(2);
            String cellValue = "Cell is empty or does not exist.";
            System.out.println("Row opened");

            if (row != null) {
                Cell cell = row.getCell(1); // Column B = Index 1
                System.out.println("Row NOT empty");
                if (cell != null) {
                    cellValue = cell.toString();
                    System.out.println("Cell NOT empty");

                    System.out.println(cellValue);
                }

            }else{
                System.out.println(cellValue);
            }


            // Close resources
            workbook.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
