package com.ico.demo;

public class LongTable implements Table{
	
	double height;
	double lenght;
	
	public LongTable() {
		this.height=30.0;
	    this.lenght=10.5;
	}
	
	@Override
	public String showDetails() {
		return "this is a long table with the folling dimentions"+this.height+" "+this.lenght;
	}
}
