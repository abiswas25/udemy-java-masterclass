package com.udemy.java.masterclass.codingexercises.section06;

public class Point {

	private int x;
	private int y;

	public double distance(Point b) {
		return Math.sqrt(Math.pow(b.getX() - this.x, 2) + Math.pow(b.getY() - this.y, 2));
	}

	public double distance(int x, int y) {
		return distance(new Point(x, y));
	}

	public double distance() {
		return distance(new Point());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0, 0);
	}

}
