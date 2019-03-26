package assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FileWordCount {

	public static void main(String[] args) throws IOException
	{
		if(args.length!=2)
			{
			System.out.println("Pass Input and Output filename.");
			return;
			}
		String ipfilename=args[0];
		String opfilename=args[1];
		
		
		System.out.print(ipfilename+"bakbkdbkjd");
		File ipfile=new File(ipfilename);
		File opfile=new File(opfilename);
		
		BufferedReader inbr=new BufferedReader(new FileReader(ipfile));
		BufferedWriter opbw=new BufferedWriter(new FileWriter(opfile));
		
		Map<String, Integer> map=new TreeMap<>();
		
		String st;
		while((st=inbr.readLine())!=null)
		{
			st=st.trim();
			String[] words=st.split(" ");
			
			for(String word:words) {
				word=word.trim();
				if(map.containsKey(word))
				{
					map.put(word, map.get(word) + 1);
				}
				else
				{
					map.put(word, 1);
				}
			}
		};
		
		for (Entry<String, Integer> entry : map.entrySet()) {
		    String os=entry.getKey() + ":" + entry.getValue().toString()+System.getProperty("line.separator");
		    opbw.write(os);
		}
		
		opbw.close();
		inbr.close();
	}
}
