package org.o7planning.restfulcrud.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.o7planning.restfulcrud.dao.EmployeeDAO;
import org.o7planning.restfulcrud.model.Employee;

@Path("/employees")
public class EmployeeService {
	
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Employee> getEmployees_JSON(){
		
		List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();
		
		return listOfCountries;
		
	}
	
	@GET
	@Path("/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee getEmployee(@PathParam("empNo") String empNo){
		
		return EmployeeDAO.getEmployee(empNo);
		
	}

	@POST
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee addEmployee(Employee emp) {
		
		return EmployeeDAO.addEmployee(emp);
		
	}
	
	@PUT
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee updateEmployee(Employee emp) {
		
		return EmployeeDAO.updateEmployee(emp);
		
	}
	
	@DELETE
	@Path("/{empNo}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void deleteEmployee(@PathParam("empNo") String empNo) {
		
		EmployeeDAO.deleteEmployee(empNo);
	
	}
}
