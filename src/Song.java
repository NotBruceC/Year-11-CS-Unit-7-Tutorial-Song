
import java.util.ArrayList;


public class Song {

    private String title;
    private String artist;

    private ArrayList<String> listeners;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.listeners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> newListeners) {
        int newListenerCount = 0;
        for (String newListener : newListeners) {
            boolean isNewListener = true;
            String lowerListener = newListener.toLowerCase();
            for (String listener : listeners) {
                if (listener.toLowerCase().equals(lowerListener)) {
                    isNewListener = false;
                    break;
                }
            }


            if (isNewListener) {
                listeners.add(lowerListener);
                newListenerCount++;
            }
        }
        return newListenerCount;
    }

/*

The method takes an array of people who have listened to the song that day.
The output should be how many new listeners the song gained on that day out of all listeners.
Names should be treated in a case-insensitive manner, i.e. "John" is the same as "john".

Example Song mountMoose = new Song("Mount Moose", "The Snazzy Moose");

// day 1 (or test 1) mountMoose.howMany(new ArrayList(Arrays.asList("John", "Fred", "BOb", "carl", "RyAn"))); => 5 // These are all new since they are the first listeners.
*/




}
