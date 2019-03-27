package assignment4;

import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		List<Object> list=new MyArrayList<Object>();
		try {
			list.add(55);
			list.add(4.56F);
			list.add(45.155D);
			//list.add("mps");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Object o:list){
			System.out.println(o);
		}

	}

}
