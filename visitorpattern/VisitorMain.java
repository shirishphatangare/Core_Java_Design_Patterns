package visitorpattern;

public class VisitorMain {

	public static void main(String[] args) {
		IVisitor taxVisitor = new TaxVisitor(0.10, 0.30, 0.20);
		IVisitor taxHolidayVisitor = new TaxHolidayVisitor(0.05, 0.25, 0.15);
		
		IVisitable milk = new NecessityVisitable(2.5); 
		IVisitable brandy = new LiquorVisitable(6.5);
		IVisitable cigar = new TobaccoVisitable(4.5);
		
		System.out.println("Printing Normal Prices with taxes..");
		System.out.println("Milk -- " + milk.accept(taxVisitor));
		System.out.println("Brandy -- " + brandy.accept(taxVisitor));
		System.out.println("Cigar -- " + cigar.accept(taxVisitor));
		
		System.out.println("Printing Holiday Prices with taxes..");
		System.out.println("Milk -- " + milk.accept(taxHolidayVisitor));
		System.out.println("Brandy -- " + brandy.accept(taxHolidayVisitor));
		System.out.println("Cigar -- " + cigar.accept(taxHolidayVisitor));
	}
}
