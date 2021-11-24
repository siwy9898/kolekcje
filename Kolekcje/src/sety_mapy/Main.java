package sety_mapy;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// Sety - przyjmuja tylko unikalne elementy

		// HashSet
		// Zbior nieuporzadkowany, akceptuje wartosci null

		Set<Integer> hashSet = new HashSet<>();
		hashSet.addAll(Arrays.asList(3, 5, 4, -3, 5, 5, 8, 1, 0));
		System.out.println(hashSet);

		// LinkedHashSet
		// zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
		// wartosci null

		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(Arrays.asList(3, 5, 7, 3, 5, 4, null, 3, 2));
		System.out.println(linkedHashSet);

		// TreeSet
		// Sortuje elementy w secie, ale nie akceptuje wartosci null
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.addAll(Arrays.asList(2, 13, 5, 3, 6, 3, 7));
		System.out.println(treeSet);

		// HashMap
		// nie gwarantuje zachowania zadnej kolejscnoi, akceptuje wartosci null
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("jeden", 1);
		hashMap.put("cztery", 4);
		hashMap.put("dwa", 2);
		hashMap.put("trzy", 3);
		System.out.println(hashMap);

		// LinkedHashMap
		// zachowuje kolejnosc elementow zgodna z kolejnoscia dodawania,akceptuje
		// wartosci null

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("jeden", 1);
		linkedHashMap.put("cztery", 4);
		linkedHashMap.put("dwa", 2);
		linkedHashMap.put("trzy", 3);
		System.out.println(linkedHashMap);

		// TreeMap
		// Sortuje elementy po kluczach, ale nie akceptuje wartosci null
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("jeden", 1);
		treeMap.put("cztery", 4);
		treeMap.put("dwa", 2);
		treeMap.put("trzy", 3);
		System.out.println(treeMap);
		
		System.out.println("Get or default: " + treeMap.getOrDefault("asdasd", 0));

		// zwraca wartoc dla danego klucza
		System.out.println(treeMap.get("jeden"));

		// keySet() values() zwracaja odpowiednio set kluczy i set wartosci
		System.out.println(treeMap.keySet());
		System.out.println(treeMap.values());

		// containsKey() containsValue()
		System.out.println(treeMap.containsKey("jeden"));
		System.out.println(treeMap.containsValue(5));

		// replace(i,j)
		treeMap.put("jeden", 11);
		System.out.println(treeMap);

		for (Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Stwórz set Stringów, dodaj jakies elementy, zrob tak zeby wyswietlic je w
		// kolejnosci rosnacej,

		Set<String> setStringow = new TreeSet<>();
		setStringow.addAll(Arrays.asList("Ala", "Kasia", "Tomek"));
		System.out.println(setStringow);

		// Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala
		// mape za pomoca Entry

		Map<String, String> mapaStringow = new LinkedHashMap<>();
		mapaStringow.put("jeden", "jeden");
		mapaStringow.put("dwa", "dwa");
		mapaStringow.put("trzy", "trzy");

		for (Entry<String, String> entry : mapaStringow.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// Dodaj do mapy 4 slowa jako klucze, niech wartoscia bedzie dlugosc kazdego ze
		// slow

		Map<String, Integer> slowaDlugosc = new LinkedHashMap<>();

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			String str = scan.nextLine();

			slowaDlugosc.put(str, str.length());
		}
	}
	// Napisz metoda która dodaje s³owa do mapy. Kluczem maja byc kolejen liczby
	// naturalne zaczynajac od 0
	public static void slowaDoMapy (Map<Integer, String> mapa, String slowo) {
		 mapa.put(mapa.size(), slowo);
	}
	
	// Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
	// wyswietlic ile razy jaki element byl dodany
	// pies kot pies ryba kot pies
	// pies 3, ryba 1, kot 2
	public static void ileRazy (Map<String, Integer> mapa, String slowo) {
		mapa.put(slowo, mapa.getOrDefault(slowo, 0) + 1);
	}
	
	
	// Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45
	
	// napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
	// klucze sa parzystych wartosci
	// na s³owo "parzyste"
	
	// Napisz program, ktory symuluje dzialanie slownika
	// polsko-angielskiego. Przyk³adowy program: Podaj slowko po Polsku: mama Slowko
	// po Angielsku to mother. Program dziala dopoki uzytkownik nie zrezygnuje
	// (cancel)
	
	// W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listê osób
		// (same nazwiska jako Stringi) które uczeszczaja do klasy.
		// 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
		// 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas

}
