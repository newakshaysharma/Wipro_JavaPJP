package assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
	

	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name");
		String filenamein=sc.nextLine();
		
		System.out.println("Enter the output file name");
		String filenameout=sc.nextLine();
		
		File filein=new File(filenamein);
		File fileout=new File(filenameout);
	
		BufferedReader br=new BufferedReader(new FileReader(filein));
		BufferedWriter bw=new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while((ch=br.read())!=-1)
		{
			bw.write(ch);
		}
		System.out.println("File is copied.");
		bw.close();
		br.close();
		sc.close();
	}

}
