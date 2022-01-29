import pattern.strategy.*;

public class SorterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] data = {
			"Dumpty", "Bownman", "Carroll", "Elfland", "Alice",
		};
		/*
		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();
		*/
		SortAndPrint sap2 = new SortAndPrint(data, new MySorter());
		sap2.execute();
	}
}
