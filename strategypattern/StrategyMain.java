package strategypattern;


public class StrategyMain {

	
	public static void main(String[] args) {
		ISortingAlgorithm sortingAlgorithm = new SelectionSort(); // Instead read sorting strategy can be read from user at runtime
		ISearchingAlgorithm searchingAlgorithm = new LinearSearch(); // Instead read searching strategy and token can be read from user at runtime

		SortContext sortcontext = new SortContext(sortingAlgorithm); 
		sortcontext.sort();
		
		SearchContext searchContext = new SearchContext(searchingAlgorithm);
		searchContext.search();
	}
}
