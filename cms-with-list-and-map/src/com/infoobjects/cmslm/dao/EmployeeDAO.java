package com.infoobjects.cmslm.dao;

import java.util.ArrayList;
import java.util.List;

import com.infoobjects.cmslm.dto.Employee;

public class EmployeeDAO {
	// Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	List<Employee> employeeList = new ArrayList<Employee>();

	public void saveEmployee(Employee employee) {
		// employeeMap.put(employee.getId(), employee);
		employeeList.add(employee);

	}

	public void removeEmployee(String x) {
		// employeeMap.remove(x);
		int i = 0;
		for (Employee employee : employeeList) {
			if (employee.getName().equals(x)) {
				employeeList.remove(i);
				break;
			}
			i++;
		}

	}

	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();

		for (Employee employee : employeeList) {
			if (employee.getName().equals(id)) {
				emp = employee;
				break;
			}
		}
		return emp;
		// return employeeMap.get(id);

	}

	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeList;
		// return new ArrayList<>(employeeMap.values());

	}
}
