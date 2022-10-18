package provacollezioni;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
        set.add("giuliano");
        set.add("irene");
        set.add("giuliano");
        set.add("sara");
        set.add("luca");
 
        System.out.println("la lista di set e' " + set);

	}

}
