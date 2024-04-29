package geoMetry;
import java.util.ArrayList;

public abstract class Shapes {
	
	private ArrayList<Shapes> shapes;
	double circumference;
	double area;
	double addedArea;
	
	public abstract double calculateCircumference();
	public abstract double calculateArea();
	
	public ArrayList<Shapes> getShapes() {
		return shapes;
	}
	public void setShapes(ArrayList<Shapes> shapes) {
		this.shapes = shapes;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
