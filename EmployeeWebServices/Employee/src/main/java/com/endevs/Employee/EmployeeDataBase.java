package com.endevs.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDataBase {
	private static Map<Long,Employee> employeeDB =  new HashMap<Long,Employee>();

	public static Map<Long, Employee> getEmployeeDB() {
		return employeeDB;
	}
	
}
