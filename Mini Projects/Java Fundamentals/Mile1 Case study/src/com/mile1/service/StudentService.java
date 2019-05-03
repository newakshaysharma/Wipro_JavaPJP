package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	
	public int findNumberOfNullMarks(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].getMarks().equals(null)) {
				count++;
			}
		}
		
		return count;
	}
	
	public int findNumberOfNullNames(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].getName().equals(null)) {
				count++;
			}
		}
		
		return count;
	}

	public int findNumberOfNullObjects(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i].equals(null)) {
				count++;
			}
		}
		
		return count;
	}
}
