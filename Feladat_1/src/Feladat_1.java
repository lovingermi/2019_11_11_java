import java.util.Random;
import java.util.Scanner;

public class Feladat_1 {

	private static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) 
	{
		String nev;
		int szuletesiEv;
		String evfolyam;
		int osztaly;
		int[] jegyek=new int[3];
		Random rnd = new Random();
		System.out.println("Hány tanulót akar felvinni");
		int db=scanner.nextInt();
		Tanulo[] tanulok=new Tanulo[db];
		for (int i = 0; i < tanulok.length; i++) 
		{
			System.out.println("Kérem a nevet");
			nev=scanner.next();
			System.out.println("Kérem a születési évet");
			szuletesiEv=scanner.nextInt();
			
			tanulok[i]=new Tanulo(nev,szuletesiEv);
			
		}
		
		
		for (int i = 0; i < tanulok.length; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				jegyek[j]=rnd.nextInt(5)+1;
			}
			tanulok[i].setAngolJegyek(jegyek);
			tanulok[i].setFeleviAngol
			(tanulok[i].getAngolJegy(tanulok[i].getAngolJegyek()));
			System.out.println(tanulok[i]);
		}
		

	}

}
