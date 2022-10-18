package provacollezioni;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(1,"giuliano");  
		  map.put(2,"francesco");  
		  map.put(3,"irene");  
		  
		  System.out.println("il contenuto del map e' questo " + map);
	}

}
