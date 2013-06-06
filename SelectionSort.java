//By Jonas Block

package SelectionSort;

public class SelectionSort {
	
	public void sortiere(int[] zahlen) {
		for (int i = 0; i < zahlen.length - 1; i++) {
			for (int j = i + 1; j < zahlen.length; j++) {
				if (zahlen[i] > zahlen[j]) {
					int temp = zahlen[i];
					zahlen[i] = zahlen[j];
					zahlen[j] = temp;
				}
			}
		}
	}
	
	
	public void ausgabeArray(int[] zahlen){
		for (int i = 0; i < zahlen.length; i++)
			System.out.print(zahlen[i] + " ");
	}

	public static void main(String[] args) {
		
		int[] zahlen = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		
		SelectionSort s = new SelectionSort();
		System.out.println("Zahlen vor dem Sortieren:");
		s.ausgabeArray(zahlen);
		s.sortiere(zahlen);
		System.out.println("\nZahlen nach dem Sortieren:");
		s.ausgabeArray(zahlen);
	}
}