package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class IspViolationTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();
		atTheWorkStation(m);
		atTheWorkStation(r);

		atTheCafeteria(m);
		atTheCafeteria(r);
	}

	public static void atTheWorkStation(IWorker obj) {
		System.out.println("At the Workstation");
		obj.startWork();
		obj.stopWork();
	}

	public static void atTheCafeteria(IWorker obj) {
		System.out.println("At the Cafeteria");
		obj.startEat();
		obj.stopEat();
	}
}
