//By Jonas Block

package BubbleSort;

public class BubbleSort {
	
	
	//DIE SORTIER METHODE!:
	public void sortiereArray(int[] zahlen) {
		boolean unsortiert = true;				//bleibt so lange auf true solange es noch nicht sortiert ist
		int temp;						//Temporäre Variable, die die zutauschende Zahl abspeichert 

		while (unsortiert) {					//solange das Array unsortiert ist wird es weiter sortiert
			unsortiert = false;				//Das Programm geht erstmal davon aus das das Array sortiert ist
									//und überprüft das später nocheinmal
			for (int i = 0; i < zahlen.length - 1; i++)	//Die for Schleife geht durch das gesammte Array
				if (zahlen[i] > zahlen[i + 1]) {	//Wenn die größere Zahl vor der kleineren steht, werden sie getauscht
					temp = zahlen[i];		
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temp;
					unsortiert = true;		//solange das Programm immer noch sortiert ist das Array unsortiert
				}
		}
	}
	
	public void ausgabeArray(int[] zahlen){				//Einfache Ausgabe des Arrays
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
