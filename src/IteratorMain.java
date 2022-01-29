import pattern.iterator.Book;
import pattern.iterator.BookShelf;
import pattern.iterator.Iterator;

public class IteratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("마소");
		Book book2 = new Book("Java 언어로 배우는 디자인 패턴 입문");
		Book book3 = new Book("나는 언제까지 외롭습니까?");
		
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(book1);
		bookShelf.appendBook(book2);
		bookShelf.appendBook(book3);
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
