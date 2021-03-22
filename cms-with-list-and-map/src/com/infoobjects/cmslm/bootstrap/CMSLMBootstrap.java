package com.infoobjects.cmslm.bootstrap;

import java.util.Scanner;

import com.infoobjects.cmslm.controller.EmployeeController;
import com.infoobjects.cmslm.controller.EmployeeControllerImpl;
import com.infoobjects.cmslm.dao.EmployeeDAO;
import com.infoobjects.cmslm.dto.Employee;
import com.infoobjects.cmslm.service.EmployeeService;
import com.infoobjects.cmslm.service.EmployeeServiceImpl;

/**
 * 
 * @author ankit
 *
 */
public class CMSLMBootstrap {

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAO();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDAO);
		EmployeeController employeeController = new EmployeeControllerImpl(scanner, employeeService);

		while (true) {
			System.out.print(
					"\n the choices\n 1.add\n 2.delete\n 3.update\n 4.showAllEmployees \n 5.showEmployeeById\n 6.exit=-1");
			System.out.print("\n Enter the choice\n");
			int choice = scanner.nextInt();
			if (choice == -1) {
				break;
			}

			switch (choice) {
			case 1:
				try {
				employeeController.addEmployee();
				}catch(Exception e) {
					System.out.print("the error is "+e);
				}
				break;
			case 2:
				employeeController.removeEmployee();
//				System.out.println("enter the employee id you want to delete");
//				int x = scanner.nextInt();
//				employeeDAO.removeEmployee(x);
				break;
			case 3:
				employeeController.updateEmployee();
//				System.out.println("Enter the employee id you want to update");
//				Employee emp = employeeDAO.getEmployeeById(scanner.nextInt());
//				System.out.println(emp);
//				System.out.println("Update employee name,age,contactNo and email");
//				System.out.println("update name");
//				emp.setName(scanner.next());
//				System.out.println("update age");
//				emp.setAge(scanner.nextInt());
//				System.out.println("update contact no");
//				emp.setContactNo(scanner.nextLong());
//				System.out.println("update email");
//				emp.setEmail(scanner.next());
//				//employeeDAO.saveEmployee(emp);
//				System.out.println("Details updated to");
//				System.out.println(emp);
				break;
			case 4:
				employeeController.showAllEmployee();
				
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}

}
