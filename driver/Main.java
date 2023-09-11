package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.service.Impl.HindiTeacher;

public class Main {

	public static void main(String[] args) {
		
		// create an object of teacher
		Teacher teacher = new HindiTeacher();
		
		// use the object and retrieve the homework of a particular object
		System.out.println(teacher.getHomework());
	}
}
