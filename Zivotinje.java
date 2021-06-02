package zivotinje;

public class Zivotinje {
	
	/* U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa..
		Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje�), konkretan naziv i omiljenu hranu
*/
	
	private String vrsta;
	private String naziv;
	private String omiljenaHrana;
	public Zivotinje(String vrsta, String naziv, String omiljenaHrana) {
		super();
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.omiljenaHrana = omiljenaHrana;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOmiljenaHrana() {
		return omiljenaHrana;
	}
	public void setOmiljenaHrana(String omiljenaHrana) {
		this.omiljenaHrana = omiljenaHrana;
	}
	
	
}
