package zivotinje;

public class Ribe extends Zivotinje {

	// Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
	
	private String vrstaVode;
	private String vrstaPeraja;
	public Ribe(String vrsta, String naziv, String omiljenaHrana, String vrstaVode, String vrstaPeraja) {
		super(vrsta, naziv, omiljenaHrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}
	public String getVrstaVode() {
		return vrstaVode;
	}
	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}
	
	
	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	@Override
	public String toString() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(getVrsta());
		sb1.append(" -");
		sb1.append(getNaziv());
		sb1.append(" ");
		sb1.append("cija su omiljena hrana: ");
		sb1.append(getOmiljenaHrana());
		sb1.append(" i koji zive u: ");
		sb1.append(getVrstaVode());
		
		return sb1.toString();
}
}
