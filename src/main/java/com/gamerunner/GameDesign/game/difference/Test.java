package com.gamerunner.GameDesign.game.difference;

import java.io.Serializable;

class POJO {
	String name;
	int age;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Age: " + age + "Name: " + name;
	}
}

//3: Needs to implement Serializable interface
class JavaBeans implements Serializable { // EJB
	String name;
	int age;

	// 1: No argument constructor
	public JavaBeans() {
	}

	// 2: Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Test {
	public static void main(String[] args) {

	}
}
