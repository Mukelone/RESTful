package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.o7planning.restfulcrud.model.Employee;

public class EmployeeDAO {

	private static final Map<String, Employee> empMap = new HashMap<String, Employee>();

	static {

		initEmps();

	}

	private static void initEmps() {

		Employee employee1 = new Employee("1", "Michele", "Java Dev");
		Employee employee2 = new Employee("2", "Ajeje", "PM");
		Employee employee3 = new Employee("3", "Brazov", "Mananger");

		empMap.put(employee1.getEmpNo(), employee1);
		empMap.put(employee2.getEmpNo(), employee2);
		empMap.put(employee3.getEmpNo(), employee3);

	}

	// GET
	public static Employee getEmployee(String empNo) {

		Employee emp = empMap.get(empNo);

		return emp;
	}

	// PUT
	public static Employee addEmployee(Employee emp) {

		empMap.put(emp.getEmpNo(), emp);

		return emp;
	}

	// UPDATE
	public static Employee updateEmployee(Employee emp) {

		empMap.put(emp.getEmpNo(), emp);

		return emp;
	}

	// DELETE
	public static void deleteEmployee(String empNo) {

		empMap.remove(empNo);
	
	}

	// REMOVE ALL EMPLOYEES
	public static List<Employee> getAllEmployees() {

		Collection<Employee> c = empMap.values();
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.addAll(c);

		return listOfEmployees;
	}
}
