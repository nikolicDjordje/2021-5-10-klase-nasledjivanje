package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class Staniste {



		/*Zivotinje

		U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa..
		Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje…), konkretan naziv i omiljenu hranu.

		Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
		Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

		Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

		Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		Ispisati bar jedno staniste.
		Jednom sisaru zameniti boju dlake. */
	
	private String nazivStanista;
	List<Zivotinje> listaZivotinja = new ArrayList<Zivotinje>();

		public Staniste(String nazivStanista, List<Zivotinje> listaZivotinja) {
			super();
			this.nazivStanista = nazivStanista;
			this.listaZivotinja = listaZivotinja;
		}

		public String getNazivStanista() {
			return nazivStanista;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("Moje omiljeno staniste za posmatranje je: ");
			sb.append(nazivStanista);
			sb.append(".");
			sb. append(" ");
			sb.append("U njemu zive: ");
			sb.append(listaZivotinja.get(1));
			sb.append(", zatim ");
			sb.append(listaZivotinja.get(2));
			return sb.toString();
		}
		
	

	

	}
