package com.udemy.java.masterclass.codingexercises.section06;

public class ComplexNumber {

	private double real;
	private double imaginary;

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void add(ComplexNumber number) {
		real += number.getReal();
		imaginary += number.getImaginary();
	}

	public void add(double real, double imaginary) {
		add(new ComplexNumber(real, imaginary));
	}

	public void subtract(ComplexNumber number) {
		real -= number.getReal();
		imaginary -= number.getImaginary();
	}

	public void subtract(double real, double imaginary) {
		subtract(new ComplexNumber(real, imaginary));
	}

}
