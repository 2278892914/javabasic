package jdbc;

public class Zround extends Round{
	
	private double h;
	public Zround(double h) {
		this.h=h;
	}
	public double area(double r){
		return 3.14*r*r*h;
	}
	
	
}
