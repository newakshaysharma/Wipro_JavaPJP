package assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class ContactList {
	HashMap<String, Integer> contactlist;
	
	public HashMap<String, Integer> getContactlist() {
		return contactlist;
	}
	public ContactList(){
		contactlist=new HashMap<String, Integer>();
	}
	public void addContact(String name,Integer no){
		contactlist.put(name, no);
	}
	
	public void removeContact(String name){
		contactlist.remove(name);
	}
	
	public boolean contactNameExists(String name){
		return contactlist.containsKey(name);
	}
	
	public boolean contactNoExists(Integer no){
		return contactlist.containsValue(no);
	}
	
	public void listAll()
	{
		Set<Entry<String, Integer>> set = contactlist.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext())
		{
			Entry<String, Integer> me = it.next();
			System.out.println(me);
		}
	}

}
