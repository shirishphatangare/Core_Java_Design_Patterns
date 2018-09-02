package adapterpattern;

/* Client AdapterMain was using a sorter class which accepts an array as parameter to sort numbers.
 * Now there is new version of interface available (INumberSorter) which accepts List as a parameter. 
 * Class NumberSorter implements INumberSorter.
 * 
 * Client AdapterMain made compatible with Class NumberSorter implements INumberSorter using
 * SorterAdapter which implements ISorter.
 */

public class AdapterMain {

	public static void main(String[] args) {
		int [] numbers = {4,2,61,23,66,222,3};
		//ISorter s = new Sorter(); // Use SorterAdapter instead of Sorter
		ISorter s = new SorterAdapter(new NumberSorter()); // Client Injecting dependency dynamically - Dependency Injection instead of using new keyword in class SorterAdapter (static)
		s.sort(numbers);
	}
}
