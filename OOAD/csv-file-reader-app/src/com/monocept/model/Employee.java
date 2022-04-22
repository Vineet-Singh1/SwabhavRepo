package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	private String job;
	private int mgrId;
	private String doj;
	private double salary;
	private double commission;
	private int deptNo;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", mgrId=" + mgrId + ", doj=" + doj
				+ ", salary=" + salary + ", commission=" + commission + ", deptNo=" + deptNo + "]";
	}

	public Employee(int id, String name, String job, int mgrId, String doj, double salary, double commission,
			int deptNo) {
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

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getMgrId() {
		return mgrId;
	}

	public String getDoj() {
		return doj;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

}
