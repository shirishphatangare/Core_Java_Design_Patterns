package adapterpattern;

public class Sorter implements ISorter {

	public void sort (int[] a) {
		int temp;
		
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.print("Ascending Order:");
        for (int i = 0; i < a.length -1 ; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[a.length - 1]);
	}
	
}
