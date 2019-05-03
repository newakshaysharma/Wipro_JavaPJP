package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	
	static Student data[];
	
	static {
		//Sample input 1
		data=new Student[4];
		for(int i=0;i<data.length;i++) 
			data[i]=new Student();
		
		data [0] = new Student ("Sekar", new int [] {35, 35, 35});
		data [1] = new Student(null,new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("Manoj", null);
		
		
		//Test cases
		/*data=new Student[6];
		for(int i=0;i<data.length;i++) 
			data[i]=new Student();
		
		data[0]=new Student("Mps", new int[] {92, 92, 92}); // TC1
		data[1]=new Student("SINGH", new int[] {35, 35, 40}); //TC2
		data[2]=new Student("KING", new int[] {20, 40, 50}); //TC3
		data[3]=null;//TC4
		data[4]=new Student(null, new int[] {92, 92, 92}); // TC5
		data[5]=new Student("Mps", null); // TC6*/
		
		
		
		//Sample input 2
		/*data=new Student[8];
		for(int i=0;i<data.length;i++) 
			data[i]=new Student();
		data [0] = new Student ("A1", new int [ ] {72, 73, 74});
		data [1] = new Student ("B1", new int [ ] {75, 76, 77});
		data [2] = new Student ("C1", new int[ ] {99, 99, 99});
		data [3] = new Student ("C3", new int[ ] {100, 100, 99});
		data [4] = new Student ("B2", new int[ ] {13, 88, 13});
		data [5] = new Student ("C3", new int[ ] {14, 14, 99});
		data [6] = new Student ("A2", new int[ ] {77, 55, 12});
		data [7] = new Student ("A5", new int[ ] {13, 88, 13});*/
	}
	
	public static void main(String[] args) {
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentException e) {
				x = "NullStudentException occured";
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " +
								studentService.findNumberOfNullMarks(data));//TC8
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(data));//TC7
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));//TC9
	}
}
