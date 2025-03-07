package com.example.emp_backend.service.implementation;

import com.example.emp_backend.dto.EmployeeDto;
import com.example.emp_backend.entity.Employee;
import com.example.emp_backend.mapper.EmployeeMapper;
import com.example.emp_backend.repository.EmployeeRepository;
import com.example.emp_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto){

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
