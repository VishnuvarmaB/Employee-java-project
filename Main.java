package Emp.Kit;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		EmpService ser=new EmpService();
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do 
		{
			System.out.println(".........Employee Management System........");
			System.out.println("1.Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("0.Exit");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) 
			{
			case 1->{
				System.out.print("Enter Employee id:");
				int eid =sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Employee name:");
				String ename=sc.nextLine();
				System.out.print("Enter Employee salary:");
				double salary=sc.nextDouble();
				System.out.print("Enter the Employee Designation:");
				String des=sc.nextLine();
				sc.nextLine();
				ser.addEmployee(new Employee(eid,ename,salary,des));
			}
			case 2-> ser.viewEmployee();
			
			case 3-> {
				System.out.print("Enter Employee ID to update:");
				int eid =sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the new Employee name:");
				String newEname=sc.nextLine();
				System.out.print("Enter the new Employee salary:");
				double newSalary=sc.nextDouble();
				System.out.print("Enter the new Employee designation:");
				String newDes=sc.nextLine();
				sc.nextLine();
				ser.updateEmployee(eid,newEname,newSalary,newDes);
			}
			case 4-> {
				System.out.print("Enter ID to delete the Employee:");
				int eid=sc.nextInt();
				ser.deleteEmployee(eid);
			}
			case 0-> System.out.print("Exiting......");
			default-> System.out.println("Please Enter a valid choice....!");
			}
		}while(choice!=0);

	}

}
