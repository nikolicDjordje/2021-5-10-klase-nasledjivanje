package zivotinje;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Zivotinje z1 = new Zivotinje("kicmenjak, papkar", "divlja svinja", "zrnevlje, larve insekata");
		Ribe r1 = new Ribe("kicmenjak", "stuka", "kederi", "slatka voda", "ledjna peraja");
		Sisari s1 = new Sisari("kicmenjak", "vuk", "zecevi", "siva", "cetiri noge");
		System.out.println(s1.toString());
		
	
		List<Zivotinje> listaZivotinja = new ArrayList<Zivotinje>();
		listaZivotinja.add(z1);
		listaZivotinja.add(r1);
		listaZivotinja.add(s1);
		
		Staniste planina = new Staniste("sumsko staniste", listaZivotinja);
		System.out.println(planina.toString());
		
		Zivotinje zzz = listaZivotinja.get(2);
		
		if (zzz instanceof Sisari) {
			Sisari sss = (Sisari) zzz;
			sss.setBojaDlake("Vuk dlaku menja, ali nikada cud!");
			System.out.println(sss.getBojaDlake());
		}

		for (int i = 0; i < listaZivotinja.size(); i++) {
			System.out.println(listaZivotinja.get(i).getNaziv());
		}
		
	}

}
