package assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Capital {

	private HashMap<String, String> m1;
	
	public Capital(){
		m1=new HashMap<String, String>();
	}
	
	public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
		m1.put(countryName, capital);
		return m1;
	}
	
	public String getCapital(String country){
		return m1.get(country);
	}
	
	public String getCountry(String capitalName){
		Set<Entry<String, String>> set=m1.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> te=it.next();
			if(te.getValue().equals(capitalName))
				return te.getKey();
		}
		return null;
	}
	
	public HashMap<String, String> exchangeKyeValue()
	{
		HashMap<String, String> m2=new HashMap<String, String>();
		Set<Entry<String, String>> set=m1.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> te=it.next();
			m2.put(te.getValue(), te.getKey());
		}
		return m2;
	}
	
	public ArrayList<String> getArrayList()
	{
		ArrayList<String> al=new ArrayList<String>();
		Set<Entry<String, String>> set=m1.entrySet();
		Iterator<Entry<String, String>> it=set.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> te=it.next();
			al.add(te.getKey());
		}
		
		return al;
	}
}
