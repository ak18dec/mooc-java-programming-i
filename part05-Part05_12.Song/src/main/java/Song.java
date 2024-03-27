
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return durationInSeconds;
    }

    @Override
    public boolean equals(Object otherSong) {
        if(this == otherSong) return true;
        if(otherSong instanceof Song) {
            Song o = (Song) otherSong;
            if(this.artist.equals(o.getArtist()) && this.name.equals(o.getName()) && this.durationInSeconds == o.getDuration()) {
                return true;
            }
        }
        return false;
    }




}
