package strategypattern;

import java.util.List;

public class BinarySearch implements ISearchingAlgorithm {
	public boolean search(List<Integer> numbers, int token) {
		System.out.println("Searching using BinarySearch..");
		return true;
	}
}
