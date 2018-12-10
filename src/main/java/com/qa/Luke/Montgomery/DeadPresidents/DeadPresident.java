package com.qa.Luke.Montgomery.DeadPresidents;

public class DeadPresident extends President {

	String dateOfDeath;
	//String locationOfDeath;
	
	public DeadPresident(String[] split) {
		super(split);
		this.dateOfDeath = split[3];
	//	this.locationOfDeath = split[4];

	}

	@Override
	public String toString() {

		return this.name + " is dead " + this.dateOfBirth + " " + this.dateOfDeath;

	}

}
