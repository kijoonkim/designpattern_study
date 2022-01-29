package pattern.iterator;



public class BookShelfIterator implements Iterator {
	private int index;
	private BookShelf bookShelf;
	
	public BookShelfIterator(BookShelf bookShelf){
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index < bookShelf.getLength())
			return true;
		
		return false;
	}

	public Object next() {
		// TODO Auto-generated method stub
		Book book = bookShelf.getAtBook(index);
		index++;
		return book;
	}

}
