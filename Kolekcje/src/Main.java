import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// GIT
		// TODO Auto-generated method stub

		// 1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add,
		// wyswietl cala liste petla for each.

		List lista = new ArrayList();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		// 4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek
		// Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy

		List listaImion = new ArrayList<String>();
		List listaImion2 = new ArrayList<String>();
		listaImion2.add("Tomek");
		listaImion2.add("Ania");
		listaImion2.add("Tomek");
		listaImion2.add("Krzysssss");
		listaImion2.add("Grzes");
		listaImion2.add("Tomek");

		listaImion.addAll(listaImion2);

		for (int i = 0; i < listaImion.size(); i++) {

			if (listaImion.get(i) == "Tomek") {
				listaImion.remove(i);

			}

		}
		for (int i = 0; i < listaImion.size(); i++) {
			System.out.println(listaImion.get(i));
		}

		for (int i = 0; i < lista.size(); i++) {
			int liczba = (Integer) lista.get(i);
			System.out.println(liczba);

		}

		for (int i = 0; i < wiekszeOd(lista, 4).size(); i++) {
			int liczba = (Integer) wiekszeOd(lista, 4).get(i);
			System.out.println(liczba);
		} // czy to musi byæ tak pokrêtnie drukowane? czy jest na to prostszy patent?

		System.out.println(sumaListy(lista));
		System.out.println(najdluzszeImie(listaImion2));
		System.out.println(czyJestImie(listaImion, "Kuba"));

		// 7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste
		// i wypisz je w kolejnosci rosnacej

		List dable = new ArrayList();
		dable.add(6.15);
		dable.add(3.14);
		dable.add(-6.15);
		dable.add(34.11);
		dable.add(106.15);

		Collections.sort(dable);
		for (int i = 0; i < dable.size(); i++) {
			double liczba = (Double) dable.get(i);
			System.out.println(liczba);

		}

		// Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z
		// przedziaku 1-10,
		// wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste

		LinkedList listaLiczb = new LinkedList();
		Random generator = new Random();
		int iloscLiczb = 0;
		iloscLiczb = generator.nextInt(2, 9);

		for (int i = 0; i < iloscLiczb; i++) {

			listaLiczb.add(generator.nextInt(1, 11));
			int losowa = (Integer) listaLiczb.get(i);
			System.out.println(losowa);

		}

		System.out.println();

		Collections.sort(listaLiczb);
		for (int i = 0; i < listaLiczb.size(); i++) {
			int liczba = (Integer) listaLiczb.get(i);
			// System.out.println(liczba);

		}

		Collections.reverse(listaLiczb);
		for (int i = 0; i < listaLiczb.size(); i++) {
			int liczba = (Integer) listaLiczb.get(i);
			System.out.println(liczba);

		}

	}

	// 2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania

	public static int sumaListy(List lista) {
		int suma = 0;

		for (int i = 0; i < lista.size(); i++) {
			int liczba = (Integer) lista.get(i);
			suma += liczba;
		}
		return suma;
	}

// 3) Stworz metode ktora zwroci liste elementow wiekszych od 3
	public static List wiekszeOd(List lista, int x) {
		List listaWiekszychOd = new ArrayList();

		for (int i = 0; i < lista.size(); i++) {
			int liczba = (Integer) lista.get(i);

			if (liczba > x) {
				listaWiekszychOd.add(liczba);
			}
		}
		return listaWiekszychOd;
	}

// 4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek
// Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy
// 5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie

	public static String najdluzszeImie(List lista) {
		String najdluzsze = "";
		String imie = "";

		for (int i = 0; i < lista.size(); i++) {
			imie = (String) lista.get(i);

			if (imie.length() > najdluzsze.length()) {
				najdluzsze = imie;
			}
		}
		return najdluzsze;
	}

// 6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w
// kolekcji

	public static boolean czyJestImie(List lista, String imie) {
		for (int i = 0; i < lista.size(); i++) {
			String imieZListy = (String) lista.get(i);

			if (imieZListy == imie) {
				return true;

			}
		}
		return false;

	}

}

// Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca
// liste intow ktore sa wieksze niz podany jako parametr int

// Wyswietl wszystkie imiona mêskie które znajduja sie w liscie

// Wyswietl ile razy by³o podane imie podane jako parametr

// Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
// liste zawierajaca wszystkie
// Stringi ktore zawieraja podana znak
// Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
// zawierac Ania Kasia Magda

// Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
// elementów ktore sa na obu listach

// Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
// najmniejszym elementem3

// Napisz metode ktora przyjmuje liste Stringow i zwraca listê (intow) indeksow
// wszystkich elementow na liscie, ktore sa takie same jak parametr metody
// np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
// output: to 0,2,5

// Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako
// parametr
