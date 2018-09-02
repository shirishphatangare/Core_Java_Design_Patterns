package strategypattern;

import java.util.List;

public class SelectionSort implements ISortingAlgorithm{
	
	public List<Integer> sort(List<Integer> numbers){
		System.out.println("Sorting using SelectionSort..");
		return numbers;
	}
}
