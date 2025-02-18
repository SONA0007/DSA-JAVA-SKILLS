package com.HashMap;
import java.util.HashMap;
public class MusicExample {
    public static void main(String[] args) {
        // Creating a HashMap to store artist and song mappings
        HashMap<String, String> artistToSong = new HashMap<>();
        HashMap<Integer, String> artists = new HashMap<>();
        // Adding some artist-song pairs
        artistToSong.put("Taylor Swift", "Love Story");
        artistToSong.put("Ed Sheeran", "Shape of You");
        artistToSong.put("Adele", "Hello");
        artistToSong.put("The Beatles", "Hey Jude");
        artists.put(4, "Sonal");
        artists.put(3, "Soma");

        System.out.println("Artists name and Id : ");
        for (Integer key : artists.keySet()) {
            System.out.println("Id of the artist " + key + " Name of the artist - " + artists.get(key));
        }
        // Retrieving and printing a song by a specific artist
        String artist = "Adele";
        System.out.println("Popular song by " + artist + ": " + artistToSong.get(artist));

        // Checking if an artist exists
        if (artistToSong.containsKey("Ed Sheeran")) {
            System.out.println("Ed Sheeran's song is in the collection.");
        }
        // Checking if a song exists
        if (artistToSong.containsValue("Hey Jude")) {
            System.out.println("\"Hey Jude\" is in the collection.");
        }
        // Removing an artist from the HashMap
        String removedArtist = "The Beatles";
        artistToSong.remove(removedArtist);
        System.out.println(removedArtist + " has been removed from the collection.");

        // Displaying the entire collection
        System.out.println("Cur" +
                "rent artist-song collection:");
        for (String key : artistToSong.keySet()) {
            System.out.println(key + " -> " + artistToSong.get(key));
        }
    }
}