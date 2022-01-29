package pattern.iterator;



import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList books = new ArrayList();
	
	public void appendBook(Book book){
		books.add(book);
	}
	
	public Book getAtBook(int index){
		return (Book)books.get(index);
	}
	
	public int getLength(){
		return books.size();
	}
	
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new BookShelfIterator(this);
	}

}
