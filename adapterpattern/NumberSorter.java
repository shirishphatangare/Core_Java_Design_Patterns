package adapterpattern;

import java.util.Collections;
import java.util.List;

public class NumberSorter implements INumberSorter {
	
	public void sort(List<Integer> numbers) {
		Collections.sort(numbers);
		 
        // Let us print the sorted list
        System.out.println("List after the use of" +
                           " Collection.sort() :\n" + numbers);
	}
}
