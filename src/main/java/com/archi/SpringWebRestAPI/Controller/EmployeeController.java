package com.archi.SpringWebRestAPI.Controller;

import com.archi.SpringWebRestAPI.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    @GetMapping("/{empId}")
    public EmployeeDTO getEmployeeId(@PathVariable(name="empId") Long id){
        return new EmployeeDTO(id,"rakesh","archithajanjitala@gmail.com",24,LocalDate.of(2024,12,31),true);
    }
}
