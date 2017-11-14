package eight.tasks.streams;

import java.util.Optional;

import static eight.tasks.streams.ListOfRapAlbums.*;
import static util.Constants.NOTORIOUS_BIG;

public class OptionalClassTask {

    public static Optional<RapAlbum> getAnyAlbumByNotoriousBIG() {
        return getListWithTopTenRapAlbums().stream()
                .filter(rapAlbum -> rapAlbum.getArtist().contains(NOTORIOUS_BIG))
                .findAny();
    }

}
