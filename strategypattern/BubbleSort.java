package strategypattern;

import java.util.List;

public class BubbleSort implements ISortingAlgorithm{
	
	public List<Integer> sort(List<Integer> numbers){
		System.out.println("Sorting using BubbleSort..");
		return numbers;
	}

}
