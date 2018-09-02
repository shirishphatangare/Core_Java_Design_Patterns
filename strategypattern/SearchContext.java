package strategypattern;

import java.util.ArrayList;
import java.util.List;

public class SearchContext {
	
	
	ISearchingAlgorithm searchingAlgorithm;
	
	public SearchContext(ISearchingAlgorithm searchingAlgorithm){
		this.searchingAlgorithm = searchingAlgorithm;
	}
	
	
	public void search() {
		// 1. read input List from User
		List<Integer> numbers = new ArrayList<Integer>();
		// 2. read search token from User
		int token = 123;
		// 3. call sort method for sorting algorithm
		searchingAlgorithm.search(numbers, token);
		// 4. Print sorted array
	}

}
