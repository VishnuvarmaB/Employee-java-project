package Emp.Kit;

public class Employee {
	private int eid;
	private String ename;
	private double salary;
	private String des;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Employee(int eid, String ename, double salary, String des) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.des = des;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", des=" + des + "]";
	}
	
	

}
