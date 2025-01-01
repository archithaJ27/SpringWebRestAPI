package com.archi.SpringWebRestAPI.Controller;

import com.archi.SpringWebRestAPI.dto.EmployeeDTO;
import com.archi.SpringWebRestAPI.entities.EmpEntity;
import com.archi.SpringWebRestAPI.repositories.EmpRepo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {
    private final EmpRepo empRepo;

    public EmployeeController(EmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @GetMapping("/{empId}")
    public EmpEntity getEmployeeId(@PathVariable(name="empId") Long id){
        return empRepo.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmpEntity> getAllEmployees(){
        return empRepo.findAll();
    }
    @PostMapping
    public EmpEntity addEmployee(@RequestBody EmpEntity inputDto){
        return empRepo.save(inputDto);
    }
}
