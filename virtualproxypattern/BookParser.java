package virtualproxypattern;

// Main Subject implementing IBookParser interface
public class BookParser implements IBookParser{
	String bookName;
	int numPages;
	
	//Expensive to create BookParser object
	public BookParser(String bookName) {
		this.bookName = bookName;
		createExpensiveBookParser(bookName);
	}
	
	private void createExpensiveBookParser(String bookName) {
		System.out.println("Creating Expensive Book Parser for " + bookName);
	}


	@Override
	public int getNumberPagesTobeParsed() {
		// Calculate number of pages and return 
		return numPages;
	}

}
