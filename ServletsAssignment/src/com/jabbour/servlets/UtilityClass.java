package com.jabbour.servlets;

import java.util.HashMap;

public class UtilityClass {

	private String[] songs = {"Danger Zone", "Shortest Straw", "Symphony of Destruction", "Shadow Moses"};
	private String[] artists = {"Kenny Loggins", "Metallica", "Megadeth", "Bring Me The Horizon"};
	private HashMap<String, String> favoritesongs = new HashMap<>();

	public HashMap<String, String> loadMap() {
		for(int i = 0; i < songs.length; i++)
		{
			favoritesongs.put(songs[i], artists[i]);
		}		
		return favoritesongs;
	}
}
