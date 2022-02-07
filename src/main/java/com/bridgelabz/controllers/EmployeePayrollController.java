package com.bridgelabz.controllers;

import com.bridgelabz.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeedata")
public class EmployeePayrollController {

    @RequestMapping(value={ "","/","get"})
    public ResponseEntity<String> getEmployeePayerollData(){
       return new ResponseEntity<String>("Get call success",HttpStatus.OK);
    }

    @GetMapping("/get/{empid}")
    public ResponseEntity<String> getEmployeePayerollData(@PathVariable("empid") int empid){
        return new ResponseEntity<String>("Get call success for id ",HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayerollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("Created Employee payroll data :"+employeePayrollDTO,HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateEmployeePayerollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        return new ResponseEntity<String>("update Employee payroll data for id:"+employeePayrollDTO,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayerollData(@PathVariable("empid")int empid)  {
        return new ResponseEntity<String>("Employee payroll data for id:"+empid,HttpStatus.OK);
    }


}
