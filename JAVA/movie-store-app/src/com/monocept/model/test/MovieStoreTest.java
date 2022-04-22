package com.monocept.model.test;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.MovieStore;

public class MovieStoreTest {
	public static void main(String[] args) throws IOException {
		MovieStore store = new MovieStore();
		System.out.println("Welcome to movie store developed by: Vineet Singh");
		int i = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Movies Count - " + store.count + "/5");
			System.out.println("Enter your choice : \n1.Add\n2.Display\n3.ClearAll\n4.Exit");

			int n = sc.nextInt();
			if (n == 1) {
				store.addMovie();
			} else if (n == 2) {
				store.displayMovies();
			} else if (n == 3) {
				store.clearAll();

			} else if (n == 4) {
				break;
			} else {
				System.out.println("Wrong Choice");
			}
		}
		store.saveState();
		store.restoreState();
		store.displayFile();

	}

}
