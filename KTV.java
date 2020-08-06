package exercise;

public class KTV {
    public static void main(String[] args) {
        String[] song = {"fade", "alone", "let you love me", "sorry", "walk my home",
                "my heart will go on", "shake if off", "one more night", "the greatest love of all",
                "yellow lemon tree", "you raise me up"};

        MusicPlayer musicPlayer = new MusicPlayer(song);
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.skip();
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.rewind();
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.playOneMusic();
        musicPlayer.displayAllMusic();


        System.out.println("can I add music \"alone\"? " + musicPlayer.addMusic("alone"));
        musicPlayer.displayAllMusic();

        System.out.println("can I add music \"shape of you\"? " + musicPlayer.addMusic("shape of you"));
        musicPlayer.displayAllMusic();

        System.out.println("the player contain " + musicPlayer.getNumOfSong() + " musics");

        musicPlayer.removeMusic("alone");
        musicPlayer.displayAllMusic();

        musicPlayer.removeMusic("oh my god");
        musicPlayer.displayAllMusic();

        musicPlayer.removeMusic("you raise me up");
        musicPlayer.displayAllMusic();

        System.out.println("\n\nthe player contain " + musicPlayer.getNumOfSong() + " musics");
        musicPlayer.displayAllMusic();

        musicPlayer.rewind();
        musicPlayer.playAllMusic();
        musicPlayer.displayAllMusic();

        musicPlayer.rewind(7);
        musicPlayer.displayAllMusic();

        musicPlayer.addMusic("miss you finally", 8);
        musicPlayer.displayAllMusic();

        musicPlayer.addMusic("dream dream dream", 0);
        musicPlayer.displayAllMusic();

    }
}
