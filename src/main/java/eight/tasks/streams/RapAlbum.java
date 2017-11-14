package eight.tasks.streams;

import static util.Constants.RAP_ALBUM_TO_STRING;

public class RapAlbum {

    private String artist;
    private String album;
    private int releaseYear;

    public RapAlbum(String artist, String album, int releaseYear) {
        this.artist = artist;
        this.album = album;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RapAlbum rapAlbum = (RapAlbum) o;

        return releaseYear == rapAlbum.releaseYear &&
                (artist != null ? artist.equals(rapAlbum.artist) : rapAlbum.artist == null) &&
                (album != null ? album.equals(rapAlbum.album) : rapAlbum.album == null);
    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + releaseYear;
        return result;
    }

    @Override
    public String toString() {

        return String.format(RAP_ALBUM_TO_STRING, artist, album, releaseYear);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
