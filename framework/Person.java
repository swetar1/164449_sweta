package framework;

import java.util.Comparator;
import java.util.TreeSet;

public class Person {
	
		String name;
		double weight;
		double height;
		 Person(String name,double weight,double height){
		this.name=name;
		this.weight=weight;
		this.height=height;
		
		}

@Override
public String toString() {
	
	return "name="+this.name+ "--weight="+this.weight+"--height="+this.height; 
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}



}

	
