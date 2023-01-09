package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {

	List<Type> list = new ArrayList<>();
	
	public void addValue(Type value) {
		list.add(value);
	}
	
	public Type first() { 
		if (list.isEmpty()) {
			throw new IllegalStateException("lista tá vazia!");
		} else {
		return list.get(0);
	}
	 	
	
}
}