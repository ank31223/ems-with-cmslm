package com.infoobjects.cmslm.service;

import java.util.List;
import java.util.UUID;

import com.infoobjects.cmslm.dao.EmployeeDAO;
import com.infoobjects.cmslm.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO;

	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		// TODO Auto-generated constructor stub
		this.employeeDAO = employeeDAO;
	}

	@Override
	public void addEmployee(Employee employee) {
		UUID uuid = UUID.randomUUID();
		String uuString = uuid.toString();
		employee.setId(uuString);
		employeeDAO.saveEmployee(employee);

	}

	@Override
	public void removeEmployee(String x) {
		employeeDAO.removeEmployee(x);

	}

	@Override
	public Employee getEmployeeById(String nextInt) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(nextInt);
		// return null;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeList();
		// return null;
	}

}
