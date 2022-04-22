package com.monocept.model.test;

import com.monocept.model.*;

public class PersonTest {
	private static void printDetails(Person p1) {
		System.out.println("Id : " + p1.getId() + " Address: " + p1.getAddress() + " dob: " + p1.getDob());
		p1.details();
	}

	public static void main(String[] args) {
		Person s1 = new Students(405, "Kadam vihar", "10/03/2000", "Computer Science and Engineering");
		Professor p1 = new Professor(507, "HolyGate", "12/08/1978", 30000);
		printDetails(s1);
		printDetails(p1);
	}

}
