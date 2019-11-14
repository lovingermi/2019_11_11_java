import java.util.Arrays;

public class Tanulo 
{
	private String nev;
	private int szuletesiEv;
	private String evfolyam;
	private int osztaly;
	private int[] angolJegyek= new int[3];
	private double feleviAngol;
	public Tanulo(String nev, int szuletesiEv) {
		
		this.nev = nev;
		this.szuletesiEv = szuletesiEv;
	}
	public Tanulo(String nev, int szuletesiEv, String evfolyam, int osztaly) {
		
		this.nev = nev;
		this.szuletesiEv = szuletesiEv;
		this.evfolyam = evfolyam;
		this.osztaly = osztaly;
	}
	public String getEvfolyam() {
		return evfolyam;
	}
	public void setEvfolyam(String evfolyam) {
		this.evfolyam = evfolyam;
	}
	public int getOsztaly() {
		return osztaly;
	}
	public void setOsztaly(int osztaly) {
		this.osztaly = osztaly;
	}
	public int[] getAngolJegyek() {
		return angolJegyek;
	}
	public void setAngolJegyek(int[] angolJegyek) {
		this.angolJegyek = angolJegyek;
	}
	public double getFeleviAngol() {
		return feleviAngol;
	}
	public void setFeleviAngol(double feleviAngol) {
		this.feleviAngol = feleviAngol;
	}
	public String getNev() {
		return nev;
	}
	public int getSzuletesiEv() {
		return szuletesiEv;
	}
	@Override
	public String toString() {
		return "Tanulo [nev=" + nev + ", szuletesiEv=" + szuletesiEv + ", evfolyam=" + evfolyam + ", osztaly=" + osztaly
				+ ", angolJegyek=" + Arrays.toString(angolJegyek) + ", feleviAngol=" + feleviAngol + "]";
	}
	public String getNevAndFeleviOsztalyzat()
	{
		return"Név: "+getNev()+" "+"félévi angol osztályzat"+getFeleviAngol();
	}
	
	
}
