package exercise.ktv;

import java.util.ArrayList;

public class MusicPlayer {
    private int numOfSong;
    private ArrayList<String> musicList;
    private int nextMusic = 0;

    public MusicPlayer(String[] music) {
        System.out.println("\ncreate a music player");
        //todo add your code here
    }


    public int getNumOfSong() {
        //todo add your code here
        return -1;
    }

    /**
     * show all music line by line, add symbol >> in the music that the player will play next
     */
    public void displayAllMusic() {
        System.out.println("\nall music:");
        //todo add your code here
    }

    /**
     *  musicList cannot contain more than 100 music
     *  first check if the newMusic is in the current musicList,
     *  if yes, return false
     *  else add it to the end of the musicList and return true
     */
    public boolean addMusic(String newMusic) {
        System.out.println("\nadd music: \"" + newMusic + "\" to the end of list");
        //todo add your code here
        return true;
    }

    /**
     *  musicList cannot contain more than 100 music
     *  if that music is already in the music list return false, do nothing
     *  add the new music in specify position,
     *  if that position is invalid, return false
     */
    public boolean addMusic(String newMusic, int pos) {
        System.out.println("\nadd music: \"" + newMusic + "\" to the list at position: " + pos);
        //todo add your code here
        return true;
    }

    /**
     *  remove a music from the musicList, if no such music in musicList, no nothing
     */
    public void removeMusic(String music) {
        System.out.println("\nremove music: " + music);
        //todo add your code here
    }

    /**
     * print "now playing " + {the name of the next music} and return true,
     * if no next music, print "no more music" and return false
     */
    public boolean playOneMusic() {
        //todo add your code here
        return true;
    }

    /**
     * skip the next music in the music list, if no music can be skip, print "no more music"
     */
    public void skip() {
        System.out.println("\nskip");
        //todo add your code here
    }

    /**
     * go back to the previous music in the music list, if no previous music, print "this is the first music already"
     */
    public void rewind() {
        System.out.println("\nrewind");
        //todo add your code here
    }

    /**
     *  do rewind for multiple times
     */
    public void rewind(int times) {
        //todo add your code here
    }

    /**
     * play all the music
     */
    public void playAllMusic(){
        //todo add your code here
    }

}
