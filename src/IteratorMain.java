import pattern.iterator.Book;
import pattern.iterator.BookShelf;
import pattern.iterator.Iterator;

public class IteratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("����");
		Book book2 = new Book("Java ���� ���� ������ ���� �Թ�");
		Book book3 = new Book("���� �������� �ܷӽ��ϱ�?");
		
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
