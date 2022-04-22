package com.monocept.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class MovieStore implements Serializable {
	public static final long serialversionUID = -2345665434566543L;
	private int id[] = new int[5];
	private int year[] = new int[5];
	private String name[] = new String[5];
	private String genre[] = new String[5];

	public int count = 0;

	public void addMovie() {
		if (count >= 5) {
			System.out.println("Movie Store is Full");
			return;
		}
		Scanner sc = new Scanner(System.in);
		id[count] = count + 100;
		System.out.print("Enter movie name: ");

		this.name[count] = sc.nextLine();
		System.out.print("\nEnter movie genre: ");
		this.genre[count] = sc.nextLine();
		System.out.print("\nEnter movie year: ");
		this.year[count] = sc.nextInt();
		count++;
	}

	public void displayMovies() {
		if (count == 0) {
			System.out.println("No movies available");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("id: " + id[i]);
			System.out.println("Name: " + name[i]);
			System.out.println("Genre: " + genre[i]);
			System.out.println("Year: " + year[i] + "\n");

		}
	}

	public void displayFile() {
		if (new File("resources//movie_details.txt").length() == 0) {
			System.out.println("No movies available");
			return;
		} else {
			try {
				FileInputStream file = new FileInputStream("resources//movie_details.txt");
				ObjectInputStream in = new ObjectInputStream(file);
				MovieStore store = (MovieStore) in.readObject();
				for (int i = 0; i < store.count; i++) {
					System.out.println("id: " + store.id[i]);
					System.out.println("Name: " + store.name[i]);
					System.out.println("Genre: " + store.genre[i]);
					System.out.println("Year: " + store.year[i] + "\n");

				}
				in.close();
				file.close();
			} catch (Exception ex) {
				System.out.println("Exception is caught");
			}

		}

	}

	public void saveState() {
		try {
			FileOutputStream file = new FileOutputStream("resources//movie_details.txt");
			ObjectOutputStream oos = new ObjectOutputStream(file);

			oos.writeObject(this);

			oos.close();
			file.close();

			System.out.println("\n Seriallisation successfull");
		} catch (Exception ex) {
			System.out.println("Exception is caught in Save state");
		}
	}

	public MovieStore restoreState() {
		MovieStore store = new MovieStore();
		try {
			if (new File("resources//movie_details.txt").length() == 0)
				return store;
			FileInputStream file = new FileInputStream("resources//movie_details.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			store = (MovieStore) in.readObject();

			in.close();
			file.close();
		} catch (Exception ex) {
			System.out.println("Exception is caught in restore state");

		}
		System.out.println("\n State restored successfully");
		return store;
	}

	public void clearAll() throws FileNotFoundException, IOException {
		// ClearingObject
		Arrays.fill(name, null);
		Arrays.fill(genre, null);
		Arrays.fill(year, 0);
		Arrays.fill(id, 0);
		count = 0;

		// Clearing File
		new FileOutputStream("resources//movie_details.txt").close();
		System.out.println("Data cleared");
	}
}
