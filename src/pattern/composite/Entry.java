package pattern.composite;

public abstract class Entry {
	public Entry parent;
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public void printList(){
		printList("");
	}
	protected abstract void printList(String prefix);
	
	public String toString(){
		return getName() + " (" + getSize() +")";
	}
	
	public String getFullname(){
		StringBuffer sb = new StringBuffer();
		Entry entry = this;
		do{
			sb.insert(0, '/'+entry.getSize());
			entry = entry.parent;
		}while(entry!=null);
		
		return sb.toString();
	}
}
