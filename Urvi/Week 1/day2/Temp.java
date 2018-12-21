package com.training.sdet.day2;

//Final variables/classes cannot be inherited or overwritten
class Room{
	void dimensions(){}
}

class Classroom extends Room{
	
	@Override
	void dimensions(){};
}

//class MyString extends String{}

public class Temp {
	public static void main(String[] args) {
		String str;
		final int CAPACITY = 222;
	}

}
