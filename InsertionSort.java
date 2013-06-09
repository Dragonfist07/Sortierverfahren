//By Jonas Block

package InsertionSort;

public class InsertionSort {
	
	
	//DIE SORTIER METHODE!:
	public void sortiere(int[] zahlen) {
		for (int i = 1; i < zahlen.length; i++){			//Die For Schleife geht durch alle Zahlen durch
			int wert = zahlen[i];					//Die aktuell ausgewählte Zahl von der For Schleife
										//wird in die Variable wert eingespeichert
			int position = i - 1;					//Da durch das imaginäre herrausnehmen der Zahl das Array nun um
										//eins kürzer ist, ist die Position nun auch um eins kleiner

			while (position >= 0 && zahlen[position] > wert) {	//Nun wird in dem Folgenden While-Schleifen-Block die Zahl an
										//die passende Stelle eingefügt. Dafür geht die While Schleife
										//durch das Array und schaut wo die Zahl rein passt
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
