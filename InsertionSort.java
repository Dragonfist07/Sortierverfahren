//By Jonas Block

package InsertionSort;

public class InsertionSort {
	
	public void sortiere(int[] zahlen) {
		for (int i = 1; i < zahlen.length; i++){
			int wert = zahlen[i];
			int position = i - 1;

			while (position > 0 && zahlen[position] > wert) {
				zahlen[position + 1] = zahlen[position];
				position--;
			}
			zahlen[position + 1] = wert;
		}
	}
	
	public void ausgabeArray(int[] zahlen){
		for (int i = 0; i < zahlen.length; i++)
			System.out.print(zahlen[i] + " ");
	}

	public static void main(String[] args) {
		
		int[] zahlen = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		
		InsertionSort s = new InsertionSort();
		System.out.println("Zahlen vor dem Sortieren:");
		s.ausgabeArray(zahlen);
		s.sortiere(zahlen);
		System.out.println("\nZahlen nach dem Sortieren:");
		s.ausgabeArray(zahlen);
	}
}