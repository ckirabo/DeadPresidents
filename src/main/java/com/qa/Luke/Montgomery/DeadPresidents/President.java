package com.qa.Luke.Montgomery.DeadPresidents;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class President {
	Date dateOfBirth;

	String name;
	String placeOfBirth;

	String[] split;

	/*
	 * public President(String name, String dateOfBirth, String placeOfBirth, String
	 * dateOfDeath, String location) { this.name = name; this.dateOfBirth =
	 * dateOfBirth; this.placeOfBirth = placeOfBirth; this.dateOfDeath =
	 * dateOfDeath; this.locationOfDeath = location; }
	 * 
	 * public President(String name, String dateOfBirth, String placeOfBirth) {
	 * this.name = name; this.dateOfBirth = dateOfBirth; this.placeOfBirth =
	 * placeOfBirth;
	 * 
	 * }
	 */

	/*
	 * public President(String[] split) {
	 * 
	 * this.split[0] = name; this.split[1] = dateOfBirth; this.split[2] =
	 * placeOfBirth; }
	 */

	public President(String[] split) {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy", Locale.US);
		
		this.name = split[0];
		try {
			this.dateOfBirth = sdf.parse(split[1]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sdf.applyPattern("MM.dd.yyyy");
		this.placeOfBirth = split[2];

	}

	public String toString() {

		return this.name + " is ALIVE " + this.dateOfBirth + " " + this.dateOfBirth;

	}

}
