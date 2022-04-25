package com.monocept.model;

public class Employee {
	private String id;
	private String name;
	private String job;
	private String mgrId;
	private String doj;
	private String salary;
	private String commission;
	private String deptNo;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", mgrId=" + mgrId + ", doj=" + doj
				+ ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}

	public Employee(String id, String name, String job, String mgrId, String doj, String salary, String commission,
			String deptNo) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.mgrId = mgrId;
		this.doj = doj;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgrId() {
		return mgrId;
	}

	public void setMgrId(String mgrId) {
		this.mgrId = mgrId;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

}
