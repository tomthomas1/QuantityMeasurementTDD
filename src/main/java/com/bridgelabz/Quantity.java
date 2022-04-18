package com.bridgelabz;

public class Quantity {
	public boolean compareLength(int checkFeet, int inch) {
		int feet = inch / 12;
		return feet == checkFeet;
	}

}
