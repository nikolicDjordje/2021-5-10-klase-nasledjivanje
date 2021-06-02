package zivotinje;

public class Sisari extends Zivotinje {
	//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.
	
	private String bojaDlake;
	private String brojNogu;
	public Sisari(String vrsta, String naziv, String omiljenaHrana, String bojaDlake, String brojNogu) {
		super(vrsta, naziv, omiljenaHrana);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public String getBrojNogu() {
		return brojNogu;
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
		sb1.append(" cija dlaka je: ");
		sb1.append(getBojaDlake());
		sb1.append(" i koji imaju ");
		sb1.append(getBrojNogu());
		sb1.append(".");
		return sb1.toString();
	}

}
