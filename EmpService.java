package Emp.Kit;

import java.util.ArrayList;
import java.util.List;


public class EmpService {
	private final List<Employee> employees =new ArrayList<>();
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
		System.out.print("Employee data added successfully...");
	}
	
	public void viewEmployee()
	{
		if(employees.isEmpty()) {
			System.out.println("no employee to view....");
		}
		else {
			employees.forEach(System.out::println);
		}
	}
	
	public void updateEmployee(int eid,String newEname,double newSalary,String newDes)
	{
		for(Employee employee : employees) 
		{
			if(employee.getEid()==eid) 
			{
				employee.setEname(newEname);
				employee.setSalary(newSalary);
				employee.setDes(newDes);
				System.out.print("Employee details updated...");
				return;
			}
		}
		System.out.println("Employee not found.");
	}
	public void deleteEmployee(int eid) 
	{
		employees.removeIf(e-> e.getEid()==eid);
		{
			System.out.println("given Employee was deleted(if existed)..");
		}
	}

}
