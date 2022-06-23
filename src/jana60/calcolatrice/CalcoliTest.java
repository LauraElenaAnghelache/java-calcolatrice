package jana60.calcolatrice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoliTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Inserisci due numeri:");
		
		int x = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		
		System.out.println("La somma tra i due numeri è: " + CalcoliHelper.somma(x, y));
		System.out.println("La differenza in modulo tra i due numeri è: " + CalcoliHelper.differenza(x, y));
		System.out.println("Il prodotto tra i due numeri è: " + CalcoliHelper.prodotto(x, y));
		System.out.println("Il valore assoluto del primo numero è: " + CalcoliHelper.modulo(x));
		System.out.println("Il massimo tra i due numeri è: " + CalcoliHelper.massimo(x, y));
		System.out.println("Il minimo tra i due numeri è: " + CalcoliHelper.minimo(x, y));
		
		System.out.println("Elevamento a potenza, inserici numero base: ");
		int a  = Integer.parseInt(scan.nextLine());
		System.out.println("Inserisci l'esponente:");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println(a + " elevato alla " + b +" fa " + df.format(CalcoliHelper.potenza(a, b)));
		
		
		scan.close();
	}

}
