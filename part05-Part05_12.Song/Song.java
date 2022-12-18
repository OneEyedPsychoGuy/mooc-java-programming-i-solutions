public class Song {
    private String artist;
    private String title;
    private int durationInSeconds;

    public Song(String artist, String title, int durationInSeconds) {
        this.artist = artist;
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }

        if(!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        return this.artist.equals(comparedSong.artist) &&
            this.title.equals(comparedSong.title) &&
            this.durationInSeconds == comparedSong.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.durationInSeconds + " s)";
    }
}