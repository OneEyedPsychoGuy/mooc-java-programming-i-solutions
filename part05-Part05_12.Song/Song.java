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
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof Song)) {
            return false;
        }

        Song song = (Song) obj;

        return this.artist.equals(song.artist) &&
            this.title.equals(song.title) &&
            this.durationInSeconds == song.durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.durationInSeconds + " s)";
    }
}