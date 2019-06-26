package com.startup.damu;



public class Employee {

	int eid;
	String ename;
	String dept;
	
	public Employee() {
		
	}
	public Employee(int eid, String ename, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
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
	public String getdept() {
		return dept;
	}
	public void setdept(String esalary) {
		this.dept = esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + dept + "]";
	}
}
