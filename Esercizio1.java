import java.util.Scanner;

/**
 * Scrivere un frammento di códice che verifichi che la variabile intera punteggio
contenga un valore valido. Si supponga che i valori siano validi se sono compresi tra
Oe 100
 * @author Exolab
 *
 */
public class Esercizio1 {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Digita un numero:");
		int punteggio = tastiera.nextInt();
		
		if(punteggio>=0 && punteggio<=100) {
			System.out.println("Numero valido");
		} else {
			System.out.println("Numero non valido");
		}

	}

}
