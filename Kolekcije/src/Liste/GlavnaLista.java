package Liste;

import java.util.ArrayList;
import java.util.List;

public class GlavnaLista {

	public static void main(String[] args) {
		
		/*String ime = "Pera";
		
		List lista = new ArrayList();
		
		// dodavanje elemenata u listu
		
		lista.add(ime);
		lista.add(1987);
		lista.add(3.14);
		lista.add(false);
		lista.add("Stevo");
		
		// hvatanje elemenata liste
		
		System.out.println("Treci element liste je " + lista.get(2));
		
		double x = (double)lista.get(2);
		String y = (String)lista.get(4);
		System.out.println(y);
		
		
		// genericke liste
		
		List <String> imena = new ArrayList<String>();
		
		imena.add("Djordje");
		imena.add("Marina");
		imena.add("Bojan");
		
		System.out.println("Polaznici su: ");
		// prolaz kroz listu
		for (int i = 0; i < imena.size(); i++) {
			String imePolaznika = imena.get(i);
			System.out.println(imePolaznika);
		}
		
		imena.remove(0); // uklanjamo element liste
		
		System.out.println("Preostali polaznici: ");
		// for each
		for(String imePolaznika: imena) {
			System.out.println(imePolaznika);
		}*/
		
		// lista intova mora preko wrapper klase double
		List<Integer> brojevi = new ArrayList<Integer>();
		
		Soldier soldier1 = new Soldier();
			soldier1.setName("Name1");
			soldier1.setHealth(100);
			soldier1.setMoney(16000);
			soldier1.setTeam("Kanter");
		
		Soldier soldier2 = new Soldier();
			soldier2.setName("Name2");
			soldier2.setHealth(100);
			soldier2.setMoney(16000);
			soldier2.setTeam("Kanter");
		
		Soldier soldier3 = new Soldier();
			soldier3.setName("Name3");
			soldier3.setHealth(100);
			soldier3.setMoney(16000);
			soldier3.setTeam("Teror");
		
		Soldier soldier4 = new Soldier();
			soldier4.setName("Name4");
			soldier4.setHealth(100);
			soldier4.setMoney(16000);
			soldier4.setTeam("Kanter");
		
		Soldier soldier5 = new Soldier();
			soldier5.setName("Name5");
			soldier5.setHealth(100);
			soldier5.setMoney(16000);
			soldier5.setTeam("Teror");
		
		Soldier soldier6 = new Soldier();
			soldier6.setName("Name6");
			soldier6.setHealth(100);
			soldier6.setMoney(16000);
			soldier6.setTeam("Teror");
		
		List<Soldier> terori = new ArrayList<Soldier>();
		terori.add(soldier3);
		terori.add(soldier5);
		terori.add(soldier6);
		
		List<Soldier> kanteri = new ArrayList<Soldier>();
		kanteri.add(soldier1);
		kanteri.add(soldier2);
		kanteri.add(soldier4);
		
		
		System.out.println("Ekipa terora je: ");
		
		for(Soldier s: terori) {
			System.out.println(s.getName());
		}
		
		System.out.println("Ekipa kantera je: ");
		
		for(Soldier s: kanteri) {
			System.out.println(s.getName());
		}
		
		
		Weapon firearm = new Firearm();
		Weapon knife = new ColdWeapon();
		
		List<Weapon> myWeapon = new ArrayList<Weapon>();
			myWeapon.add(knife);
			myWeapon.add(firearm);
			
		soldier3.setRanac(myWeapon);
		
		soldier3.getRanac().get(1).hit(soldier4);
		
		
		
		
		
	}

}
