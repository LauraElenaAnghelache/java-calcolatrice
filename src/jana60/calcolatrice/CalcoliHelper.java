package jana60.calcolatrice;

public class CalcoliHelper {

	
		/*Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare la classe in modo che non possa essere istanziata (cioè non posso creare oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i seguenti metodi static:
- Somma di due numeri interi
- Differenza tra due numeri interi
- Moltiplicazione di due numeri interi
- Valore assoluto di un numero intero
- Minimo tra due numeri interi
- Massimo tra due numeri interi
Create anche una classe CalcoliTest con il metodo main in cui testate tutti i metodi della vostra classe di helper (con un esempio per ogni casistica)*/
    
	public static int somma(int x, int y) {
    	 return x+y; 
     }
	public static int differenza(int x, int y) {
		if(x > y) {
			return x-y;
		}else {
			return y-x;
		}
	}
	public static int prodotto(int x, int y) {
		return x*y;
	}
	public static int modulo(int x) {
		if(x<0) {
			return -x;
		}else {
			return x;
		}
	}
	public static int minimo(int x, int y) {
		if(x < y) {
			return x;
		}else {
			return y;	
		}
	}
	public static int massimo(int x, int y) {
		if(x > y) {
			return x;
		}else {
			return y;
		}
	}
	public static double potenza(int x, int y) {
		return Math.pow(x, y);
	}
	
	
	}


