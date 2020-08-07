package com.KayaTech.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import com.KayaTech.Data.Employee;

@Component
public interface DataAccessInt extends JpaRepository<Employee, Long>{

    Employee findByRolNo(Long no);
    void deleteByNames(String name);
	
}