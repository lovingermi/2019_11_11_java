import java.util.Arrays;

public class Tanulo 
{
	private String nev;
	private int szuletesiEv;
	private String evfolyam;
	private int osztaly;
	private int[] angolJegyek= new int[3];
	private int feleviAngol;
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
	public void setFeleviAngol(int feleviAngol) {
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
	
	public int getAngolJegy(int[] jegyek)
	{
		int ossz=0;;
		float atlag;
		int db=0;
		for (int i = 0; i < jegyek.length; i++) 
		{
			ossz+=jegyek[i];
			db++;
		}
		atlag=(float)ossz/db;
		if(atlag>=4.5)
		{
			return 5;
		}
		else
		if(atlag>=3.6)	
		{
			return 4;
		}
		else
		if(atlag>=2.7)
		{
			return 3;
		}
		if(atlag>=1.8)
		{
			return 2;
		}
		else
		{
			return 1;
		}	
	}
}
