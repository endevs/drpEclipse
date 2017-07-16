package com.endevs.Employee;

import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("myEmployeeList")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResource {
	
	EmployeeService employeeService = new EmployeeService();
	private static Map<Long, Employee> employeeDB = EmployeeDataBase.getEmployeeDB();
	
	//http://localhost:8080/Employee/webapi/myEmployeeList
	@GET
	public List<Employee> getListOfEmployee()
	{
		return employeeService.getListOfEmployee();
	}
	
	//http://localhost:8080/Employee/webapi/myEmployeeList/1
	@GET
	@Path("/{empId}")
	public Employee getEmployee(@PathParam("empId") long empId) {
		return employeeDB.get(empId);
	}
	
	//http://localhost:8080/Employee/webapi/myEmployeeList
	@POST
	public Employee addEmployee(Employee emp) {
		return employeeService.addEmployee(emp);
	}
	
	//http://localhost:8080/Employee/webapi/myEmployeeList/11
	@PUT
	@Path("/{empId}")
	public Employee updateEmployee(@PathParam("empId") long empId,Employee emp) {
		emp.setEmpId((int) empId);
		System.out.println("=== "+emp.getEmpId());
		return employeeService.updateEmployee(emp);
	}
	
	
	@DELETE
	@Path("/{empId}")
	public void removeEmployee(@PathParam("empId") long empId) {
		System.out.println("==ss= "+empId);
		 employeeDB.remove(empId);
	}
	
}
