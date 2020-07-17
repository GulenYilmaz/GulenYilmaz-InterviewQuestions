package Introductor__Hsn__OOP01;

public class Animal {
	
	String color;
	int age, weight;
	
	public Animal() {
		System.out.println("I am non argument construtor inside Animal Class");
	}
	
	public Animal(String color, int age, int weight) {
		this.color=color;
		this.age=age;
		this.weight=weight;
	}
}