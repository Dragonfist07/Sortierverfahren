//By Jonas Block

package BubbleSort;

public class BubbleSort {

	public void sortiereArray(int[] zahlen) {
		boolean unsortiert = true;
		int temp;

		while (unsortiert) {
			unsortiert = false;
			for (int i = 0; i < zahlen.length - 1; i++)
				if (zahlen[i] > zahlen[i + 1]) {
					temp = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temp;
					unsortiert = true;
				}
		}
	}
	
	public void ausgabeArray(int[] zahlen){
		for (int i = 0; i < zahlen.length; i++)
			System.out.print(zahlen[i] + " ");
	}

	public static void main(String[] args) {
		
		int[] zahlen = { 0, 9, 4, 6, 2, 8, 5, 1, 7, 3 };
		
		BubbleSort b = new BubbleSort();
		System.out.println("Zahlen vor dem Sortieren:");
		b.ausgabeArray(zahlen);
		b.sortiereArray(zahlen);
		System.out.println("\nZahlen nach dem Sortieren:");
		b.ausgabeArray(zahlen);
	}
}
