package com.KayaTech.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KayaTech.Data.Employee;

@RestController
public class ControllerClass {
	
	@Autowired
	Employee employee;
	@Autowired
	DataAccessInt dataAcc;
	
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		
		return dataAcc.findAll();
	}	
	
	@GetMapping("/byRolNo/{rolNo}")
	public Employee getEmployee(@PathVariable(value = "rolNo") Long emplrolNo){	
	
		return dataAcc.findByRolNo(emplrolNo);
	}
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee empl) {
		return dataAcc.save(empl);
	}
	
	@DeleteMapping("/delete/{rolNo}")
	public String deleteEmployee(@PathVariable(value = "rolNo") Long id) {
		
		dataAcc.deleteById(id);
		return "DELETED";
	}
	
	
}

