package com.ddlab.rnd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Query(name = "Employee.query1") // Name declared in @NamedQuery
	List<Employee> getAll();
	
	@Query(name = "Employee.query2") // Name declared in @NamedQuery
	List<Employee> getAllInDescendingOrderOfCity();
	
	List<Employee> findByName(@Param("name") String name); // Normal JPA Query
	
	// findByName has been declared as @NamedQuery(name = "User.findByName", ...)
	@Query(name = "User.findByName")
	List<Employee> getExactName(@Param("name") String name); 
	
	// Normal query without the use of NamedQuery
	@Query("SELECT e FROM Employee e WHERE e.name in :names")
	List<Employee> findByNames(@Param("names") List<String> names); 
}
