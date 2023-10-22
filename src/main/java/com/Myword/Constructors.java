package com.Myword;

//Constructor code below

public class Constructors {
	int age;
	String name;

	public Constructors(int age, String name){
	this.age=age;
	this.name=name;
	}
//constructors
	public static void main(String[] args) {
	Constructors obj1=new Constructors(30,"Bob");
	Constructors obj2=new Constructors(32,"Matt");
	Constructors obj3=new Constructors(34,"Matt");
	System.out.println(obj1.age+obj1.name);
	System.out.println(obj2.name);
	}

}
