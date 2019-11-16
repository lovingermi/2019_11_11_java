import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Feladat_1 {

	public static Scanner scanner= new Scanner(System.in);
	public static Scanner scannerInt= new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		try 
		{
			String nev="";
			int szuletesiEv;
			int[] jegyek=new int[3];
			Random rnd = new Random();
			System.out.println("Hány tanulót akar felvinni?");
			int db=scannerInt.nextInt();
			Tanulo[] tanulok=new Tanulo[db];
			for (int i = 0; i < tanulok.length; i++) 
			{
				
				
				System.out.println("Kérem a nevet");
				nev=scanner.nextLine();			
				System.out.println("Kérem a születési évet");
				szuletesiEv=scannerInt.nextInt();
				
				tanulok[i]=new Tanulo(nev,szuletesiEv);	
				tanulok[i].setOsztaly(3);
				tanulok[i].setEvfolyam("2019-2020");
					
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
		catch (InputMismatchException ie) 
		{
			System.err.println("Nem megfelelő érték lett megadva!");
		}
		catch (Exception e) 
		{
			System.err.println("Ismeretlen hiba történt!");
		}
		
		

	}

}
