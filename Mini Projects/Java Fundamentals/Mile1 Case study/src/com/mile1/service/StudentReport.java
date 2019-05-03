package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student studentObject) {
		
		int marks[]=studentObject.getMarks();
		
		int total=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<35) return "F";
			else total+=marks[i];
		}
		
		if(total<=150) return "D";
		else if(total<=200) return "C";
		else if(total<=250) return "B";
		else if(total<=300) return "A";
		
		return "D";
	}
	
	public String validate(Student studentObject) throws NullStudentException,NullNameException,NullMarksArrayException{
		if(studentObject.equals(null))
			throw new NullStudentException();
		else {
			if(studentObject.getName().equals(null)) throw new NullNameException();
			if(studentObject.getMarks().equals(null)) throw new NullMarksArrayException();
			
			return findGrade(studentObject);
		}
	}
}
