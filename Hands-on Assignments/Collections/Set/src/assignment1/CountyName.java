package assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class CountyName {

	HashSet<String> h1 = new HashSet<String>();

	public HashSet<String> getH1() {
		return h1;
	}



	public HashSet<String> saveCountryNames(String CountryName) {
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
