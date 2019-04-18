import java.util.ArrayList;
import java.util.List;

public class Helper {
	
	List<String> list;

	public Helper() {
		list=new ArrayList<String>();
	}

	public boolean insertItem(String st){
		return list.add(st);
	}
	
	public boolean searchItem(String st){
		return list.contains(st);
	}
	
	public boolean deleteItem(String st){
		return list.remove(st);
	}
	
	public void display(){
		if(list.isEmpty()){
			System.out.println("List is Empty.");
			return;
		}
		System.out.println("List Contains :");
		for(String s:list)
			System.out.println(s);
		
	}
}
