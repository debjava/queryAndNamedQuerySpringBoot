package com.ddlab.rnd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.Employee;
import com.ddlab.rnd.service.EmployeeService;

@Component
public class AutoRun {
	
	@Autowired
	private EmployeeService empService;
	
	public void saveEmployeeDetails() {
		List<Employee> empList = List.of(new Employee("John", "Bangalore", "Radina", 2000, 23),
				new Employee("Vidya", "Chennai", "BAT", 3000, 27),
				new Employee("Ramesh", "Kottayam", "Appllo Mission", 5000, 29),
				new Employee("Nina", "Hyderabad", "Mars Step", 2000, 33));
		
		empService.saveAllEmployees(empList);
	}
	
	public void showEmployee() {
		empService.getAllEmployee().forEach( emp-> {
			System.out.println("Emp: "+emp);
		});
		
		System.out.println("Employee order by City Descending Order");
		
		empService.getAllEmployeeByDescendingOrderOfCity().forEach( emp-> {
			System.out.println("Emp in Descending order of city: "+emp);
		});
		
		//Find by Name
		empService.getByName("Vidya").forEach( emp-> {
			System.out.println("Emp By Name: "+emp);
		});
		
		// Get all employees by their names
		List<String> names = List.of("Vidya","John","Nina");
		empService.getEmployeesByTheirNames(names).forEach( emp-> {
			System.out.println("Emp By Names: "+emp);
		});
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void run() {
		System.out.println("Application running ...");
		
//		saveEmployeeDetails();
		showEmployee();
		
		System.out.println("DB Operations completed ...");
	}

}
