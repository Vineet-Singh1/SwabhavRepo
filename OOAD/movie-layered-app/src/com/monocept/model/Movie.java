package com.monocept.model;

import java.io.Serializable;

public class Movie implements Serializable {
	private String movieName;
	private String genre;
	private int year;

	
	public Movie(String movieName, String genre, int year) {
		this.movieName = movieName;
		this.genre = genre;
		this.year = year;
		
	}

	public String getName() {
		return movieName;
	}

	public String getGenre() {
		return genre;
	}

	public int getYear() {
		return year;
	}

}
