package isp.solution.test;

import isp.solution.IEater;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspSolutionTest {
	public static void main(String[] args) {
		Manager m = new Manager();
		Robot r = new Robot();
		atTheWorkStation(m);
		atTheWorkStation(r);

		atTheCafeteria(m);
		//atTheCafeteria(r);
	}

	public static void atTheWorkStation(IWorker obj) {
		System.out.println("At the Workstation");
		obj.startWork();
		obj.stopWork();
	}

	public static void atTheCafeteria(IEater obj) {
		System.out.println("At the Cafeteria");
		obj.startEat();
		obj.stopEat();
	}
}
