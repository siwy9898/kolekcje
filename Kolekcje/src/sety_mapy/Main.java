package sety_mapy;

import java.security.DrbgParameters.NextBytes;
import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
//		// Sety - przyjmuja tylko unikalne elementy
//
//		// HashSet
//		// Zbior nieuporzadkowany, akceptuje wartosci null
//
//		Set<Integer> hashSet = new HashSet<>();
//		hashSet.addAll(Arrays.asList(3, 5, 4, -3, 5, 5, 8, 1, 0));
//		System.out.println(hashSet);
//
//		// Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb
//		// 1-45
//
//		Set<Integer> wynikLotka = new HashSet<>();
//		Random generator = new Random();
//
//		for (int i = 0; i < 6; i++) {
//			wynikLotka.add(generator.nextInt(44) + 1);
//		}
//
//		for (int i : wynikLotka) {
//			System.out.println("Lotek " + i);
//		}
//
//		// LinkedHashSet
//		// zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
//		// wartosci null
//
//		Set<Integer> linkedHashSet = new LinkedHashSet<>();
//		linkedHashSet.addAll(Arrays.asList(3, 5, 7, 3, 5, 4, null, 3, 2));
//		System.out.println(linkedHashSet);
//
//		// TreeSet
//		// Sortuje elementy w secie, ale nie akceptuje wartosci null
//		Set<Integer> treeSet = new TreeSet<>();
//		treeSet.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
//		System.out.println(treeSet);
//
//		// HashMap
//		// nie gwarantuje zachowania zadnej kolejscnoi, akceptuje wartosci null
//		Map<String, Integer> hashMap = new HashMap<>();
//		hashMap.put("jeden", 1);
//		hashMap.put("cztery", 4);
//		hashMap.put("dwa", 2);
//		hashMap.put("trzy", 3);
//		System.out.println(hashMap);
//
//		// LinkedHashMap
//		// zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
//		// wartosci null
//
//		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
//		linkedHashMap.put("jeden", 1);
//		linkedHashMap.put("cztery", 4);
//		linkedHashMap.put("dwa", 2);
//		linkedHashMap.put("trzy", 3);
//		System.out.println(linkedHashMap);
//
//		// TreeMap
//		// Sortuje elementy po kluczach, ale nie akceptuje wartosci null
		Map<String, Integer> treeMap = new LinkedHashMap<>();
		treeMap.put("jeden", 1);
		treeMap.put("cztery", 4);
		treeMap.put("dwa", 2);
		treeMap.put("trzy", 3);
//		System.out.println(treeMap);
//
//		Map<Integer, String> mapaImion = new HashMap<>();
//		mapaImion.put(4, "adam");
//		mapaImion.put(2, "adam");
//		mapaImion.put(22, "adam");
//		mapaImion.put(3, "adam");
//		mapaImion.put(7, "adam");
//		mapaImion.put(14, "adam");
//
//		parzysteNaParzyste(mapaImion);
//		System.out.println("------------------");
//		System.out.println(mapaImion);
//		System.out.println("------------------");
//		System.out.println("Get or default: " + treeMap.getOrDefault("trzy", 0));
//
//		// zwraca wartoc dla danego klucza
//		System.out.println(treeMap.get("jeden"));
//
//		// keySet() values() zwracaja odpowiednio set kluczy i set wartosci
//		System.out.println(treeMap.keySet());
//		System.out.println(treeMap.values());
//
//		// containsKey() containsValue()
//		System.out.println(treeMap.containsKey("jeden"));
//		System.out.println(treeMap.containsValue(5));
//
//		// replace(i,j)
//		treeMap.put("jeden", 11);
//		System.out.println(treeMap);
//
		for (Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
//
//		// Stwórz set Stringów, dodaj jakies elementy, zrob tak zeby wyswietlic je w
//		// kolejnosci rosnacej,
//
//		Set<String> setStringow = new TreeSet<>();
//		setStringow.addAll(Arrays.asList("Ala", "Kasia", "Tomek"));
//		System.out.println(setStringow);
//
//		// Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala
//		// mape za pomoca Entry
//
//		Map<String, String> mapaStringow = new LinkedHashMap<>();
//		mapaStringow.put("jeden", "jeden");
//		mapaStringow.put("dwa", "dwa");
//		mapaStringow.put("trzy", "trzy");
//
//		for (Entry<String, String> entry : mapaStringow.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//
//		// Dodaj do mapy 4 slowa jako klucze, niech wartoscia bedzie dlugosc kazdego ze
//		// slow
//
//		Map<String, Integer> slowaDlugosc = new LinkedHashMap<>();
//
		Scanner scan = new Scanner(System.in);
//
//		for (int i = 0; i < 4; i++) {
//			String str = scan.nextLine();
//
//			slowaDlugosc.put(str, str.length());
//		}

		// Napisz program, ktory symuluje dzialanie slownika
		// polsko-angielskiego. Przyk³adowy program: Podaj slowko po Polsku: mama Slowko
		// po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
		// (cancel)
		Map<String, String> slownik = new LinkedHashMap<>();
		slownik.put("mama", "mother");
		slownik.put("tata", "father");
		slownik.put("brat", "brother");
		slownik.put("siostra", "sister");

		String slowoPoPolsku = "";

//		do {
//			System.out.println("Podaj slowo po polsku:");
//			slowoPoPolsku = scan.nextLine();
//			if (slownik.containsKey(slowoPoPolsku)) {
//				System.out.println("Slowo po angielsku to: " + slownik.get(slowoPoPolsku));
//
//			} else {
//				System.out.println("Brak slowa w slowniku.");
//			}
//
//		}
//		while (!slowoPoPolsku.equals("cancel"));

		// public static void nazwiskaWKlasach (Map<String, List<String>> mapa, String
		// klasa) {

		Map<String, List<String>> listaNazwisk = new TreeMap<>();
		listaNazwisk.put("1A", List.of("Kowalski", "Nowak", "Jakubowicz"));
		listaNazwisk.put("2A", List.of("Balawarczyk", "Stosio", "Kutasio"));
		listaNazwisk.put("3A", List.of("Mokebe", "Smith", "Chujewicz"));

		System.out.println(najdluzszeNazwiskoWKlasie(listaNazwisk, "1A"));
		System.out.println();
		najdluzszeWSzkole(listaNazwisk);
	}
	
	// 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej
	// klasy

	public static String najdluzszeNazwiskoWKlasie(Map<String, List<String>> lista, String oddzial) {
		String najdluzsze = "";
		String imie = "";

		for (int i = 0; i < lista.get(oddzial).size(); i++) {
			imie = lista.get(oddzial).get(i);
			if (imie.length() > najdluzsze.length()) {
				najdluzsze = imie;
			}

		}
		return najdluzsze;
	}

	// 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas

	public static void najdluzszeWSzkole(Map<String, List<String>> lista) {
		String najdluzsze = "";
		String imie = "";
		String oddzial = "";

		for (Entry<String, List<String>> entry : lista.entrySet()) {
			
			oddzial = entry.getKey();
			for (int i = 0; i < lista.get(oddzial).size(); i++) {
				imie = lista.get(oddzial).get(i);
				if (imie.length() > najdluzsze.length()) {
					najdluzsze = imie;
					System.out.println(najdluzsze);
				}

			}
		}
	}

	// Napisz metoda która dodaje s³owa do mapy. Kluczem maja byc kolejen liczby
	// naturalne zaczynajac od 0
	public static void slowaDoMapy(Map<Integer, String> mapa, String slowo) {
		mapa.put(mapa.size(), slowo);
	}

	// Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
	// wyswietlic ile razy jaki element byl dodany
	// pies kot pies ryba kot pies
	// pies 3, ryba 1, kot 2
	public static void ileRazy(Map<String, Integer> mapa, String slowo) {
		mapa.put(slowo, mapa.getOrDefault(slowo, 0) + 1);
	}

	// napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
	// klucze sa parzystych wartosci
	// na s³owo "parzyste"

	public static void parzysteNaParzyste(Map<Integer, String> mapa) {

		for (Entry<Integer, String> entry : mapa.entrySet()) {
			if (entry.getKey() % 2 == 0) {
				mapa.replace(entry.getKey(), "parzysta");
			}
		}

	}

}
// W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listê osób
// (same nazwiska jako Stringi) które uczeszczaja do klasy.


