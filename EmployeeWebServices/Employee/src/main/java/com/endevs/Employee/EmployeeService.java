package com.endevs.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmployeeService {

	private static Map<Long, Employee> employeeDB = EmployeeDataBase.getEmployeeDB();
	
	public EmployeeService() {
		employeeDB.put(1L, new Employee("Raj" , 11));
		employeeDB.put(2L, new Employee("DharmaRaj" , 22));
		employeeDB.put(3L, new Employee("Panigrahi" , 33));
	}
	
	
	public List<Employee> getListOfEmployee() {
		return new ArrayList<Employee>(employeeDB.values());
	}

	public Employee getEmployee(long empId) {
		return employeeDB.get(empId);
	}

	public Employee addEmployee(Employee emp) {
		emp.setEmpId(employeeDB.size() + 1);
		employeeDB.put((long) emp.getEmpId(), emp);
		return emp;
	}

	public Employee updateEmployee(Employee emp) {
		if(emp.getEmpId() >= 0) {
			return null;
		}
		employeeDB.put((long) emp.getEmpId(), emp);
		return emp;
	}

	public Employee removeEmployee(long empId) {
		return employeeDB.remove(empId);
	}

}
