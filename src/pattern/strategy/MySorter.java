package pattern.strategy;

public class MySorter implements Sorter {

	public void sort(Comparable[] data) {
		for(int i=0; i < data.length; i++){
			for(int j=0; j < data.length-1; j++){
				int x=j, y=x+1;
				if(data[x].compareTo(data[y]) > 0){
					Comparable temp = data[y];
					data[y] = data[x];
					data[x] = temp;
				}
			}
		}
	}
}
