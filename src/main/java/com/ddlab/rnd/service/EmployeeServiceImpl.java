//package com.ddlab.rnd.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ddlab.rnd.entity.Employee;
//import com.ddlab.rnd.repository.EmployeeRepository;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//	
//	@Autowired
//	private EmployeeRepository empRepo;
//	
//	public void saveAllEmployees(List<? extends Employee> empList) {
//		empRepo.saveAll(empList);
//	}
//
//	@Override
//	public List<Employee> getAllEmployee() {
//		return empRepo.getAll();
//	}
//
//	@Override
//	public List<Employee> getAllEmployeeByDescendingOrderOfCity() {
//		return empRepo.getAllInDescendingOrderOfCity();
//	}
//	
//	@Override
//	public List<Employee> getByName(String name) {
//		return empRepo.getExactName(name);
//	}
//	
//	public List<Employee> getEmployeesByTheirNames(List<String> names) {
//		return empRepo.findByNames(names);
//	}
//
//}
