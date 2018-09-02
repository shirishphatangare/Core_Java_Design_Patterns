package strategypattern;

import java.util.ArrayList;
import java.util.List;

public class SortContext {
	
	ISortingAlgorithm sortingAlgorithm;
	
	public SortContext(ISortingAlgorithm sortingAlgorithm){
		this.sortingAlgorithm = sortingAlgorithm;
	}
	
	
	public void sort() {
		// 1. read input List from User
		List<Integer> numbers = new ArrayList<Integer>();
		// 2. call sort method for sorting algorithm
		sortingAlgorithm.sort(numbers);
		// 3. Print sorted array
	}
	
	
}
