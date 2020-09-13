package exercise.ktvAns;

import java.util.ArrayList;

public class MusicPlayer {
    private int numOfSong;
    private ArrayList<String> musicList;
    private int nextMusic = 0;

    public MusicPlayer(String[] music) {
        System.out.println("\ncreate a music player");
        //todo add your code here
        musicList = new ArrayList<>();
        for (String m : music) {
            musicList.add(m);
        }
        numOfSong = musicList.size();
    }


    public int getNumOfSong() {
        //todo add your code here
        return numOfSong;
    }

    /**
     * show all music line by line, add symbol >> in the music that the player will play next
     */
    public void displayAllMusic() {
        System.out.println("\nall music:");
        //todo add your code here
        for (int i = 0; i < musicList.size(); i++) {
            if (i == nextMusic) {
                System.out.print(">> ");
            } else {
                System.out.print("   ");
            }
            System.out.println(musicList.get(i));
        }
        System.out.println();
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
        if (musicList.contains(newMusic) || musicList.size() > 99) {
            return false;
        }
        musicList.add(newMusic);
        numOfSong++;
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
        if (musicList.contains(newMusic) || musicList.size() > 99) {
            return false;
        }
        if (pos < nextMusic) {
            nextMusic++;
        }
        musicList.add(pos, newMusic);
        numOfSong++;
        return true;
    }

    /**
     *  remove a music from the musicList, if no such music in musicList, no nothing
     */
    public void removeMusic(String music) {
        System.out.println("\nremove music: " + music);
        //todo add your code here
        int index = musicList.indexOf(music);
        if (index == -1) {
            return;
        }

        if (index < nextMusic) {
            nextMusic--;
        }
        numOfSong--;
        musicList.remove(music);
    }

    /**
     * print "now playing " + {the name of the next music} and return true,
     * if no next music, print "no more music" and return false
     */
    public boolean playOneMusic() {
        //todo add your code here
        if (nextMusic == numOfSong) {
            System.out.println("no more music");
            return false;
        }
        System.out.println("now playing " + musicList.get(nextMusic++));
        return true;
    }

    /**
     * skip the next music in the music list, if no music can be skip, print "no more music"
     */
    public void skip() {
        System.out.println("\nskip");
        //todo add your code here
        if (nextMusic == numOfSong) {
            System.out.println("no more music");
        } else {
            nextMusic++;
        }
    }

    /**
     * go back to the previous music in the music list, if no previous music, print "this is the first music already"
     */
    public void rewind() {
        System.out.println("\nrewind");
        //todo add your code here
        if (nextMusic == 0) {
            System.out.println("this is the first music already");
        } else {
            nextMusic--;
        }
    }

    /**
     *  do rewind for multiple times
     */
    public void rewind(int times) {
        //todo add your code here
        for (int i = 0; i < times; i++) {
            rewind();
        }
    }

    /**
     * play all the music
     */
    public void playAllMusic(){
        //todo add your code here
        while (playOneMusic()) {}
    }

}
