package assignment1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the file name");
		String filename=sc.nextLine();
		
		System.out.println("Enter the character to be counted");
		char sec=sc.nextLine().toLowerCase().charAt(0);
		int c=(int)sec;
		
		File file=new File(filename);
		
		int charcount=0;
		
		BufferedReader br=new BufferedReader(new FileReader(file));
		int ch;
		do {
			ch=br.read();
			if (ch >= 65 && ch <= 90) ch += 32;
			if (c >= 65 && c <= 90) c += 32;

			if(ch==c) charcount++;
			
		}while(ch!=-1);
		
		br.close();
		sc.close();
		
		System.out.println("File "+filename+" has "+charcount+" instances of letter "+sec+".");
		
	}
}
