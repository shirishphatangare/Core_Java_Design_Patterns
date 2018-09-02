package virtualproxypattern;

// Virtual Proxy implementing IBookParser interface
public class LazyBookParser implements IBookParser{
	IBookParser bookParser;
	String bookName;
	
	public LazyBookParser(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public int getNumberPagesTobeParsed() {
		if(bookParser == null) { // Create expensive BookParser object at first-time access of getNumberPagesTobeParsed method
			System.out.println("Initializing Main BookParser for the first time for " + this.bookName);
			bookParser = new BookParser(bookName);
		}else {
			System.out.println("Reusing expensive Main BookParser for " + this.bookName);
		}
		return bookParser.getNumberPagesTobeParsed(); // use existing expensive BookParser object instead of creating new one
	}
	
	

}
