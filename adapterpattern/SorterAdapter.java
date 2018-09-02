package adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class SorterAdapter implements ISorter { // Implement same interface ISorter which was used by Client AdapterMain
	INumberSorter numberSorter; 
	
	public SorterAdapter(INumberSorter numberSorter){
		this.numberSorter = numberSorter;
	}
	
	public void sort (int[] a) {
		numberSorter.sort(convertArrayToList(a)); // Delegate to class NumberSorter which implements INumberSorter
	}
	
	
	// Convert from Array to List
	private List<Integer> convertArrayToList(int[] a) {
		List<Integer> al = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) 
        {
			al.add(a[i]);
        }
		return al;
	}

}
