package assignment4;

import java.util.Iterator;
import java.util.TreeSet;

public class ContryName {

	TreeSet<String> h1 = new TreeSet<String>();

	public TreeSet<String> getH1() {
		return h1;
	}



	public TreeSet<String> saveCountryNames(String CountryName) {
		h1.add(CountryName);
		return h1;
	}
	
	public String getCountry(String countryName){
		Iterator<String> it=h1.iterator();
		while(it.hasNext()){
			if(it.next().equals(countryName)){
				return countryName;
			}
		}
		return null;
	}
}
