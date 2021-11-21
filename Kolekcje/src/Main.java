import java.util.*;

public class Main {

	public static void main(String[] args) {
		// GIT
		// TODO Auto-generated method stub

		// 1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add,
		// wyswietl cala liste petla for each.

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		List<Integer> listaInt = new ArrayList<>(Arrays.asList(1, 5, 2, 2, 6, 10));

		System.out.println(wiekszeNaLiscie(lista, 2));

		// 4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek
		// Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy

		List<String> listaImion = new ArrayList<>();
		List<String> listaImion2 = new ArrayList<>();
		listaImion2.add("Tomek");
		listaImion2.add("Ania");
		listaImion2.add("Tomek");
		listaImion2.add("Krzysssss");
		listaImion2.add("Grzes");
		listaImion2.add("Tomek");

		listaImion.addAll(listaImion2);

		listaImion.removeAll(Arrays.asList("Tomek"));

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

		List<Double> dable = new ArrayList<>();
		dable.add(6.15);
		dable.add(3.14);
		dable.add(-6.15);
		dable.add(34.11);
		dable.add(106.15);

		Collections.sort(dable);

		System.out.println(dable);
	}

	// Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z
	// przedziaku 1-10,
	// wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste

	public static List<Integer> losowaLista() {
		List<Integer> lista = new ArrayList<>();
		Random losowa = new Random();
		int iloscLiczb = losowa.nextInt(7) + 2;

		for (int i = 1; i <= iloscLiczb; i++) {
			lista.add(losowa.nextInt(10) + 1);
		}

		Collections.sort(lista, Comparator.reverseOrder());
		return lista;
	}

	// 2) Stworz metode ktora zwroci sume liczb z ArrayListy z 1 zadania

	public static int sumaListy(List<Integer> lista) {
		int suma = 0;

		for (int i : lista) {
			suma += i;
		}
		return suma;
	}

// 3) Stworz metode ktora zwroci liste elementow wiekszych od 3
	public static List<Integer> wiekszeOd(List<Integer> lista, int x) {
		List<Integer> listaWiekszychOd = new ArrayList<>();

		for (int i : lista) {
			if (i > x) {
				listaWiekszychOd.add(i);
			}
		}
		return listaWiekszychOd;
	}

// 4) Zadeklaruj Liste Stringow, dodaj do niej kolekcje imion Tomek Ania Tomek
// Krzys Grzes Tomek metoda addAll, nastepnie usun wszystkich Tomkow z tej listy
// 5) Napisz metode do zadania 4, ktora zwroci najdluzsze imie

	public static String najdluzszeImie(List<String> lista) {
		String najdluzsze = "";

		for (String str : lista) {

			if (str.length() > najdluzsze.length()) {
				najdluzsze = str;
			}
		}
		return najdluzsze;
	}

// 6) Napisz metode do zadani 4 ktora sprawdza czy podane imie znajduje sie w
// kolekcji

	public static boolean czyJestImie(List<String> lista, String imie) {
		return lista.contains(imie);
	}

// Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca
// liste intow ktore sa wieksze niz podany jako parametr int

	public static List<Integer> wiekszeNaLiscie(List<Integer> lista, int b) {
		List<Integer> wieksze = new ArrayList<>();

		for (int i : lista) {
			if (i > b) {
				wieksze.add(i);
			}
		}
		return wieksze;
	}

// Wyswietl wszystkie imiona mêskie które znajduja sie w liscie

	public static List<String> meskieImie(List<String> lista) {
		List<String> meskie = new ArrayList<>();

		for (String str : lista) {
			if (!str.endsWith("a")) {
				meskie.add(str);
			}

		}
		return meskie;

	}

// Wyswietl ile razy by³o podane imie podane jako parametr
	public static int ileRazyImie(List<String> lista, String imie) {
		int ileRazyImie = 0;

		for (String str : lista) {
			if (str.equals(imie)) {
				ileRazyImie++;
			}
		}
		return ileRazyImie;
	}

// Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
// liste zawierajaca wszystkie
// Stringi ktore zawieraja podana znak
// Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
// zawierac Ania Kasia Magda
	public static List<String> stringiZeZnakiem(List<String> lista, char znak) {
		List<String> listaZeZnakiem = new ArrayList<>();
		for (String str : lista) {
			if (str.toLowerCase().contains(String.valueOf(znak))) {
				listaZeZnakiem.add(str);
			}
		}
		return listaZeZnakiem;
	}

// Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
// elementów ktore sa na obu listach

	public static List<String> wObuListach(List<String> lista1, List<String> lista2) {
		List<String> listaZObu = new ArrayList<>();
		for (String str : lista1) {
			if (lista2.contains(str)) {
				listaZObu.add(str);
			}
		}
		return listaZObu;
	}

// Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
// najmniejszym elementem3

	public static int roznicaNajwNajm(List<Integer> lista) {
		int min = lista.get(0);
		int max = lista.get(0);

		for (int i : lista) {
			if (i < min) {
				min = i;
			}
			if (i > max) {
				max = i;
			}
		}
		return max - min;
	}

// Napisz metode ktora przyjmuje liste Stringow i zwraca listê (intow) indeksow
// wszystkich elementow na liscie, ktore sa takie same jak parametr metody
// np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
// output: to 0,2,5

	public static List<Integer> indeksParametru(List<String> lista, String element) {
		List<Integer> indeksy = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(element)) {
				indeksy.add(i);
			}
		}
		return indeksy;
	}

// Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako
// parametr

	public static List<Integer> odwrotnaLista(List<Integer> lista) {
		List<Integer> odwrotna = new ArrayList<>();

		for (int i = lista.size()-1; i >= 0; i--) {
				odwrotna.add(lista.get(i));
								
		}
		return odwrotna;
	}
	// Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
	// metoda ma odwrocic liste, nie ma nic zwracac, nie mozna wykorzystywac innych list/tablic
	
	
	
	// majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
	// podana jako porametr
	
	// Wyœwietl ile razy ktorekolwiek imie zosta³o powtórzone Np dla imion ania piotr ania tomek krzys tomek ania program 
	// powinien wypisac 3, bo byly 3 potworki
	
	// Wyswietl ile razy we wszystkich imionach by³a u¿yta samog³oska
	
	//Napisz metodê która wyswietli unikalne imiona
	
	//Zwroc liste imion które sa dluzsze niz 5 znakow o parzystej dlugosci
	
	//Zwroc liczbe s³ow ktore sa zlozone z samych whitespaców np spacji  
	
	//Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
		//Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
		// Ania Krzys Tomek Kasia Jan
		// 4 2 5 8 3
		//Ania Tomek Jan
	

	// Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
	// sume dlugosci wszystkich Stringów
}
