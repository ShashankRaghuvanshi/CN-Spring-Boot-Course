package com.ico.demo;

public class ShortTable implements Table {

	double height;
	double lenght;
	
	public ShortTable() {
		this.height=15.0;
	    this.lenght=5.5;
	}
	
	@Override
	public String showDetails() {
		return "this is a shot table with the folling dimentions"+this.height+" "+this.lenght;
	}

}
