package examenArraysListas;

import java.util.*;

public class SpotifyAnalytics {

	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		
		
		List<String> topTen = new ArrayList<>(Arrays.asList("Flowers", "Last Night", "Anti-Hero", "Rich Flex", "As It Was", "Unholy", "About Damn Time", "Bad Habit", "Me Porto Bonito", "I'm Good (Blue)"));
		List<String> marc = new ArrayList<>(Arrays.asList("Flowers", "Anti-Hero", "Unholy", "Flowers", "Snap", "Somebody That I Used To Know", "Anti-Hero", "Flowers", "About Damn Time", "Shivers", "As It Was", "Flowers", "Bad Habit", "Snap", "Flowers", "Anti-Hero", "Flowers", "Rich Flex", "Somebody That I Used To Know", "As It Was"));
		List<String> alex = new ArrayList<>(Arrays.asList("Anti-Hero", "Rich Flex", "Shivers", "About Damn Time", "Snap", "Flowers", "Bad Habit", "As It Was", "Anti-Hero", "Rich Flex", "Somebody That I Used To Know", "Flowers", "Unholy", "Last Night", "Snap", "Me Porto Bonito", "Anti-Hero", "Flowers", "Shivers", "Bad Habit"));
		List<String> carmen = new ArrayList<>(Arrays.asList("Flowers", "I'm Good (Blue)", "Snap", "About Damn Time", "Somebody That I Used To Know", "Anti-Hero", "Flowers", "Bad Habit", "Shivers", "Last Night", "As It Was", "Flowers", "Rich Flex", "Snap", "Anti-Hero", "Unholy", "Flowers", "Me Porto Bonito", "Shivers", "I'm Good (Blue)"));
		List<String> dani = new ArrayList<>(Arrays.asList("As It Was", "Snap", "Flowers", "Last Night", "Somebody That I Used To Know", "Anti-Hero", "Rich Flex", "Flowers", "About Damn Time", "Bad Habit", "Shivers", "Snap", "Unholy", "As It Was", "Me Porto Bonito", "Flowers", "I'm Good (Blue)", "Anti-Hero", "Flowers", "Last Night"));
		Set<String> userSongs = new HashSet<>();
		
		for(int i = 0; i < topTen.size(); i++) {
			if(!topTen.contains(marc.get(i)) || !topTen.contains(alex.get(i)) || !topTen.contains(carmen.get(i)) || !topTen.contains(dani.get(i))) {
				userSongs.add(marc.get(i));
			}
		}
		System.out.println("--------------------------------------------");
		System.out.println("Cançons dels usuaris que NO estan al Top Ten");
		System.out.println(userSongs);
		System.out.println("--------------------------------------------");
		
		HashMap<String,Integer> lovedSongs = new HashMap<>();
		
		for(int i = 0; i < marc.size(); i++) {
			lovedSongs.put(marc.get(i), Collections.frequency(marc, marc.get(i)));
		}
		
		System.out.println(lovedSongs.toString());
		
	}

}
