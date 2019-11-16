import java.util.Scanner;

public class Fealdat_2 {

	private static  Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Kérem a nyégyzet oldalát");
		double Negyzetoldal=scanner.nextDouble();
		System.out.println("A négyzet kerülete: "+Sikidomok.getNegyzetKerulet(Negyzetoldal));
		System.out.println("A négyzet területe: "+Sikidomok.getNegyzetTerulet(Negyzetoldal));
		System.out.println("Kérem a kör sugarát");
		double sugar=scanner.nextDouble();
		System.out.println("A kör területe: "+Sikidomok.getKorTerulet(sugar));
	    System.out.println("A kör kerülete: "+Sikidomok.getKorKerulet(sugar));

	}

}
