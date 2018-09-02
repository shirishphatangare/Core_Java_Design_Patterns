package virtualproxypattern;

public class VirtualProxyMain {

	public static void main(String[] args) {
		String bookName1 = "Effective Java";
		// Client using virtual proxy object
		IBookParser bookParser1 = new LazyBookParser(bookName1);
		System.out.println("Calling Virtual proxy for first time for " + bookName1);
		System.out.println("Number of Pages of book - " + bookName1 + " " + bookParser1.getNumberPagesTobeParsed());
		System.out.println("Calling Virtual proxy for second time for " + bookName1);
		System.out.println("Number of Pages of book - " + bookName1 + " " + bookParser1.getNumberPagesTobeParsed());
		System.out.println("Calling Virtual proxy for third time for " + bookName1);
		System.out.println("Number of Pages of book - " + bookName1 + " " + bookParser1.getNumberPagesTobeParsed());
		
		System.out.println("------------------------------------------------------------------------------------");
		
		String bookName2 = "Head First Java";
		// Client using virtual proxy object
		IBookParser bookParser2 = new LazyBookParser(bookName2);
		System.out.println("Calling Virtual proxy for first time for " + bookName2);
		System.out.println("Number of Pages of book - " + bookName2 + " " + bookParser2.getNumberPagesTobeParsed());
		System.out.println("Calling Virtual proxy for second time for " + bookName2);
		System.out.println("Number of Pages of book - " + bookName2 + " " + bookParser2.getNumberPagesTobeParsed());
	}
}
