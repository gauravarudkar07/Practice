package com.util;
import java.lang.Math;

public class Point2D {
	private float x;
	private float y;
	
	public Point2D(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public void getDetails() {
		System.out.println("Point2D = X :"+x+"  Y :"+y);
	}

	public  boolean isEquals(Point2D obj) {   // obj1.isEquals(obj2)
		if(this.x==obj.x && this.y==obj.y) {
			return true;
		}
		return false;
	}
	
	public double calculateDistance(Point2D obj) {
		return Math.sqrt(Math.pow((this.x-obj.x),2)+Math.pow((this.y-obj.y),2));
	}
}